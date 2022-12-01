import java.io.*;

public interface PropertiesReader {
    default void readPropertiesFile() {
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\test.properties"));
            while ((line = bufferedReader.readLine()) != null) {
                String[] tempArray = line.split("=");
                System.setProperty(tempArray[0], tempArray[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
