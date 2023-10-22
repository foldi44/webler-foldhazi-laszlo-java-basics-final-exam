/**
 * The OSPath class provides a method to determine the appropriate path separator for the current operating system.
 */
public class OSPath {

    /**
     * Retrieves the appropriate path separator based on the operating system in use.
     *
     * @return A String containing the path separator ("\\" for Windows, "/" for other operating systems).
     */
    public static String getOSPath() {

        String oS = System.getProperty("os.name");
        String oSSlash;
        char firstC = 'W';
        if (oS.charAt(0) == firstC) {
            oSSlash = "\\";
        } else {
            oSSlash = "/";
        }

        return oSSlash;
    }
}
