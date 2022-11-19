package lekcijaCetri.majasDarbs.classHomework;

public class Trissturis {

    //1. uzdevums

    public int trissturaMalaA;

    public int trissturaMalaB;
    public int trissturaMalaC;
    public double trissturaLaukums;
    public double pusperimetrs;
    public boolean vaiVienadMalu = true;
    public boolean vaiVienadSanu = true;


    //b)no-arg konstuktors
    public Trissturis() {
        System.out.println("Veidojam trīsstūri\n");
    }

    //c)arg konstruktors
    public Trissturis(int trissturaMalaA, int trissturaMalaB, int trissturaMalaC) {
        this.trissturaMalaA = 3;
        this.trissturaMalaB = 3;
        this.trissturaMalaC = 3;

        //pusperimetra aprēķins
        this.pusperimetrs = (trissturaMalaA + trissturaMalaB + trissturaMalaC)/ 2;
        System.out.println("Pusperimetrs ir " + pusperimetrs);
        //Hērona formula
        this.trissturaLaukums = Math.sqrt(pusperimetrs * (pusperimetrs - trissturaMalaA)
                * (pusperimetrs - trissturaMalaB) * (pusperimetrs - trissturaMalaC));
        System.out.println("Trīsstūra laukums ir " + trissturaLaukums);
    }
    public double pusperimetrs() {
        return (trissturaMalaA + trissturaMalaB + trissturaMalaC)/2;
    }
    public double trissturaLaukums() {
        return trissturaLaukums = Math.sqrt(pusperimetrs * (pusperimetrs - trissturaMalaA)
                * (pusperimetrs - trissturaMalaB) * (pusperimetrs - trissturaMalaC));
    }
    public void printetTrissturaLaukumu() {
        System.out.println(trissturaLaukums());
    }

    //d)vai vienādmalu
    public boolean vaiVienadMalu() {
        System.out.println("Vai trīsstūris ir vienādmalu?");
        if (trissturaMalaA == trissturaMalaB && trissturaMalaA ==
                trissturaMalaC && trissturaMalaB == trissturaMalaC) {
            return true;
        } else {
            return false;
        }
    }

    //c) vai vienādsānu
    public boolean vaiVienadSanu() {
        System.out.println("Vai trīsstūris ir vienādsānu?");
        if (trissturaMalaA == trissturaMalaB || trissturaMalaA == trissturaMalaC
                || trissturaMalaB == trissturaMalaC) {
            return true;
        } else {
            return false;
        }
    }


}
