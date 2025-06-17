package at.it4health.test;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.runner.RunWith;

import java.util.HashMap;
import java.util.Map;

@RunWith(Arquillian.class)
public class BaseTest extends ArquillianSuite{

    protected static Map<Object, Object> sessionMap = null;

    static boolean initialized = false;

    protected static void initSession(){

        if(!initialized){
            sessionMap = new HashMap<Object, Object>();
            initialized = true;
        }
    }
}
