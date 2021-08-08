package com.sda.composition;

public class Main {
    // Compozitia se refara la faptul ca obiectele pot avea
    // ca si proprietati alte obiecte.
    public static void main(String[] args) {
        Phone iphone = new Phone("Apple", 5.80);
        TV samsungTv = new TV("black", "Samsung");

        Cart cart = new Cart(iphone, samsungTv);


//        Phone phone = cart.getPhone();
//        System.out.println(phone.getSize());
//        vs.
        System.out.println(cart.getPhone().getBrand());


        System.out.println(cart.getTv().getBrand());
    }
}
