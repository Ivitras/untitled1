package lekcijaPieci.majasDarbs;

import lekcijaPieci.labDarbs.House;
    //5.uzdevums -2 cilindri: no-arg un ar parametriem

public class Main {
    public static void main(String[] args) {

        Cilindrs cilindrs1 = new Cilindrs();
        System.out.println("Cilindrs 1:");

        //6. uzdevums - parametri ar setteri
        cilindrs1.setRadiuss(20);
        cilindrs1.setAugstums(52);

        //7. uzdevums -abu cilindru augstums un rādiuss ar getteriem
        System.out.println("Cilindra 1 rādiuss ir " + cilindrs1.getRadiuss());
        System.out.println("Cilindra 1 augstums ir " + cilindrs1.getAugstums());

        Cilindrs cilindrs2 = new Cilindrs(60,55);
        System.out.println("\nCilindrs 2:");
        cilindrs2.printCilindrs();
        System.out.println("\n");

        //8.uzdevums - abu cilindru tilpuma un virsmas aprēķins
        System.out.println("Cilindra 1 virsmas laukums ir " + cilindrs1.getCilindraLaukums());
        System.out.println("Cilindra 1 tilpums ir " + cilindrs1.getCilindraTilpums());
        System.out.println("Cilindra 2 Virsmas laukums ir " + cilindrs2.getCilindraLaukums());
        System.out.println("Cilindra 2 Virsmas tilpums ir " + cilindrs2.getCilindraTilpums());








    }
}
