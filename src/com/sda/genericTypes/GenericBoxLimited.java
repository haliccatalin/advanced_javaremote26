package com.sda.genericTypes;

// T extends Dog -> in aceasta clasa putem stoca
// DOAR elemente ce extind clasa Dog

// toti copiii lui Dog sunt T
public class GenericBoxLimited <T extends Dog> implements Comparable<String> {

    private T element;

    public GenericBoxLimited(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public void printDogName() {
        this.element.printDogName();
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
