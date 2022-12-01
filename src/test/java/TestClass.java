import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestClass extends BaseTestClass {

    @Test
    public void testMethod() {
        readProperties();
        String url = System.getProperty("base-url");
        Assertions.assertEquals("http:\\\\google.com", url);
    }


    @Test
    public void testMethod2() {
        readProperties();
        String username = System.getProperty("user-name");
        Assertions.assertEquals("user", username);
    }

    @Test
    public void testMethod3() {
        readProperties();
        String userlastname = System.getProperty("user-lastname");
        Assertions.assertEquals("lastname", userlastname);
    }

}
