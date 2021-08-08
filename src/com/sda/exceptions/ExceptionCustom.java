package com.sda.exceptions;

/**
 * Trebuie sa extindem clasa Throwable sau Exception si apoi in constuctor sa apelam super() pentru
 * a trimite mesajul catre constructorul parinte
 */
public class ExceptionCustom extends Throwable {

    ExceptionCustom(String message) {
        super(message);
    }

}
