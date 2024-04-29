package com.pluralsight;

public class Product {
    private int id;
    private String productName;
    private double price;
    private String department;

    public Product(int id, String productName, double price, String department) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setName(String name) {
        this.productName = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String Department) {
        this.department = Department;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", department='" + department + '\'' +
                '}';
    }


    }