package com.sda.composition;

public class Cart {
    private Phone phone;
    private TV tv;

    public Cart(Phone phone, TV tv) {
        this.phone = phone;
        this.tv = tv;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }
}
