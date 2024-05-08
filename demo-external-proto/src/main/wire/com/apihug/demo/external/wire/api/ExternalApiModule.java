package com.apihug.demo.external.wire.api;

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
public class ExternalApiModule implements Module<ExternalApiCollector> {
  protected final Project project;

  protected final ExternalApiCollector api;

  public ExternalApiModule() {
    project =  new Project();
    api =  new ExternalApiCollector();
    project.setName("demo-external-proto");
    project.setDescription("proto lib of  how to wire all the stuff together");
    project.setDomain("external");
    project.setPackageName("com.apihug.demo.external");
    project.setApplication("demo-external");
    project.setIdentifier("demo-external-proto");
    Artifact artifact = new Artifact();
    project.setArtifact(artifact);
    artifact.setArtifactId("demo-external-proto");
    artifact.setGroupId("com.apihug");
    artifact.setVersion("0.1.2-RELEASE");
    ProjectStatus status = new ProjectStatus();
    project.setStatus(status);
    status.setCreatedTimestamp("2024-02-29");
    status.setCreatedBy("dell");
    ProjectAuthority authority = new ProjectAuthority();
    project.setAuthority(authority);
    authority.setEnumClass("com.apihug.demo.external.wire.infra.settings.ExternalAuthorityEnum");
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
  public ExternalApiCollector service() {
    return api;
  }

  @Override
  public String version() {
    return "0.1.2-RELEASE";
  }
}
