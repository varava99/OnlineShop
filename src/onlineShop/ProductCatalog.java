package onlineShop;

import java.time.LocalDate;
import java.util.ArrayList;

public class ProductCatalog {
    private static ArrayList<Product> products = new ArrayList<>();

  public static Product getProductByID(String id){

      for (int i = 0; i <products.size() ; i++) {
          if (products.get(i).getId().equals(id))
              return products.get(i);
      }


      return null;

      // todo write exeption

  }




  public static void addProduct(String id,String name,double price,String productDate,int expDate){

      Product product = new Product("123","apple",2.25,
              LocalDate.parse(productDate),LocalDate.parse(productDate).plusDays(expDate));

       products.add(product);


  }


}
