import java.util.Scanner;

public class ProductConsole {

    private Scanner scanner = new Scanner(System.in);
    private ProductManager productManager = new ProductManager();

    private int menu(){
        System.out.println("------ PRODUCT MENU ------");
        System.out.println("1: Add Product");
        System.out.println("2: Show All Products");
        System.out.println("3: Remove Product");
        System.out.println("0: Exit");
        int choice = readInt(0,3);
        return choice;
    }

    public void start(){
        while (true){
            int choice = menu();
            switch (choice){
                case 0:
                    System.exit(0);
                    break;

                case 1:
                 addProduct();
                 break;

                case 2:
                    showAll();
                    break;

                default:
                    throw new AssertionError();
            }
        }
    }

    private void showAll() {
        if(productManager.count()<1){
            System.out.println("No products available");
            System.out.println();
            start();
        }
        System.out.println("--- All Product ---");
        System.out.println("ID\tName\tPrice");
        for (int i = 0; i < productManager.count(); i ++){
            product product = productManager.getProduct(i);
            System.out.println(product.getId()+"\t"+product.getName()+"\t"+product.getPrice());
        }
    }

    private int readInt(int min, int max){
        int choice;
        while (true){
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= min && choice <= max){
                    break;
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        return choice;
    }

    private float readFloat(int min, float max){
        float price;
        while (true){

        }
    }

    private void addProduct(){
        System.out.println("Enter Product ID: ");
        int id = readInt(0, Integer.MAX_VALUE);
        System.out.println("Enter Product Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Product Price");
        float price;
        while (true){
            try {
                price = Float.parseFloat(scanner.nextLine());
                if (price >= 0 && price <= Float.MAX_VALUE){
                    break;
                }
            }catch (Exception e){
                System.out.println("Invalid value.Try Enter a Valid One ");
            }
        }
        product p = new product(id,name,price);
        productManager.addProduct(p);
        System.out.println("Successfully added your product "+p.getName());
    }
}
