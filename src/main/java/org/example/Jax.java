package org.example;

public class Jax extends Lutador{
    public Jax(String name) {
        super(name);
    }

    @Override
    public void chutar(Lutador lutador){
        lutador.setVida(lutador.getVida() - 5);
    }

    @Override
    public void soltarMagia(Lutador lutador) {
        lutador.setVida(lutador.getVida() - 35);
    }

    @Override
    public void fatality(Lutador lutador) {
        lutador.setVida(lutador.getVida() - 100);
    }

    @Override
    public void seMatar(Lutador lutador) {
        lutador.setVida(lutador.getVida() - 100);
        this.setVida(this.getVida() - 100);
    }

    @Override
    public String toString() {
        return "Jax";
    }
}
