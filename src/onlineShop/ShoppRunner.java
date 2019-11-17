package onlineShop;

public class ShoppRunner {

    public static void main(String[] args) {
        ProductCatalog.addProduct("11","lemon",18.68,"2019-11-16",45);

        Order someOrder = new Order();

        Invoice inv = new Invoice();

        inv.addToOrder(someOrder,"11", 4);



    }
}
