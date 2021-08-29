package com.sda.exercises.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse implements ManageItems, ManageCategory {
    List<ItemCategory> categoryList;
    List<Item> itemsList;

    public Warehouse(){
        this.categoryList = new ArrayList<>();
        this.itemsList = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        itemsList.add(item);
    }

    @Override
    public void printDetails(Item item) {
        System.out.println(item.toString());
    }

    @Override
    public void update(Item oldItem, Item newItem) {
        int index = itemsList.indexOf(oldItem);
        System.out.println(index);
        itemsList.set(index, newItem);
    }

    @Override
    public void delete(Item item) {
        itemsList.remove(item);
    }

    @Override
    public void displayAllItems() {
        itemsList.stream()
                .forEach((item) -> System.out.println(item.toString()));
    }

    @Override
    public void add(ItemCategory itemCategory) {
        categoryList.add(itemCategory);
    }

    @Override
    public ItemCategory getByName(String categoryName) {
        List<ItemCategory> result = categoryList.stream()
                .filter((category) -> category.getCategoryName().equalsIgnoreCase(categoryName))
                .collect(Collectors.toList());
        if(result.size() > 0){
            return result.get(0);
        }
        return null;
    }

    @Override
    public double summary() {
        return itemsList.stream()
                .map((item) -> item.getPrice()) // .map => va transforma lista noastra de item-uri
                                                        // intr-o lista de elemente double
                .reduce(0.0, (total, itemPrice) -> total + itemPrice); // reduce => va aduna incepan cu 0
                                                                                            // toate preturile rezultate mai sus

    }
}
