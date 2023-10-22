import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

/**
 * In the "FileWriter" class, there are four functions. The first one is "getDate," which returns the current date in String format. This is needed because we will store the output text file in a folder created with the current date.
 *
 * In the second function ("dirCreate"), using the date returned by the previous function, we create the output folder. If this operation fails, we send an error message.
 *
 * In the third function ("fileCreate"), we obtain the folder name by calling the first function and generate the file name with the operating system's path separator, which is stored in the "pathName" variable as a relative path. Using this, we create the file.
 *
 * In the fourth function ("fileWriter"), we write the elements of an array ("sortedProducts") passed as an argument in the Main class to the created file with error handling. As a return value, we print in the Main class whether the file writing was successful.
 */

public class FileWriter {
    private static String getDate(){
        String date = String.valueOf(java.time.LocalDate.now());
        return date;
    }
    private static void dirCreate(){
        String date = getDate();
        File newDir = new File(date);
        if (newDir.mkdir()) {
            System.out.println("A könyvtár létrehozva");
        } else {
            System.out.println("A könyvtár már létezik, vagy nem sikerült létrehozni");
        }
    }

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

