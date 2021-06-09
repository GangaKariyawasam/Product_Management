import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    private List<product> listOfProduct;

    public void productManager(){
        this.listOfProduct = new ArrayList<>();
    }

    public  int addProduct(product p){
        this.listOfProduct.add(p);
        return this.listOfProduct.size();
    }


}
