package com.paveldejimas.isvestine;

import com.paveldejimas.bazine.Klijentas;

public class ProcentinisKlientas extends Klijentas {
    private double procentas;

    public ProcentinisKlientas(String kodas, int amzius, double indelis, double procentas) {
        super(kodas, amzius, indelis);

        // this.procentas = procentas;
        setProcentas(procentas);
    }
    public double getProcentas(){
        return procentas;
    }
    public void setProcentas(double procentas){
        this.procentas = procentas > 0 ? procentas : 0;
    }
    public double getIndelisMetuGale(){
        double suma = getIndelis();
        return suma + (suma * getProcentas()/100);
    }
    public double getPalukanasMetuGale(){
        double suma = 0;
        return suma =getIndelis()* getProcentas()/100;
    }

    @Override
    public String toString() {
        return  super.toString()+ " Metu palukanos " +  procentas + " %";
    }

   // @Override
   /* public String toString() {
        return String.format("%s, Metu palukanos procentais %.2f", super.toString(), procentas);
    }

    */

}
