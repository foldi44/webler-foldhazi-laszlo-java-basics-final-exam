import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {

    static String osType = OSName.getOSName();
    public static String getPath() {
        String pathResources;
        char firstC = 'W';
        if (osType.charAt(0) == firstC) {
            pathResources = "resources\\products.txt";
        } else {
            pathResources = "resources/products.txt";
        }
        return pathResources;
    }

    static String path = getPath();
    public static String[] fileReader() {
        BufferedReader reader = null;
        String[] products = null;
        int count = 0;
        try {
            reader = new BufferedReader(new java.io.FileReader(path));
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.isEmpty()){
                    System.out.println(count);
                    count++;
                }
            }
            reader = new BufferedReader(new java.io.FileReader(path));
            products = new String[count];
            int i = 0;
            while ((line = reader.readLine()) != null) {
                if (!line.isEmpty()){
                    products[i] = line;
                    System.out.println(products[i]);
                    System.out.println("--");
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

