package gamePasaulis;

import java.util.Random;

public class Zmogus {

    private String vardas;
    private int amzius;
    private int id = 0;
    private static int numeris = 1;
    private Gender gender;

    private static String[] vardai = {"Jonas", "Antanas", "Ona", "Birute", "Petras", "Danute"};

    public static int count() {
        return numeris;
    }

    public void aging() {
        amzius++;
    }

    // konstruktorius
    Zmogus() {
        this.vardas = vardai[Pasaulis.R.nextInt(vardai.length)];     //atsitiktinis vardas is listo
        this.id = numeris++;
        this.gender = Gender.getRandomGender();
    }

    //konstruktorius su amziumi
    Zmogus(int amzius) {
        this();
        this.amzius = getRandomAmzius();
    }

    public int getId() {
        return id;
    }

    public int getAmzius() {
        return amzius;
    }

    public int getRandomAmzius() {
        return amzius = Pasaulis.R.nextInt(100);
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    //lyciu enumas su random geteriu
    enum Gender {
        F("Female"), M("Male");

        final String specName;

        Gender(String specName) {
            this.specName = specName;
        }

        //random getteris
        //reiketu ideti pagal varda lyti
        public static Gender getRandomGender() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];

        }

        public String getSpecName() {
            return specName;
        }
    }

    @Override
    public String toString() {
        return "Zmogus{" +
                "vardas='" + vardas + '\'' +
                ", amzius=" + amzius +
                ", id=" + id +
                ", gender=" + gender +
                '}' + "\n";
    }
}
