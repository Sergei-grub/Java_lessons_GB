package OOP_Homework.Task_1;

import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    List<HotDrink> productList;

    public void addHotDrink(HotDrink hotDrink){
        this.productList.add(hotDrink);
    }

    public List<HotDrink> getProductList() {
        return productList;
    }

    public void setProductList(List<HotDrink> productList) {
        this.productList = productList;
    }

    public HotDrinkVendingMachine(List<HotDrink> productList) {
        this.productList = productList;
    }

    public HotDrink getProduct(String name, int temperature) {
        for (HotDrink hotDrink : productList) {
            if (hotDrink.getName().equals(name) && hotDrink.getTemperature() == temperature) {
                return hotDrink;
            }
        }
        return null;
    }
    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

}
