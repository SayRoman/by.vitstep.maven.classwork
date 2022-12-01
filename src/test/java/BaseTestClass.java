import org.junit.jupiter.api.BeforeAll;

public class BaseTestClass implements PropertiesReader {

    @BeforeAll
    public void readProperties(){
        readPropertiesFile();
    }
}
