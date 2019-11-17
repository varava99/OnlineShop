package onlineShop;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order {

    private String id;
    private LocalDate ordered;
    private String address;
    private OrderStatus status;

    private ArrayList<LineItem> items = new ArrayList<>();  //todo : can i use same array as in shoppingcart class???
    private ArrayList<Payment> payments = new ArrayList<>();

    public  double totalSale() {

        double totalSum=0;

        for (int i = 0; i<= items.size() ; i++) {

            //totalSum += items.get(i).getQuantity() * items.get(i).getProduct().getPrice();
            totalSum += items.get(i).subSum();
        }

        return totalSum;

    }

    public void addLineItem(Product prodSpec, int quantity){
        items.add(new LineItem(prodSpec,quantity));

    }



}
