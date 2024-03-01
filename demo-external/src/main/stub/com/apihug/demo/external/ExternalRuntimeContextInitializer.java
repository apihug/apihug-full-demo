package com.apihug.demo.external;

import com.apihug.demo.external.wire.api.ExternalApiModule;
import hope.common.Builder;
import hope.common.meta.artifact.Artifact;
import hope.common.meta.cloud.Dependency;
import hope.common.meta.project.Project;
import hope.common.meta.project.ProjectStub;
import hope.common.runtime.RuntimeContext;
import hope.common.spring.RuntimeContextInitializer;
import java.lang.Override;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Component
@Generated("H.O.P.E. Infra Team")
public class ExternalRuntimeContextInitializer extends RuntimeContextInitializer {
  @Override
  protected void init() {
    RuntimeContext runTimeCtx = RuntimeContext.INSTANCE;
    runTimeCtx.setDomain("external");
    runTimeCtx.setProto(new ExternalApiModule().project());
    runTimeCtx.setProject(new Builder<Project>() {
      @Override
      public Project build() {
        Project res  = new Project();
        res.setName("demo-external");
        res.setDescription("how to wire all the stuff together");
        res.setPackageName("com.apihug.demo.external");
        res.setArtifact(new Builder<Artifact>() {
          @Override
          public Artifact build() {
            Artifact res  = new Artifact();
            res.setGroupId("com.apihug");
            res.setArtifactId("demo-external");
            res.setVersion("0.1.1-RELEASE");
            return res;
          }
        }.build());
        ProjectStub stub  = new ProjectStub();
        Dependency dependency  = new Dependency();
        stub.setProto(dependency);
        dependency.setArtifact(new Builder<Artifact>() {
          @Override
          public Artifact build() {
            Artifact res  = new Artifact();
            res.setGroupId("com.apihug");
            res.setArtifactId("demo-external-proto");
            res.setVersion("0.1.1-SNAPSHOT");
            return res;
          }
        }.build());
        res.setStub(stub);
        return res;
      }
    }.build());
    runTimeCtx.setStubBuildTime("2024-02-29 18:00:27");
  }
}
