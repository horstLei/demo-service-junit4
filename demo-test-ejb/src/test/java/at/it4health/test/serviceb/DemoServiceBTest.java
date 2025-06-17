package at.it4health.test.serviceb;

import at.it4health.test.AssertOnFirst;
import at.it4health.test.AssertOnSecond;
import at.it4health.test.FailOnFirst;
import at.it4health.test.FailOnSecond;
import org.jboss.arquillian.container.test.api.OperateOnDeployment;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class DemoServiceBTest extends BaseDemoServiceBTest {

    @Test
    @Category(FailOnFirst.class)
    @OperateOnDeployment("app_services")
    public void functionATest() {

        System.out.println("DemoServiceBTest.functionATest executed...");
        fail("fail is not called");
    }

    @Test
    @Category(FailOnSecond.class)
    @OperateOnDeployment("app_services")
    public void functionBTest() {
        System.out.println("DemoServiceBTest.functionBTest executed...");
        fail("fail is not called");
    }

    @Test
    @Category(AssertOnFirst.class)
    @OperateOnDeployment("app_services")
    public void functionCTest() {
        System.out.println("DemoServiceBTest.functionCTest executed...");
        assertEquals(1, 1);
    }

    @Test
    @Category(AssertOnSecond.class)
    @OperateOnDeployment("app_services")
    public void functionDTest() {
        System.out.println("DemoServiceBTest.functionDTest executed...");
        assertEquals(1, -1);
    }
}
