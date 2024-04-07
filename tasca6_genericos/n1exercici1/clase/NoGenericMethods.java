package tasca6_genericos.n1exercici1.clase;

public class NoGenericMethods {


    private double decimal1;
    private double decimal2;
    private double decimal3;


    public NoGenericMethods(double  decimal1, double decimal2, double decimal3) {
        this.decimal1 = decimal1;
        this.decimal2 = decimal2;
        this.decimal3 = decimal3;
    }

    public double getDecimal1() {
        return decimal1;
    }

    public double getDecimal2() {
        return decimal2;
    }

    public double getDecimal3() {
        return decimal3;
    }

    public void setDecimal1(double decimal1) {
        this.decimal1 = decimal1;
    }

    public void setDecimal2(double decimal2) {
        this.decimal2 = decimal2;
    }

    public void setDecimal3(double decimal3) { this.decimal3 = decimal3; }


     public void extrae() {
        double[] objeto = {decimal1, decimal2, decimal3};
         System.out.print("Lista extraida: ");
         for(double i : objeto){
             System.out.print(i + ", ");
         }
         System.out.println();
    }


}