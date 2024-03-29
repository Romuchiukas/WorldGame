package gamePasaulis;

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

    //lyciu enumas su random geteriu
    enum Gender {
        F("Female"), M("Male");

        final String specName;

        Gender(String specName) {
            this.specName = specName;
        }

        //random getteris
        //reiketu ideti lyti pagal varda
        public static Gender getRandomGender() {
            return values()[Pasaulis.R.nextInt(values().length)];
        }

    }


    @Override
    public String toString() {
        return "Zmogus{" +
                "vardas='" + vardas + '\'' +
                ", amzius=" + amzius +
                ", id=" + id +
                ", gender=" + gender.specName +
                '}' + "\n";
    }
}
