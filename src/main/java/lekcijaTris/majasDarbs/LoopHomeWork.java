package lekcijaTris.majasDarbs;

import org.apache.poi.util.SystemOutLogger;

import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {

        //1.uzdevums
        Scanner ievade = new Scanner(System.in);
        int summa = 0;
        while (summa <= 100) {

            System.out.println("Ievadi skaitli:");
            int number = ievade.nextInt();
            summa = summa + number;
        }
        System.out.println("Gatavs");

        System.out.println("\n");

        //2.uzdevums

        //a)int While
        int[] masivsInt = { 1,2,3,4,5,6,7,8,9,10};
        int s = 0;
        while (s<masivsInt.length){
            System.out.print(masivsInt[s]);
            s++;

        }
        System.out.println("\n");

        //a)String while
        String[] muzikasInstruments = {"klavieres","flauta","vijole","kokle"};
        int i=0;
        while (i<muzikasInstruments.length){
            System.out.println(muzikasInstruments[i]);
            i++;

        }
        System.out.println("\n");

        //a)Char while
        char[] vards = {'I','v','i','t','a'};
        int v = 0;
        while (v<vards.length) {
            System.out.println(vards[v]);
            v++;

        }
        System.out.println("\n");

        //b)int do while
        int a = 0;
        do {
            System.out.println(masivsInt[a]);
            a++;
        } while (a<masivsInt.length);

        System.out.println("\n");

        //b)String do while
        int d = 0;                ;
                do{
                    System.out.println(muzikasInstruments[d]);
                    d++;
                }while (d<muzikasInstruments.length);

        System.out.println("\n");

        //b)char do while
        int g = 0;
        do{System.out.println(vards[g]);
            g++;
        }while (g<vards.length);
        System.out.println("\n");

        //c)int for loop
        for(int e = 0; e < 10; e++) {
            System.out.print(masivsInt[e]);
        }
        System.out.println("\n");

        //c)String for loop
        for(int p = 0; p < 4; p++) {
            System.out.println(muzikasInstruments[p]);
        }
        System.out.println("\n");

        //c)char for loop
        for(int n = 0; n < 5; n++) {
            System.out.print(vards[n]);
        }
        System.out.println("\n");

        //d)int for each
        for(int h = 0; h < masivsInt.length; h++) {
            masivsInt[h] = h*3;
        }
        for(int cipari : masivsInt) {
            System.out.println(cipari);
        }
        System.out.println("\n");

        //d)String for each
        for(String instruments : muzikasInstruments) {
            System.out.println(instruments);
        }
        System.out.println("\n");

        //d)char for each
        for(char name : vards) {
            System.out.println(name);
        }
        System.out.println("\n");


        //3. uzdevums
        int[] masivsSkaitli = new int[101];
        for(int m = 0; m < masivsSkaitli.length; m++) {
            masivsSkaitli[m] = m*1;
        }
        for(int vertiba : masivsSkaitli) {
            System.out.print(vertiba);
        }
        System.out.println("\n");

        //4.uzdevums

        int skaitlis;
        long factorials = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Ievadi skaitli");
        skaitlis = input.nextInt();
        input.close();
        if(skaitlis < 0)
            System.out.println("Rezultāts nav iespējams");
        else if (skaitlis <= 1)
            System.out.printf("%d! = %d", skaitlis, factorials);
        else{
            for(int counter = skaitlis; counter >= 2; counter--) {
                factorials = factorials * counter;
            }
            System.out.printf("%d! = %d", skaitlis, factorials);
        }


//        int number = 4, factorial = 1;
//        if(number < 0)
//            System.out.println("Rezultāts nav iespējams");
//        else if (number  <= 1)
//            System.out.printf("%d! = %d", number, factorial);
//        else {
//            for(int counter = number; counter >=2; counter--) {
//                factorial = factorial * counter;
//            }
//            System.out.printf("%d! = %d", number, factorial);
//        }



    }
}
