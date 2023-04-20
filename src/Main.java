import com.paveldejimas.bazine.Klijentas;
import com.paveldejimas.isvestine.ProcentinisKlientas;
import com.paveldejimas.isvestine.VipinisKlientas;

public class Main {
    public static void main(String[] args) {

        Klijentas klientai[] = new Klijentas[4];
        klientai[0] = new ProcentinisKlientas("P001", 22, 5000, -1.7);
        klientai[1] = new Klijentas("K001", 20, -450);
        klientai[2] = new VipinisKlientas("V001", 27, 10000, 2.0, -0.1);
        klientai[3] = new VipinisKlientas("V002", 33, 25000, 2.2, 0.12);
        System.out.println("..........  Klientu sarasas   ................\n");
        spausdintiKlientuSarasa(klientai);



        for (Klijentas indelininkas : klientai) {
            if (indelininkas instanceof VipinisKlientas) {
                VipinisKlientas vip = (VipinisKlientas) indelininkas;
                vip.setPriedas(vip.getPriedas() + 0.05);
            }
            System.out.println(indelininkas); //+ "\n");
            //System.out.printf("Suma metu gale %9.2f\n\n",indelininkas.getIndelisMetuGale());
            System.out.println("Suma metu gale " + indelininkas.getIndelisMetuGale() + " eur." + "\n");

        }
        double suma = 0;
        for (Klijentas indelininkas : klientai) {
            suma = suma + indelininkas.getIndelisMetuGale();
        }
        System.out.println("Viso Suma su priedais metu gale " + suma + " eur " + "\n");
        double palukanos = 0;
        for (Klijentas indelininkasP : klientai) {
            if (indelininkasP instanceof ProcentinisKlientas) {
                ProcentinisKlientas klientasP = (ProcentinisKlientas) indelininkasP;
                palukanos = klientasP.getPalukanasMetuGale();
            }
            System.out.println("palukanos metu gale " + palukanos);

        }
    }

    public static void spausdintiKlientuSarasa(Klijentas[] sarasas) {
        for (Klijentas klijentas : sarasas) {
            System.out.println(klijentas);
        }
    }


}



