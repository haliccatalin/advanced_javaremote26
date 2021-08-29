package com.sda.exercises.ex2;

public interface ManageCategory {
    void add(ItemCategory itemCategory);
    ItemCategory getByName(String categoryName);
    double summary();
}
