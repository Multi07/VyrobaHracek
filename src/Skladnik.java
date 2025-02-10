import java.util.Random;

public class Skladnik extends Delnik {
    public Skladnik(String name1, Sklad sklad, SkladSoucastek skladSoucastek) {
        super(name1, sklad, skladSoucastek);
    }
    Random rand = new Random();
    int rand_int1 = rand.nextInt(1000);
    int rand_int2 = rand.nextInt(500);
    private final int Pocet_Plastu =10;

    @Override
    public void run() {
        while (super.getSkladSoucastek().getPanenka()<10) {
            System.out.println("Skladník " + super.getName1() + " Zajel pro materiál");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skladník " + super.getName1() + " se vrátil s materiálem");
            super.getSklad().pridejPlast(rand_int1);
            super.getSklad().pridejVlasy(rand_int2);
        }
    }
}
