package com.apihug.demo.inventory.wire.api;

import hope.common.meta.artifact.Artifact;
import hope.common.meta.project.Project;
import hope.common.meta.project.ProjectAuthority;
import hope.common.meta.project.ProjectPersistence;
import hope.common.meta.project.ProjectStatus;
import hope.common.service.Module;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
public class InventoryApiModule implements Module<InventoryApiCollector> {
  protected final Project project;

  protected final InventoryApiCollector api;

  public InventoryApiModule() {
    project =  new Project();
    api =  new InventoryApiCollector();
    project.setName("demo-inventory-proto");
    project.setDescription("proto lib of  inventory control module");
    project.setDomain("inventory");
    project.setPackageName("com.apihug.demo.inventory");
    project.setApplication("demo-inventory");
    project.setIdentifier("demo-inventory-proto");
    Artifact artifact = new Artifact();
    project.setArtifact(artifact);
    artifact.setArtifactId("demo-inventory-proto");
    artifact.setGroupId("com.apihug");
    artifact.setVersion("0.1.2-RELEASE");
    ProjectStatus status = new ProjectStatus();
    project.setStatus(status);
    status.setCreatedTimestamp("2024-02-29");
    status.setCreatedBy("dell");
    ProjectAuthority authority = new ProjectAuthority();
    project.setAuthority(authority);
    authority.setEnumClass("com.apihug.demo.inventory.wire.infra.settings.InventoryAuthorityEnum");
    authority.setCodePrefix(10240000L);
    ProjectPersistence persistence = new ProjectPersistence();
    project.setPersistence(persistence);
    persistence.setIdentifyType(ProjectPersistence.Type.LONG);
    persistence.setTenantType(ProjectPersistence.Type.LONG);
    persistence.setFormat(ProjectPersistence.Format.DEFAULT);
    persistence.setUpper(ProjectPersistence.Upper.DEFAULT);
  }

  @Override
  public Project project() {
    return project;
  }

  @Override
  public InventoryApiCollector service() {
    return api;
  }

  @Override
  public String version() {
    return "0.1.2-RELEASE";
  }
}
