package com.sda.exercises.ex2;

public class User implements ManageItems {
    private String name;
    private Warehouse warehouse;

    public User(String name){
        this.name = name;
        this.warehouse = new Warehouse();
    }


    @Override
    public void add(Item item) {
        warehouse.add(item);
    }

    @Override
    public void printDetails(Item item) {
        warehouse.printDetails(item);
    }

    @Override
    public void update(Item oldItem, Item newItem) {
        warehouse.update(oldItem, newItem);
    }

    @Override
    public void delete(Item item) {
        warehouse.delete(item);
    }

    @Override
    public void displayAllItems() {
        warehouse.displayAllItems();
    }

    public void setupCategory(){
        ItemCategory constructii = new ItemCategory("constructii");
        warehouse.add(constructii);

        ItemCategory sanitare = new ItemCategory("sanitare");
        warehouse.add(sanitare);
    }

    public ItemCategory getCategory(String name){
        return warehouse.getByName(name);
    }
    public double getTotal(){
        return warehouse.summary();
    }
}
