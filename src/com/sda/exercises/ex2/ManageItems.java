package com.sda.exercises.ex2;

public interface ManageItems {
    public void add(Item item);
    public void printDetails(Item item);
    public void update(Item oldItem, Item newItem);
    public void delete(Item item);
    void displayAllItems();
}
