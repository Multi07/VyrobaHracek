import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sklad sklad = new Sklad();
        SkladSoucastek skladSoucastek = new SkladSoucastek();
        ArrayList<Thread> list = new ArrayList<>();
        DRuce dRuce = new DRuce("Amir", sklad, skladSoucastek);
        DNohy dNohy = new DNohy("Ameer", sklad, skladSoucastek);
        DTelo dTelo = new DTelo("Amir-Junior", sklad, skladSoucastek);
        DHlava dHlava = new DHlava("Amar", sklad, skladSoucastek);
        Stvoritel stvoritel = new Stvoritel("Amara", sklad, skladSoucastek);
        Skladnik skladnik = new Skladnik("Ameer-Junior", sklad, skladSoucastek);
        list.add(new Thread(dRuce));
        list.add(new Thread(dNohy));
        list.add(new Thread(dTelo));
        list.add(new Thread(dHlava));
        list.add(new Thread(stvoritel));
        list.add(new Thread(skladnik));

        for (Thread t : list) {
            t.start();
        }
        for (Thread t : list) {
            try {
                t.join();
            } catch (InterruptedException e) {
                System.out.println("Error: " + e);
            }

        }
        if (skladSoucastek.getPanenka()==10) {
            System.out.println("10 Panenek bylo vyrobeno, tvorba končí!!");
        }
    }
}