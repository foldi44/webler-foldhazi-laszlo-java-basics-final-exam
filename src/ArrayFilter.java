public class ArrayFilter {
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
