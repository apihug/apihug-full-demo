package com.apihug.demo.order.wire.api;

import hope.common.meta.project.ProjectIdentify;
import hope.common.service.Module;
import hope.common.service.WireServiceLocator;
import java.util.HashSet;
import javax.annotation.Generated;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Generated("H.O.P.E. Infra Team")
public class OrderApiModuleTester {
  @Test
  public void _test_OrderApiModule() {
    ProjectIdentify project =  new ProjectIdentify("order", "demo-order-proto");
    // This test work as Guardian of the consistent of the wire framework
    // generated very first time, force all developers follow the rules
    // if not check will broken
    // Common test
    HashSet<ProjectIdentify> projects  =  WireServiceLocator.INSTANCE.availableProject();
    Assertions.assertNotNull(projects);
    Assertions.assertTrue(projects.size() > 0);
    // Search by project identify
    Module module1 = WireServiceLocator.INSTANCE.get(project) ;
    org.junit.jupiter.api.Assertions.assertNotNull(module1);
  }
}
