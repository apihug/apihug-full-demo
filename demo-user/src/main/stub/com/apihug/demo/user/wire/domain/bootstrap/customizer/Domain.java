package com.apihug.demo.user.wire.domain.bootstrap.customizer;

import static jakarta.persistence.GenerationType.IDENTITY;

import hope.common.persistence.annotations.Description;
import hope.common.spring.data.persistence.wire.*;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.relational.core.mapping.InsertOnlyProperty;

/**
 * Base class for this domain entities.
 * As this domain's entity naming strategy not compatible with common {@link hope.common.spring.data.persistence.Domain}
 *
 * @see hope.common.spring.data.persistence.Domain
 */
@MappedSuperclass
public abstract class Domain<T extends Domain, Identify, Tenant>
        implements Auditable<T, Identify>,
        Deletable<T, Identify>,
        Identifiable<T>,
        Versionable<T>,
        Tenantable<T, Tenant> {

    @Id
    @org.springframework.data.annotation.Id
    @Column(nullable = false, updatable = false, name = "id", unique = true)
    @org.springframework.data.relational.core.mapping.Column("id")
    @GeneratedValue(strategy = IDENTITY)
    @Description("Record ID")
    public Long id;

    @Column(nullable = false, updatable = false, name = "createdAt")
    @org.springframework.data.relational.core.mapping.Column("createdAt")
    @CreatedDate
    @Description("Record created time")
    @InsertOnlyProperty
    public LocalDateTime createdAt;

    @Column(name = "createdBy")
    @org.springframework.data.relational.core.mapping.Column("createdBy")
    @CreatedBy
    @Description("Record created by")
    @InsertOnlyProperty
    public Identify createdBy;

    @Column(nullable = false, name = "updatedAt")
    @org.springframework.data.relational.core.mapping.Column("updatedAt")
    @LastModifiedDate
    @Description("Record updated time")
    public LocalDateTime updatedAt;

    @Column(name = "updatedBy")
    @org.springframework.data.relational.core.mapping.Column("updatedBy")
    @LastModifiedBy
    @Description("Record updated by")
    public Identify updatedBy;

    @Column(nullable = false, name = "version")
    @org.springframework.data.relational.core.mapping.Column("version")
    @Description("Record version")
    @Version
    public Long version;

    @Column(nullable = false, name = "deleted")
    @org.springframework.data.relational.core.mapping.Column("deleted")
    @Description("Record deleted flag")
    public Boolean deleted = false;

    @Column(nullable = true, name = "deletedAt")
    @org.springframework.data.relational.core.mapping.Column("deletedAt")
    @Description("Record deleted time")
    public LocalDateTime deletedAt;

    @Column(nullable = false, name = "deletedBy")
    @org.springframework.data.relational.core.mapping.Column("deletedBy")
    @Description("Record deleted by")
    public Identify deletedBy;

    @Column(nullable = false, name = "tenantId", updatable = false)
    @org.springframework.data.relational.core.mapping.Column("tenantId")
    @Description("Record tenant ID")
    @InsertOnlyProperty
    public Tenant tenantId;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public T setId(Long id) {
        this.id = id;
        return (T) this;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public T setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return (T) this;
    }

    @Override
    public Identify getCreatedBy() {
        return createdBy;
    }

    @Override
    public T setCreatedBy(Identify createdBy) {
        this.createdBy = createdBy;
        return (T) this;
    }

    @Override
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public T setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return (T) this;
    }

    @Override
    public Long getVersion() {
        return version;
    }

    @Override
    public T setVersion(Long version) {
        this.version = version;
        return (T) this;
    }

    @Override
    public Identify getUpdatedBy() {
        return updatedBy;
    }

    @Override
    public T setUpdatedBy(Identify updatedBy) {
        this.updatedBy = updatedBy;
        return (T) this;
    }

    @Override
    public Boolean isDeleted() {
        return deleted;
    }

    @Override
    public T setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return (T) this;
    }

    @Override
    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    @Override
    public T setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
        return (T) this;
    }

    @Override
    public Identify getDeletedBy() {
        return deletedBy;
    }

    @Override
    public T setDeletedBy(Identify deletedBy) {
        this.deletedBy = deletedBy;
        return (T) this;
    }

    @Override
    public Tenant getTenantId() {
        return tenantId;
    }

    public T setTenantId(Tenant tenantId) {
        this.tenantId = tenantId;
        return (T) this;
    }
}