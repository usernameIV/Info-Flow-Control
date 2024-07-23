package com.main;

public class ParametrosInvalidosException {

    public void throwException() {
        throw new IndexOutOfBoundsException("O segundo parâmetro deve ser maior que o primeiro");
    }

}
