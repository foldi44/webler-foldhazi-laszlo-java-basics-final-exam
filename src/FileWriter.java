import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

/**
 * The FileWriter class provides methods for creating directories, files, and writing data to a file.
 */
public class FileWriter {

    /**
     * Retrieves the current date as a string.
     *
     * @return A string representing the current date in the format "yyyy-MM-dd."
     */
    private static String getDate(){
        String date = String.valueOf(java.time.LocalDate.now());
        return date;
    }

    /**
     * Creates a directory with the current date as its name.
     */
    private static void dirCreate(){
        String date = getDate();
        File newDir = new File(date);
        if (newDir.mkdir()) {
            System.out.println("A könyvtár létrehozva");
        } else {
            System.out.println("A könyvtár már létezik, vagy nem sikerült létrehozni");
        }
    }

    /**
     * Creates a file into the previously created folder.
     *
     * @return The path to the created file.
     */
    private static String fileCreate() {
        dirCreate();
        String date = getDate();
        String oSSlash = OSPath.getOSPath();
        String pathName = date + oSSlash + "sortedproducts.txt";
        File newFile = new File(pathName);
        try {
            if (newFile.createNewFile()) {
                System.out.println("A fájl létrehozva");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return pathName;
    }

    /**
     * Writes an array of sorted products to a file and returns a status message.
     *
     * @param sortedProducts An array of product data to be written to the file.
     * @return A status message indicating whether the file writing was successful.
     */
    public static String fileWriter(String[] sortedProducts) {
        String pathName = fileCreate();
        String fileStatment;

        try (BufferedWriter writer = new BufferedWriter(new java.io.FileWriter(pathName))){
            for (String i : sortedProducts){
                writer.write(i);
                writer.newLine();
            }
            fileStatment = "Siker";
        } catch (IOException e) {
            System.out.println(e.getMessage());
            fileStatment = "Nem sikerült";
        }

        return fileStatment;
    }

}

