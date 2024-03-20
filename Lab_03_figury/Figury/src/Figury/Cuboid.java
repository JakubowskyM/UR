package Figury;

public class Cuboid {
    private double a;
    private double b;
    private double c;
    private String name="Prostopadloscian ";

    private double Objt(double a,double b,double c){ return a*b*c;}
    private double Pole(double a,double b,double c){ return (2*(a*b))+(2*(a*c))+(2*(b*c));}

    public double getA() {
        return a;
    }
    public double getB() {return b;}
    public double getC() {return c;}
    public void view() {
        System.out.format("Figura: %s, bok a: %.2f, bok b: %.2f, bok c: %.2f, pole powierzchni: %.2f, objetosc: %.2f", name, a,b,c,
                Pole(a,b,c), Objt(a,b,c));
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
}

