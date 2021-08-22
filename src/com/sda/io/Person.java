package com.sda.io;

import java.io.Serializable;

// Serializable => interfata care ne ajuta sa transformam un obiect din java
// intr-un obiect de tip text, adica ne ajuta sa exportam intr-un fisier un obiect

public class Person implements Serializable {
    private String name;
    private String phone;
    private String email;

    public Person(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
