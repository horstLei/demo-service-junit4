package at.it4health.test.suite;

import at.it4health.test.NonExistent;
import at.it4health.test.servicea.DemoServiceATest;
import at.it4health.test.serviceb.DemoServiceBTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(org.junit.runners.Suite.class)
@Categories.IncludeCategory(NonExistent.class)
@org.junit.runners.Suite.SuiteClasses({
        DemoServiceATest.class,
        DemoServiceBTest.class
})
public class DemoServiceSuiteTest {

}
