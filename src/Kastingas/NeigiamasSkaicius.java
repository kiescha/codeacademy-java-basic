package Kastingas;

import java.util.Random;

public class NeigiamasSkaicius extends Skaicius {
    @Override
    public void generuok() {
        final Random r = new Random();
        for (int i = 0; i < skaiciai.length; i++) {
            skaiciai[i] = r.nextInt(100) * (-1);
        }

    }

}

