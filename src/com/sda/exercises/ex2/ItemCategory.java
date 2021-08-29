package com.sda.exercises.ex2;

public class ItemCategory {
    private String categoryName;

    public ItemCategory(String categoryName){
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public String toString() {
        return  categoryName;
    }
}