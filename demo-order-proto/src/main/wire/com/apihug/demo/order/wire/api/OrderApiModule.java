package com.apihug.demo.order.wire.api;

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
public class OrderApiModule implements Module<OrderApiCollector> {
  protected final Project project;

  protected final OrderApiCollector api;

  public OrderApiModule() {
    project =  new Project();
    api =  new OrderApiCollector();
    project.setName("demo-order-proto");
    project.setDescription("proto lib of  demo for api hug framework and tools");
    project.setDomain("order");
    project.setPackageName("com.apihug.demo.order");
    project.setApplication("demo-order");
    project.setIdentifier("demo-order-proto");
    Artifact artifact = new Artifact();
    project.setArtifact(artifact);
    artifact.setArtifactId("demo-order-proto");
    artifact.setGroupId("com.apihug");
    artifact.setVersion("0.1.2-RELEASE");
    ProjectStatus status = new ProjectStatus();
    project.setStatus(status);
    status.setCreatedTimestamp("2024-02-29");
    status.setCreatedBy("dell");
    ProjectAuthority authority = new ProjectAuthority();
    project.setAuthority(authority);
    authority.setEnumClass("com.apihug.demo.order.wire.infra.settings.OrderAuthorityEnum");
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
  public OrderApiCollector service() {
    return api;
  }

  @Override
  public String version() {
    return "0.1.2-RELEASE";
  }
}
