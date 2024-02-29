package com.apihug.demo.user.wire.api;

import hope.common.meta.artifact.Artifact;
import hope.common.meta.project.Project;
import hope.common.meta.project.ProjectStatus;
import hope.common.service.Module;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
public class UserApiModule implements Module<UserApiCollector> {
  protected final Project project;

  protected final UserApiCollector api;

  public UserApiModule() {
    project =  new Project();
    api =  new UserApiCollector();
    project.setName("demo-user-proto");
    project.setDescription("proto lib of  user management module");
    project.setDomain("user");
    project.setPackageName("com.apihug.demo.user");
    project.setApplication("demo-user");
    project.setIdentifier("demo-user-proto");
    Artifact artifact = new Artifact();
    project.setArtifact(artifact);
    artifact.setArtifactId("demo-user-proto");
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
  public UserApiCollector service() {
    return api;
  }

  @Override
  public String version() {
    return "0.1.1-SNAPSHOT";
  }
}
