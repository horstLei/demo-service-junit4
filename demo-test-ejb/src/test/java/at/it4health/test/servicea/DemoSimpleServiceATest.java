package at.it4health.test.servicea;

import at.it4health.modulea.service.ModuleAService;
import at.it4health.test.SimpleTest;
import org.jboss.arquillian.container.test.api.OperateOnDeployment;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class DemoSimpleServiceATest extends BaseDemoServiceATest{

    @Inject
    ModuleAService moduleAService;

    @Before
    public void setupTest(){    
        super.init();
    }

    @Test
    @Category(SimpleTest.class)
    @OperateOnDeployment("app_services")
    public void functionATest(){

        System.out.println("DemoSimpleServiceATest.functionATest executed: " + moduleAService.functionA());

        assertEquals(ModuleAService.FUNCTION_A_TESTSTRING, moduleAService.functionA());

        // if enabled fails
        //fail("fails on first TestCase");
    }
}
