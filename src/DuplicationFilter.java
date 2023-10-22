/**
 * The DuplicationFilter class provides methods for filtering duplicate entries within an array of product names.
 */
public class DuplicationFilter {

    /**
     * Filters duplicate product names from the input array.
     *
     * @param products An array of product names.
     * @return An array of product names without duplicates.
     */
    public static String[] duplicationFiltration (String[] products) {

        int arrayLength = products.length;
        int count = 0;
        String[] productNames = new String[arrayLength];
        String comma = ",";

        for (int i = 0; i < arrayLength; i++) {
            String temp = products[i];
            String[] tempArray = temp.split(comma);
            productNames[i] = tempArray[1];
            int j = 0;
            while (j < i ) {
                String temp1 = productNames[j].toLowerCase();
                String temp2 = productNames[i].toLowerCase();
                if (temp1.equals(temp2)){
                    count++;
                }
                j++;
            }
        }

        String[] productsWithoutDuplication = new String[arrayLength-count];
        int k = 0;
        for (int i = 0; i < arrayLength; i++) {
            int j = 0;
            count = 0;
            while (j < i) {
                String temp1 = productNames[j].toLowerCase();
                String temp2 = productNames[i].toLowerCase();
                if (temp1.equals(temp2)){
                    count++;
                }
                j++;
            }
           if (count == 0) {
               productsWithoutDuplication[k] = products[i];
               k++;
           }
        }

        return productsWithoutDuplication;
    }

    /**
     * Validates the level of duplication in the product names array.
     *
     * @param products                An array of all product names.
     * @param productsWithoutDuplication An array of product names without duplicates.
     * @return A message indicating whether the level of duplication is acceptable or excessive.
     */
    public static String duplicationValidator(String[] products,String[] productsWithoutDuplication){
        int x = products.length-productsWithoutDuplication.length;
        String duplicationValidation;
        if (x < 6) {
            duplicationValidation = "A duplikáció száma " + x + ", a duplikációk száma még elfogadható!";
        } else {
            duplicationValidation = "A duplikáció száma " + x + ", túl sok adat duplikálódik!";
        }
        return duplicationValidation;
    }
}

