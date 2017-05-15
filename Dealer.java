package homework8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dealer {

    List<Invoice> invoicesDealer = new ArrayList<>();
    List<Stock> stockDealer = new ArrayList<>();

    public Dealer() {
        stockDealer.add(new Stock());
        int val = new Random().nextInt(new MaximumValues().getMaxQuantityInvoiceDealer());
        System.out.println("Количество чеков у торговца равно: " + val);
        for (int i = 0; i < val; i++) {
            invoicesDealer.add(new Invoice());
        }
    }

    public int getRevenueProduct(TypeProduct typeOfProductForCalculatingCost) {
        List<Product> sumInvoices = new ArrayList<>();
        for (int i = 0; i < invoicesDealer.size(); i++) {
            sumInvoices.addAll(invoicesDealer.get(i).invoice);
        }
        ToFile file = new ToFile();
        file.openFile();
        file.addRecord(sumInvoices);
        file.closeFile();
        int revenueProduct = 0;
        for (int i = 0; i < sumInvoices.size(); i++) {
            if (typeOfProductForCalculatingCost == sumInvoices.get(i).typeProduct) {
                revenueProduct += sumInvoices.get(i).priceProduct;
            }
        }
        return revenueProduct;
    }

    public void getAmountOfAssets() {
        int valueOfGoodsInInvoices = 0;
        int valueOfgoodsInStock = stockDealer.get(0).totalCost(stockDealer.get(0).stock);
        System.out.println("Cтоимость товара на складе равна: " + valueOfgoodsInStock);
        for (int i = 0; i < invoicesDealer.size(); i++) {
            valueOfGoodsInInvoices += invoicesDealer.get(i).totalCost(invoicesDealer.get(i).invoice);
        }
        System.out.println("Общая стоимость товара в чеках равна: " + valueOfGoodsInInvoices);
        System.out.println("Cтоимость активов торговца равна: " + (valueOfGoodsInInvoices + valueOfgoodsInStock));
    }
}
