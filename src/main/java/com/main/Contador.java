package com.main;

import java.util.*;

import static java.lang.StringTemplate.*;

public class Contador {

    static ParametrosInvalidosException pie = new ParametrosInvalidosException();
    final static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        int insertN1;
        int insertN2;

        System.out.println("Insira n1");
        insertN1 = s.nextInt();
        System.out.println("Insira n2");
        insertN2 = s.nextInt();
        int insertResult = insertN2 - insertN1;

        if (insertN1 < insertN2) {
            for (int i = 1; i < insertResult; i++) {
                System.out.println(STR."Imprimindo numero: \{i}");
            }
        }
        else {
            pie.throwException();
        }
    }

}
