package Kastingas;

import java.util.Random;

public abstract class Skaicius {



    public Skaicius() {
        Random r = new Random();
        this.skaiciai = new double[r.nextInt(200)];
    }
    protected double[] skaiciai;

    public abstract void generuok();

    public int suma(){
        int suma = 0;
        for (double sk: skaiciai){
            suma += sk;
        }
        return suma;
    }

}
