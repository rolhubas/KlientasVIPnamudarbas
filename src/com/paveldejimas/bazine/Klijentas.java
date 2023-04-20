package com.paveldejimas.bazine;

import com.paveldejimas.isvestine.ProcentinisKlientas;

public class Klijentas implements Klientas {
    private String kodas;
    private int amzius;
    private double indelis;

    public Klijentas(String kodas, int amzius, double indelis) {
        this.kodas = kodas;
        this.amzius = amzius;
        this.indelis = indelis;
    }


    @Override
    public String getKodas() {
        return kodas;
    }

    @Override
    public void setKodas(String kodas) {
        this.kodas = kodas;
    }

    @Override
    public int getamzius() {
        return amzius;
    }

    @Override
    public void setamzius(int amzius) {
        this.amzius = amzius;

    }

    @Override
    public double getIndelis() {
        return indelis;
    }

    @Override
    public void setIndelis(double indelis) {
        this.indelis = indelis > 0 ? indelis : 0;
    }
    public double getIndelisMetuGale(){
        System.out.println("Nezimomas kliento statusas");
        return indelis;
    }


    @Override
    public String toString() {
        return "Klijentas : " +
                "kodas " + kodas +
                "; amzius " + amzius +
                "; indelis " + indelis + " eur."
                ;
    }
}
