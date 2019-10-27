import java.time.LocalDate;
import java.util.ArrayList;

public class Invoice {

    private String id;
    private String billingAddress;
    boolean isClosed;
    private LocalDate open;
    private LocalDate closed;
    private ArrayList<ShoppingCart> items = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();
    private ArrayList<Payment> payments= new ArrayList<>();


}
