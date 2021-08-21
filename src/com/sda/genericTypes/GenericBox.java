package com.sda.genericTypes;

public class GenericBox <T> {

    // T -> reprezinta tipul de variabila
    // item -> reprezinta numele variabilei
    private T item;

    public GenericBox(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }

    public void setItem(T item) {
        this.item = item;
    }

}
/**
 * public class GenericBox  {
 *     private String item;
 *
 *     public GenericBox(String item) {
 *         this.item = item;
 *     }
 *
 *     public String getItem() {
 *         return this.item;
 *     }
 *
 *     public void setItem(String item) {
 *         this.item = item;
 *     }
 * }
 */