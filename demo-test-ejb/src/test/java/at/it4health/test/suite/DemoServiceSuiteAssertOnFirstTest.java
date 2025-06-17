package at.it4health.test.suite;

import at.it4health.test.AssertOnFirst;
import at.it4health.test.servicea.DemoServiceATest;
import at.it4health.test.serviceb.DemoServiceBTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(AssertOnFirst.class)
@Suite.SuiteClasses({
        DemoServiceATest.class,
        DemoServiceBTest.class
})
public class DemoServiceSuiteAssertOnFirstTest {

}
