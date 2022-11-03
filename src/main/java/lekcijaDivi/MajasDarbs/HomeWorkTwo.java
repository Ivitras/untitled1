package lekcijaDivi.MajasDarbs;

import java.util.Scanner;

public class HomeWorkTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        //a un b
        int x = 1;
        System.out.println(x > 0);
        System.out.println(x < 0);

        //c
        x = 6;
        System.out.println(x > 5 && x <= 10);

        //d
        x = 7;
        System.out.println(x <= 5 && x < 10);
        // d - loģiskais nē
        System.out.println(!(x <= 5 && x < 10));

        //e
        System.out.println(x == 0 || x == 10);

        //f
        x = 6;
        System.out.println(x * x > 10);

////
////        // 2. uzdevums (kā mācījāmies lekcijā)
////        int menesaSkaitlis = 5;
////        switch(menesaSkaitlis) {
////            case 1:
////                System.out.println("Janvāris");
////                break;
////            case 2:
////                System.out.println("Februāris");
////                break;
////            case 3:
////                System.out.println("Marts");
////                break;
////            case 4:
////                System.out.println("Aprīlis");
////                break;
////            case 5:
////                System.out.println("Maijs");
////                break;
////            case 6:
////                System.out.println("Jūnijs");
////                break;
////            case 7:
////                System.out.println("Jūlijs");
////                break;
////            case 8:
////                System.out.println("Augusts");
////                break;
////            case 9:
////                System.out.println("Septembris");
////                break;
////            case 10:
////                System.out.println("Oktobris");
////                break;
////            case 11:
////                System.out.println("Novembris");
////                break;
////            case 12:
////                System.out.println("Decembris");
////                break;
////            default:
////                System.out.println("Nav tāda mēneša");
////        }

         //2. uzdevums (kā es to saprotu)

        System.out.println("Uzraksti mēneša skaitli:");
        int menesaSkaitlis = scanner.nextInt();
        switch(menesaSkaitlis) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 3:
                System.out.println("Marts");
                break;
            case 4:
                System.out.println("Aprīlis");
                break;
            case 5:
                System.out.println("Maijs");
                break;
            case 6:
                System.out.println("Jūnijs");
                break;
            case 7:
                System.out.println("Jūlijs");
                break;
            case 8:
                System.out.println("Augusts");
                break;
            case 9:
                System.out.println("Septembris");
                break;
            case 10:
                System.out.println("Oktobris");
                break;
            case 11:
                System.out.println("Novembris");
                break;
            case 12:
                System.out.println("Decembris");
                break;
            default:
                System.out.println("Nav tāda mēneša");
        }

        //3. uzdevums a>b>c

        int nr1,nr2,nr3,largest;
        Scanner input = new Scanner(System.in);

        System.out.println("Ievadi 1. skaitli");
        nr1 = input.nextInt();
        System.out.println("Ievadi 2. skaitli");
        nr2 = input.nextInt();
        System.out.println("Ievadi 3. skaitli");
        nr3 = input.nextInt();
        input.close();

        if(nr1 > nr2 && nr1 > nr3)
            largest = nr1;
        else if(nr2 > nr1 && nr2 > nr3)
            largest = nr2;
        else largest = nr3;
        System.out.printf("Lielākais skaitlis ir %d", largest);
        System.out.println();
        System.out.println();

        //4.uzdevums


        String luksofors = "sarkans/ dzeltens/ zaļš/ Nedeg gaisma";
        System.out.println("Uzraksti luksofora krāsu:");
        luksofors = scanner.nextLine();

        if(luksofors.equals("sarkans")){
            System.out.println("Stāvi!");
        }else if (luksofors.equals("dzeltens")) {
            System.out.println("Gaidi!!");
        }else if (luksofors.equals("zaļš")) {
            System.out.println("Ej!");
        }else if (luksofors.equals("Nedeg gaisma")) {
            System.out.println("Šķērso ceļu uzmanīgi!");
        }else{
            System.out.println("Nav tādas luksofora krāsas");
        }
        System.out.println();
        System.out.println();


        //5.uzdevums

        printBusinessCard();
        }
        public static void printBusinessCard() {
            for (int i = 0; i < 3; i = i + 1 )
            System.out.println("Vizitkarte" + "\n##########" + "\nVārds: Ivita" +
                    "\nUzvārds: Vasiļevska" + "\nTelefona Nr. 26899528" + "\nDzimšanas gads: 1983\n");
      }
}


