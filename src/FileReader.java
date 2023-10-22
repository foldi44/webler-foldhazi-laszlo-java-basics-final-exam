import java.io.BufferedReader;
import java.io.IOException;
/**
 * The FileReader class provides methods for reading data from a file.
 */
public class FileReader {

    /**
     * The path separator determined by the operating system.
     */
    static String oSSlash = OSPath.getOSPath();

    /**
     * Reads data from a file and returns it as an array of strings.
     *
     * @return An array of strings containing the lines read from the file, or null if an error occurs.
     */
    public static String[] readFile() {
        String path = "resources" + oSSlash + "products.txt";
        BufferedReader reader = null;
        String[] products = null;
        int count = 0;
        try {
            reader = new BufferedReader(new java.io.FileReader(path));
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.isEmpty()){
                    count++;
                }
            }
            reader = new BufferedReader(new java.io.FileReader(path));
            products = new String[count];
            int i = 0;
            while ((line = reader.readLine()) != null) {
                if (!line.isEmpty()){
                    products[i] = line;
                    i++;
                }
            }
        } catch (IOException e) {
            System.out.println("File not found! " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error closing the file " + e.getMessage());
                }
            }
        }
        return products;
    }
}

