package listTest;

import onlineShop.Customer;
import onlineShop.Order;

import java.util.ArrayList;

public class GenLinkedTest {

    public static void main(String[] args) {

        ArrayList<String> someStrings= new ArrayList<>();
        GenLinkedList<Customer> customers= new GenLinkedList<>();
        GenLinkedList<Order> orders = new GenLinkedList<>();
        Customer c1= new Customer();
        Customer c2= new Customer();
        Customer c3= new Customer();
        Customer c4= new Customer();

        Order o1= new Order();
        Order o2= new Order();
        Order o3= new Order();
        Order o4= new Order();


        customers.insertFirst(c1);
        customers.insertFirst(c2);
        customers.insertLast(c3);
        customers.insertFirst(c4);
        orders.insertFirst(o1);







    }

}
