package Figury;

public class Square {
    private double a;
    private String name = "Kwadrat ";

    private double Pole(double a) {
        return Math.pow(a, 2);
    }

    private double obwod(double a) {
        return 4 * a;
    }

    public void view() {
        System.out.format("Figura: %s, bok: %.2f, pole: %.2f, obwod: %.2f", name, a,
                Pole(a), obwod(a));
    }

    public double getA() {
        return a;
    }

    public void setA(double r) {
        this.a = r;
    }

    public String getName() {
        return name;
    }
}



