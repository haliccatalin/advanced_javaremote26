package com.sda.innerClasses;

public class Main {

    // outerclass este clasa radacina
    OuterClass outerClass = new OuterClass();

    // InnerClass este clasa din interior care nu este statica
    // outerClass.new -> reprezinta apelul constructorului pentru InnerClass()
    // clasa non-statica este dependenta de un obiect din clasa radacina
    final OuterClass.InnerClass innerClass = outerClass.new InnerClass();


    // pentru a creea un obiect dintr-o clasa statica
    // clasa statica este independenta de clasa radacina
    OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();
}
