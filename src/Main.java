public class Main {
    public static void main(String[] args) {
        String target = "coca-cola";

        String[] products = FileReader.readFile();

        String[] sortedProducts = ArraySorter.arraySort(products);

        String[] filteredProducts = ArrayFilter.arrayFiltration(products,target);

        String[] productsWithoutDuplication = DuplicationFilter.duplicationFiltration(products);

        String duplicationValidation = DuplicationFilter.duplicationValidator(products, productsWithoutDuplication);

        String fileWriterResult = FileWriter.fileWriter(sortedProducts);

        ArrayPrinter.arrayPrint(products,"o");
        ArrayPrinter.arrayPrint(sortedProducts,"s");
        ArrayPrinter.arrayPrint(filteredProducts,"f");
        ArrayPrinter.arrayPrint(productsWithoutDuplication,"df");
        System.out.println(duplicationValidation);
        System.out.println(fileWriterResult);
    }
}
