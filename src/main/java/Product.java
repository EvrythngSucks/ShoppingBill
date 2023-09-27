/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author minoz
 */
public class Product {
    
    private String id;
    private String pname;
    private int qty;
    private double price;
    private double totalPrice;

    public Product(String id, String pname, int qty, double price, double totalPrice) {
        this.id = id;
        this.pname = pname;
        this.qty = qty;
        this.price = price;
        this.totalPrice = totalPrice;
    }

    public String getId() {
        return id;
    }

    public String getPname() {
        return pname;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
