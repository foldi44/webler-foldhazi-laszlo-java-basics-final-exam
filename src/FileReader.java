import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {

    static String oSSlash = OSPath.getOSPath();

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

