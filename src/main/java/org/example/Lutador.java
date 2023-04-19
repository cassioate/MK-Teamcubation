package org.example;

public abstract class Lutador {
    private int vida;
    private String name;

    public Lutador(String name) {
        this.vida = 100;
        this.name = name;
    }

    public abstract void chutar (Lutador lutador);

    public abstract void soltarMagia (Lutador lutador);

    public abstract void fatality (Lutador lutador);

    public abstract void seMatar (Lutador lutador);

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getName() {
        return name;
    }

}
