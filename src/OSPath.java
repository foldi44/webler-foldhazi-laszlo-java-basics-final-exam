public class OSPath {

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
