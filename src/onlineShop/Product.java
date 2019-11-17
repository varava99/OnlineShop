package onlineShop;

import java.time.LocalDate;

public class Product {

    private String id;
    private String name;
    private double price;
    private LocalDate productionDate;
    private LocalDate expirationDate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Product(String id, String name, double price, LocalDate productionDate, LocalDate expirationDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productionDate = productionDate;
        this.expirationDate = expirationDate;
    }
}
