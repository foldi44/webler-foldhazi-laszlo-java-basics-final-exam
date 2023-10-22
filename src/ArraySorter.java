/**
 * The ArraySorter class provides a method for sorting an array of products based on their ordinal numbers.
 */
public class ArraySorter {

    /**
     * Sorts an array of products based on their ordinal numbers and returns the sorted array.
     *
     * @param products An array of product data in the format "ordinalNumber,productName,additionalInfo".
     * @return An array of product data sorted by ordinal numbers.
     */
    public static String[] arraySort (String[] products) {
        String comma = ",";
        int arrayLength = products.length;
        int[] ordinalNumbers = new int[arrayLength];
        String temp;
        String[] tempArray;
        String[] sortedProducts = new String[arrayLength];

        // Extract and store ordinal numbers
            for (int i = 0; i < arrayLength; i++) {
                temp = products[i];
                tempArray = temp.split(comma, 3);
                ordinalNumbers[i] = Integer.parseInt(tempArray[0]);
            }

        // Perform bubble sort based on ordinal numbers
            int n = ordinalNumbers.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (ordinalNumbers[j] > ordinalNumbers[j + 1]) {
                        int tempOrd = ordinalNumbers[j];
                        ordinalNumbers[j] = ordinalNumbers[j + 1];
                        ordinalNumbers[j + 1] = tempOrd;
                    }
                }
            }

        // Reconstruct sorted product array
            for (int i = 0; i < arrayLength; i++){
                for (int j = 0; j < arrayLength; j++){
                    String tempOrd = ordinalNumbers[i] + comma;
                    if (products[j].startsWith(tempOrd)){
                        sortedProducts[i] = products[j];
                    }
                }
            }

        return sortedProducts;
    }
}
