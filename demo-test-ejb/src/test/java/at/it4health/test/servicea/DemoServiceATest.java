package at.it4health.test.servicea;

import javax.inject.Inject;

import at.it4health.modulea.service.ModuleAService;
import at.it4health.test.AssertOnFirst;
import at.it4health.test.AssertOnSecond;
import at.it4health.test.FailOnFirst;
import at.it4health.test.FailOnSecond;
import org.jboss.arquillian.container.test.api.OperateOnDeployment;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class DemoServiceATest extends BaseDemoServiceATest{

    @Inject
    ModuleAService moduleAService;

    @Before
    public void setupTest(){    
        super.init();
    }

    @Test
    @Category(FailOnFirst.class)
    @OperateOnDeployment("app_services")
    public void functionATest(){

        System.out.println("DemoServiceATest.functionATest executed: " + moduleAService.functionA());

        assertEquals(ModuleAService.FUNCTION_A_TESTSTRING, moduleAService.functionA());

        // if enabled fails
        fail("fails on first TestCase");
    }

    @Test
    @Category(FailOnSecond.class)
    @OperateOnDeployment("app_services")
    public void functionBTest(){

        System.out.println("DemoServiceATest.functionBTest executed: " + moduleAService.functionA());

        assertEquals(ModuleAService.FUNCTION_A_TESTSTRING, moduleAService.functionA());
    }

    @Test
    @Category(AssertOnFirst.class)
    @OperateOnDeployment("app_services")
    public void functionCTest(){

        System.out.println("DemoServiceATest.functionCTest executed: " + moduleAService.functionA());

        assertEquals(ModuleAService.FUNCTION_A_TESTSTRING, moduleAService.functionA());
    }

    @Test
    @Category(AssertOnSecond.class)
    @OperateOnDeployment("app_services")
    public void functionDTest(){

        System.out.println("DemoServiceATest.functionDTest executed: " + moduleAService.functionA());

        assertEquals(ModuleAService.FUNCTION_A_TESTSTRING, moduleAService.functionA() + "_test");
    }
}
