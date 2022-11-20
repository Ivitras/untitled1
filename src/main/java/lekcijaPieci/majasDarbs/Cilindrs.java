package lekcijaPieci.majasDarbs;

public class Cilindrs {

    //1.uzdevums - mainīgie
    private double radiuss;
    private double augstums;

//    2.uzdevums - getteris, setteris
    public double getRadiuss() {return radiuss;}

    public void setRadiuss(double radiuss) {this.radiuss = radiuss;}

    public double getAugstums() {return augstums;}

    public void setAugstums(double augstums) {this.augstums = augstums;}

    //3.uzdevums - metodes tilpuma un virsmas laukuma aprēķinam

    public double getCilindraLaukums (){
        return 2 * Math.PI * radiuss * augstums;
    }
    public double getCilindraTilpums (){
        return Math.PI * radiuss * radiuss * augstums;
    }

    //4. uzdevums - konstruktori: no-arg un ar padotu rādiusu, augstumu

    public Cilindrs(){
    }

    public Cilindrs(double radiuss, double augstums) {
        this.radiuss = radiuss;
        this.augstums = augstums;
    }

    public void printCilindrs() {
        System.out.println("Cilindra rādiuss " + radiuss);
        System.out.println("Cilindra augstums " + augstums);

    }

}
