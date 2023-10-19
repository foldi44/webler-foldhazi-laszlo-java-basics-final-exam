public class Main {
    public static void main(String[] args) {
        String[] products = FileReader.fileReader();
        for (int i = 0; i < products.length; i++){
            System.out.println(products[i]);
            System.out.println("--------");
        }
    }
}
