package homework8;

import java.util.Random;

public class Product {

    public TypeProduct typeProduct;
    public int idProduct;
    public int priceProduct;

    public Product() {
        TypeProduct[] typeProduct1 = TypeProduct.values();
        int quantityTypeOfProduct = typeProduct1.length;
        this.typeProduct = typeProduct1[new Random().nextInt(quantityTypeOfProduct)];
        this.idProduct = new Random().nextInt(new MaximumValues().getMaxIdProduct() - 1) + 1;
        this.priceProduct = new Random().nextInt(new MaximumValues().getMaxPriceProduct() - 1) + 1;
        System.out.format("%s\t%s\t%s\n", idProduct, priceProduct, typeProduct);
    }
}
