package at.it4health.test.suite;

import at.it4health.test.NonExistent;
import at.it4health.test.servicea.DemoServiceATest;
import at.it4health.test.serviceb.DemoServiceBTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(NonExistent.class)
@Suite.SuiteClasses({
        DemoServiceATest.class,
        DemoServiceBTest.class
})
public class DemoServiceSuiteTest {

    // fails on no tests found with this tag
}
