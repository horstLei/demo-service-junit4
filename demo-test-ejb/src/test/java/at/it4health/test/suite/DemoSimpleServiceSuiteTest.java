package at.it4health.test.suite;

import at.it4health.test.SimpleTest;
import at.it4health.test.servicea.DemoSimpleServiceATest;
import at.it4health.test.serviceb.DemoSimpleServiceBTest;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory({SimpleTest.class})
@Suite.SuiteClasses({
        DemoSimpleServiceATest.class,
        DemoSimpleServiceBTest.class
})
public class DemoSimpleServiceSuiteTest {

}
