package game.Pasaulis;

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
            pasaulis.senejimas();
            System.out.println("Sensta zmoniu " + pasaulis.population());
            pasaulis.mm();
            System.out.println("Po mirties " + pasaulis.population());
            pasaulis.born();
//            System.out.println("Su gimusiais " + pasaulis.population() + pasaulis.getZmones());
            System.out.println("---");

            //System.out.println(pasaulis.population() );
//               System.out.println();
        }
        System.out.println("Populiacija po 40 metu " + pasaulis.population());
    }
}
