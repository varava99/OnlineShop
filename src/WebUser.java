import java.util.ArrayList;

public class WebUser {

    private String loginID;
    private String password;
    private UserState state;
    private ArrayList<Customer> customers = new ArrayList<>();
    private ShoppingCart cart;
}
