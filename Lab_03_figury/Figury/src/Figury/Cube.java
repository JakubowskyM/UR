package Figury;

public class Cube {
    private double a;
    private String name="Sześcian ";

    private double Volume(double a){ return Math.pow(a,3);}
    private double Pole(double a){ return a*6;}

    public double getA() {
        return a;
    }
    public void view() {
        System.out.format("Figura: %s, bok a: %.2f, pole powierzchni: %.2f, objetosc: %.2f", getName(), a,
            Pole(a), Volume(a));
    }
    public void setA(double a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
