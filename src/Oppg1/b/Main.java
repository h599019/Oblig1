package Oppg1.b;

import static Oppg1.b.beregn.beregn;

public class Main {
    public static void main(String[] args){

        int sum=beregn(12,13, (a,b)->a+b);
        System.out.println("Summer "+sum);

        int stoerste=beregn(-5,3, (a,b)->Math.max(a,b));
        System.out.println("Største "+stoerste);

        int avstand=beregn(54,45, (a,b)->Math.abs(a-b));
        System.out.println("Avstand "+avstand);
    }


}

