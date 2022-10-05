package lekcijaViens.majasDarbs;

public class Main {
    public static void main(String[] args) {
        String valstsNosaukums = "Gibraltārs";
        System.out.println(valstsNosaukums);

        int iedzivotajuSkaits = 34003;
        System.out.println(iedzivotajuSkaits);

        double valstsPlatiba = 6.8;
        System.out.println(valstsPlatiba);

        String galvaspilseta = "Gibraltārs";
        System.out.println(galvaspilseta);

        String valstsValoda = "angļu";
        System.out.println(valstsValoda);

        //Gibraltārs ir Apvienotās karalistes teritorija, vairs nav ES sastāvā
        boolean vaiIrESDalibvalsts = false;

        if(vaiIrESDalibvalsts==true){
            System.out.println("izstājies no ES savienības");
        }
        if(vaiIrESDalibvalsts==false){
            System.out.println("nav ES dalībvalsts");
        }

        char valuta = 'G';
        System.out.println(valuta);

        System.out.println(valstsNosaukums + " - Apvienotās Karalistes teritorija ar " + iedzivotajuSkaits + " tūkstoši iedzīvotājiem.\n" +
                "Teritorijas platība ir " + valstsPlatiba + " km2. \n" + "Teritorijas nosaukums ir arī galvaspilsēta - " + galvaspilseta + ".\nOficiālā valoda ir " + valstsValoda + " valoda.\n" +
                "Vai valsts ir ES dalībvalsts? - " + (vaiIrESDalibvalsts==true) + ".\nValsts valūta ir " + valuta + " jeb Gibraltāra mārciņa.");



        int a = 11;
        int b = 12;
        int c = 3;
        int summa;
        summa = a + b;
        System.out.println(summa);
        summa = a+a;
        System.out.println(summa);
        summa = a + c + b;
        System.out.println(summa);

        int d = 4;
        int e = 53;
        summa = d - e;
        System.out.println(summa);
        summa = a - d - e;
        System.out.println(summa);
        summa = e - d - a - b;
        System.out.println(summa);

        int f = 6;
        int g = 230;
        summa = f * g;
        System.out.println(summa);
        summa = a * e * g;
        System.out.println(summa);
        summa = b * b * b;
        System.out.println(summa);


        int h = 483;
        int i = 67;
        summa = h / i;
        System.out.println(summa);
        summa = h / a * c;
        System.out.println(summa);
        summa = g / d + b;
        System.out.println(summa);
        summa = h/(i+a)/c;
        System.out.println(summa);

        summa = i % a;
        System.out.println(summa);
        summa = h % a % c;
        System.out.println(summa);
        summa = b % b;
        System.out.println(summa);


    }
}
