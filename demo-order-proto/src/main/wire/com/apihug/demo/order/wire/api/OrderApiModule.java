package com.apihug.demo.order.wire.api;

import hope.common.meta.artifact.Artifact;
import hope.common.meta.project.Project;
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
    artifact.setVersion("0.1.1-SNAPSHOT");
    ProjectStatus status = new ProjectStatus();
    project.setStatus(status);
    status.setCreatedTimestamp("2024-02-29");
    status.setCreatedBy("dell");
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
    return "0.1.1-SNAPSHOT";
  }
}
