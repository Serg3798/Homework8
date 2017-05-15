package homework8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Invoice implements Tradable {

    List<Product> invoice = new ArrayList<>();

    public Invoice() {
        int quantityProductInvoice = new Random().nextInt(new MaximumValues().getMaxQuantityProductInvoice());
        if (quantityProductInvoice == 0) {
            quantityProductInvoice = 1;
        }
        System.out.println("Количество товаров в данном чеке равно:  " + quantityProductInvoice);
        for (int i = 0; i < quantityProductInvoice; i++) {
            invoice.add(new Product());
        }
    }

    @Override
    public int totalCost(List<Product> invoice) {
        int totalCostGoodsInvoice = 0;
        for (int i = 0; i < invoice.size(); i++) {
            totalCostGoodsInvoice = totalCostGoodsInvoice + (invoice.get(i)).priceProduct;
        }
        return totalCostGoodsInvoice;
    }
}
