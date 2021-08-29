package com.sda.exercises.ex2;

public class Item {
    private String name;
    private double price;
    private ItemCategory categoryItem;
    private int stoc;

    public Item(String name, double price, ItemCategory categoryItem){
        this.name = name;
        this.price = price;
        this.categoryItem = categoryItem;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ItemCategory getCategoryItem() {
        return categoryItem;
    }

    public int getStoc() {
        return stoc;
    }

    public void setStoc(int stoc) {
        this.stoc = stoc;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", categoryItem=" + categoryItem +
                ", stoc=" + stoc +
                '}';
    }
}
