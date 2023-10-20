public class ArraySorter {

    public static String[] arraySort (String[] products) {
        String comma = ",";
        int arrayLength = products.length;
        int[] ordinalNumbers = new int[arrayLength];
        String temp;
        String[] tempArray;
        String[] sortedProducts = new String[arrayLength];

            for (int i = 0; i < arrayLength; i++) {
                temp = products[i];
                tempArray = temp.split(comma, 3);
                ordinalNumbers[i] = Integer.parseInt(tempArray[0]);
            }

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
