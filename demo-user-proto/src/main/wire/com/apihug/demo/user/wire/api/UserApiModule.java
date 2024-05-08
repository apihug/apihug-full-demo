package com.apihug.demo.user.wire.api;

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
    artifact.setVersion("0.1.2-RELEASE");
    ProjectStatus status = new ProjectStatus();
    project.setStatus(status);
    status.setCreatedTimestamp("2024-02-29");
    status.setCreatedBy("dell");
    ProjectAuthority authority = new ProjectAuthority();
    project.setAuthority(authority);
    authority.setEnumClass("com.apihug.demo.user.wire.infra.settings.UserAuthorityEnum");
    authority.setCodePrefix(10240000L);
    ProjectPersistence persistence = new ProjectPersistence();
    project.setPersistence(persistence);
    persistence.setIdentifyType(ProjectPersistence.Type.LONG);
    persistence.setTenantType(ProjectPersistence.Type.STRING);
    persistence.setFormat(ProjectPersistence.Format.CAMEL);
    persistence.setUpper(ProjectPersistence.Upper.DEFAULT);
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
    return "0.1.2-RELEASE";
  }
}
