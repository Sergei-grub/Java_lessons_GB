package OOP_Seminars.OOP_seminar_1;

import java.util.ArrayList;
import java.util.List;

public class BottleOfWaterVendingMachine extends VendingMachine {
    List<BottleOfWater> productList;

    public List<BottleOfWater> getProductList() {
        return productList;
    }

    public void setProductList(List<BottleOfWater> productList) {
        this.productList = new ArrayList<>(productList);
    }

    public BottleOfWaterVendingMachine(List<BottleOfWater> productList) {
        this.productList = productList;
    }
    public BottleOfWater getProduct(String name, int volume) {
        for (BottleOfWater bottleofWater : productList) {
            if (bottleofWater.getName().equals(name) && bottleofWater.getVolume() == volume) {
                return bottleofWater;
            }
        }
        return null;
    }
    @Override
    public Product getProduct(String name) {
        for (Product product : productList){
            if(product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }

    public void addBottleOfWater(BottleOfWater bottleofWater){
        this.productList.add(bottleofWater);
    }
}