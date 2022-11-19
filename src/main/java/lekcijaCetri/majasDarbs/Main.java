package lekcijaCetri.majasDarbs;

import lekcijaCetri.majasDarbs.classHomework.Trissturis;

public class Main {
    public static void main(String[] args) {
        //2.1. uzdevums
        Trissturis trissturis1 = new Trissturis();
        trissturis1.trissturaMalaA = 3;
        trissturis1.trissturaMalaB = 3;
        trissturis1.trissturaMalaC = 3;
        trissturis1.trissturaLaukums();

        System.out.println(trissturis1.pusperimetrs());
        System.out.println(trissturis1.trissturaLaukums());
        System.out.println(trissturis1.vaiVienadMalu());
        System.out.println(trissturis1.vaiVienadSanu());


    //2.2. uzdevums
        System.out.println("\nVeidojam jaunu trīsstūri");
        Trissturis trissturis2 = new Trissturis(3, 3, 4);
        System.out.println(trissturis2.pusperimetrs());
        System.out.println(trissturis2.trissturaLaukums());
        System.out.println(trissturis2.vaiVienadMalu());
        System.out.println(trissturis2.vaiVienadSanu());
}





}





