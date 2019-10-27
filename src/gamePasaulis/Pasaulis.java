package gamePasaulis;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pasaulis {

    //static String pavadinimas;
    //List<Elementas> elementai;
    private int laikas;
    private List<Zmogus> zmones;

    public List<Zmogus> getZmones() {
        return zmones;
    }

    //atsitiktiniu sk generatorius
    public static Random R = new Random();


    //pasaulio amziaus geteris
    public int getLaikas() {
        return laikas;
    }

    ;

    //metodas zmoniu skaiciui
    public int population() {
        return zmones.size();
    }


    //metodas prideti zmogu; tikrina, jei tokio listo dar nera, sukuria nauja zmoniu lista;
    public void pridetiZmogu(Zmogus zmogus) {
        if (zmones == null) {
            zmones = new ArrayList<>();
        }
        zmones.add(zmogus);
    }

    //metodas senejimo -> sukantis pasaulio metams seneja zmogus
    public void senejimas() {
        zmones.forEach(z -> z.aging());

    }

    public void mm() {

        //atstiktiniu budu isima zmones po 60 m.
        zmones.removeIf(z -> z.getAmzius() >= 60 && R.nextBoolean());

        //isima zmones pagal amziu
        // zmones.removeIf(z -> z.getAmzius() >= 60);
    }

    //zmoniu gimimas santykinai nuo populiacijos;
    public void born() {
        int count = (int) (population() * 0.15);
        for (int i = 0; i < count; i++) {
            Zmogus z = new Zmogus();
            zmones.add(z);
        }
    }

}