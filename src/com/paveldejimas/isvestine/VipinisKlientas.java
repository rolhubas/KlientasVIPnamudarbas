package com.paveldejimas.isvestine;

public class VipinisKlientas extends ProcentinisKlientas {
    private double priedas;


    public VipinisKlientas(String kodas, int amzius, double indelis, double procentas, double priedas) {
        super(kodas, amzius, indelis, procentas);
        setPriedas(priedas);
    }
    public double getPriedas(){
        return priedas;
    }
    public void setPriedas (double priedas){
        this.priedas = priedas > 0 ? priedas : 0;
    }
    public double getIndelisMetuGale(){
        return super.getIndelisMetuGale() + (getIndelis()*getPriedas());
    }

    @Override
    public String toString() {
        return String.format("%s, priedo koeficientas %5.2f", super.toString(), getPriedas());
    }
}
