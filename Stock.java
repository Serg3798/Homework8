package homework8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Stock implements Tradable {

    List<Product> stock = new ArrayList<>();

    public Stock() {
        int quantityProductStock = new Random().nextInt(new MaximumValues().getMaxQuantityProductStock());
        System.out.println("Количество товаров на складе равно:  " + quantityProductStock);
        for (int i = 0; i < quantityProductStock; i++) {
            stock.add(new Product());
        }
    }

    @Override
    public int totalCost(List<Product> stock) {

        int totalCostGoodsStock = 0;
        for (int i = 0; i < stock.size(); i++) {
            totalCostGoodsStock = totalCostGoodsStock + (stock.get(i)).priceProduct;
        }
        return totalCostGoodsStock;
    }
}
