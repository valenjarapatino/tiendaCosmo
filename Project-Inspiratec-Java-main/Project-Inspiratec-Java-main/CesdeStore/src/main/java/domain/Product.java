package domain;

import jdk.jfr.Category;

public class Product {


    private int productId;

    private String productName;

    private String description;

    private domain.Category category;
    private  float cost;

    private float profit;

    private float prince = cost/(1 - (profit/100));

    private String state;


    // constructores

    public Product(){

    }

    public Product(int productId, String productName, String description, Category category, float cost, float profit, float prince, String state) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.category = category;
        this.cost = cost;
        this.profit = profit;
        this.prince = prince;
        this.state = state;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getProfit() {
        return profit;
    }

    public void setProfit(float profit) {
        this.profit = profit;
    }

    public float getPrince() {
        return prince;
    }

    public void setPrince(float prince) {
        this.prince = prince;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}


