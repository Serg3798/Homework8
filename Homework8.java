package homework8;

public class Homework8 {

    public static void main(String[] args) {

        Dealer dealer = new Dealer();
        TypeProduct TypeOfProductForCalculatingCost = TypeProduct.Vegetables;
        System.out.print("Общая стоимость товара вида " + TypeOfProductForCalculatingCost + " во всех чеках у торговца равна: ");
        System.out.println(dealer.getRevenueProduct(TypeOfProductForCalculatingCost));
        dealer.getAmountOfAssets();
    }
}
