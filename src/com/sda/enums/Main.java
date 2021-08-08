package com.sda.enums;

public class Main {
    public static void main(String[] args) {
        // definirea unui enum.
        LengthUnit meter = LengthUnit.MILIMETRU;

        System.out.println(meter);

        switch (meter) {
            case METER:
                System.out.println("Este vorba de metru");
                break;
            case CENTIMETER:
                System.out.println("Este vorba de centimetru");
                break;
            case FOOT:
                System.out.println("Este vorba de picioare");
                break;
            case INCH:
                System.out.println("Este vorba de inch");
                break;
            default:
                System.out.println("Este default " + meter.getValue());
                break;
        }
    }
}
