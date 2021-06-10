import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    private List<product> listOfProduct;

    public ProductManager() {
        this.listOfProduct = new ArrayList<>();
    }

    public  int addProduct(product p){
        this.listOfProduct.add(p);
        return count();
    }

    public int count(){
        return listOfProduct.size();
    }

    public product getProduct(int index){
        if (index < 0 || index >= count()){
            return  null;
        }
        return this.listOfProduct.get(index);
    }
}
