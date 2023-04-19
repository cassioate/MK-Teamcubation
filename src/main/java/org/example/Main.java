package org.example;

public class Main {
    public static void main(String[] args) {
        Lutador subZero = new SubZero("SubZero");
        Lutador sonia = new Sonia("Sonia");

        Rua rua = new Rua();

        rua.start(subZero, sonia);
    }
}