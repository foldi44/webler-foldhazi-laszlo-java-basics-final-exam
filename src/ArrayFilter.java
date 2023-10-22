/**
 * The ArrayFilter class provides a method for filtering products containing a specific target string.
 */
public class ArrayFilter {

    /**
     * Filters product entries that contain a specific target string.
     *
     * @param products An array of product entries.
     * @param target   The target string to filter by.
     * @return An array of product entries that contain the target string.
     */
    public static String[] arrayFiltration (String[] products,String target) {
        int arrayLength = products.length;
        int count = 0;

        for (int i = 0; i < arrayLength; i++) {
            String temp = products[i].toLowerCase();
            if (temp.contains(target)) {
                count++;
            }
        }

        String[] filteredProducts = new String[count];
        int j = 0;
        for (int i = 0; i < arrayLength; i++) {
            String temp = products[i].toLowerCase();
            if (temp.contains(target)) {
                filteredProducts[j] = products[i];
                j++;
            }
        }

        return filteredProducts;
    }
}
