package gamePasaulis;

public class Game {
    public static void main(String[] args) {

        Pasaulis pasaulis = new Pasaulis();

        //sukuriamas pradinis zmoniu skaicius atsitiktinai intervale

        int skaicius = Pasaulis.R.nextInt(11) + 10;//intervalas 10 ..20

        for (int i = 1; i < skaicius; i++) {
            Zmogus z = new Zmogus(skaicius);
            pasaulis.pridetiZmogu(z);
            //System.out.println(pasaulis.getZmones());
        }
        System.out.println(pasaulis.getZmones());

        System.out.println("--");
        System.out.println("Viso zmoniu prideta pradzioje: " + pasaulis.population());
        System.out.println("--");

        //sukamas pasaulio metu ciklas 40m.
        for (int year = 0; year < 40; year++) {
            //senstanti populiacija
            pasaulis.senejimas();
            int senstantiPop = pasaulis.population();
            System.out.println("Sensta zmoniu " + senstantiPop);

            //mirtys populiacijoje
            pasaulis.mm();
            int mirtysPop = senstantiPop - pasaulis.population();
            System.out.println("Mirtys populiacijoje: " + mirtysPop);


            //gimimai populiacijoje
            pasaulis.born();
            int gimimaiPop = Math.abs(senstantiPop - pasaulis.population());
            System.out.println("Gimusieji populiacijoje: " + gimimaiPop);
            System.out.println("---");

            //System.out.println(pasaulis.population() );
//               System.out.println();
        }
        System.out.println("Populiacija po 40 metu " + pasaulis.population());
    }
}
