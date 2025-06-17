package at.it4health.test.serviceb;

import at.it4health.test.SimpleTest;
import org.jboss.arquillian.container.test.api.OperateOnDeployment;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.fail;

public class DemoSimpleServiceBTest extends BaseDemoServiceBTest {

    @Test
    @Category(SimpleTest.class)
    @OperateOnDeployment("app_services")
    public void functionATest() {

        System.out.println("DemoSimpleServiceBTest.functionATest executed...");
        fail("fail is not called");
    }

}
