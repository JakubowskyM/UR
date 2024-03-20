package Figury;

public class Rectangle {
    private double a;
    private double b;
    private String name = "Prostokąt ";

    private double Pole(double a,double b) {
        return a*b;
    }

    private double obwod(double a, double b) {
        return (2 * a)+(2 * b);
    }

    public void view() {
        System.out.format("Figura: %s, bok a: %.2f,bok b: %.2f, pole: %.2f, obwod: %.2f", name, a, b,
                Pole(a,b), obwod(a,b));
    }

    public double getA() {
        return a;
    }

    public void setA(double x) {
        this.a = x;
    }
    public void setB(double x) {
        this.b = x;
    }

    public String getName() {
        return name;
    }
}




