package com.sda.exercises.ex2;
/*
2. Warehouse
a. User should be able to: add, display all of the details, update, delete an item
b. Use composition and collections (The warehouse has products/items)
c. Add possibility to display summaries, like sum of all of the products, their prices.
d. *Add possibility to update number of items in a specific way, e.g.: “pliers:30” “scissors:+4”
 */
public class Main {
    public static void main(String[] args) {
        User user = new User("Andrei");
        user.setupCategory();

        ItemCategory constructii = user.getCategory("constructii");

        Item item1 = new Item("caramida", 100.99, constructii);
        item1.setStoc(10);
        user.add(item1);
        Item item2 = new Item("boltari", 134.99, constructii);
        item2.setStoc(20);
        user.add(item2);


        ItemCategory sanitare = user.getCategory("sanitare");

        Item item3 = new Item( "fasa", 25.00, sanitare);
        item3.setStoc(15);
        user.add(item3);
        Item item4 = new Item( "halat", 50.99, sanitare);
        item4.setStoc(25);
        user.add(item4);

        double total = user.getTotal();
        System.out.println("Total: " + total);

        user.displayAllItems();

        Item newItem = item1;
        newItem.setStoc(1000);

        user.update(item1, newItem);
        user.displayAllItems();

    }
}
