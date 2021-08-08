package com.sda;

//

public class Car {
    // proprietati, campuri
    private String color;
    private String brand;
    private int wheels;

    //constructori

    // - constructorul are acelasi nume cu clasa
    // - constructorul va returna DOAR ebicte din clasa din care face parte
    // - fiecare clasa are un constructor PREDEFINIT (DEFAULT)
    // - atunci cand ne definim noi un constructor, cel default dispare

    public Car() {
//         constructor predefinit
    }

    public Car(String color, String brand, int wheels) {
//        this.color = color;
        setColor(color);
//        this.brand = brand;
        setBrand(brand);
//        this.wheels = wheels;
        setWheels(wheels);
    }

    // metode
    public void setColor(String color /*String color este parametrul metodei*/) {
        // color, proprietatea clasei car,
        // va avea valoarea lui carColor
        this.color = color;

        // this => se foloseste in interiorul clasei
        // spre exemplu, cand vine vorba de 2 variabile cu
        // acelasi nume, una este proprietatea clasei iar
        // cealalta este un parametru al metodei
    }

    public String getColor() {
        return this.color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    // metodele de tip set -> ne ajuta sa validam valoarea pe care
    // dorim sa o setam
    public void setWheels(int wheels) {
        if(wheels != 4) {
            System.out.println("Numar invalid de roti!");
        } else {
            this.wheels = wheels;
        }
    }

    public int getWheels() {
        return this.wheels;
    }

}
