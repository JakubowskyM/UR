package Figury;

public class Cone {
    private double r;
    private double H;
    private double l;
    private String name="Stożek";

    private double Pole(double r, double l) {
        return (Math.PI*r)*(r+l);

    }
    private double Objt(double r, double l, double H) {
        return (Math.PI*Math.pow(r,2)*H)/3;

    }
    public void setR(double r) {
        this.r = r;
    }
    public void setH(double h) {
        this.H = h;
    }

    public void setL(double l) {
        this.l = l;
    }
    public void view() {
        System.out.format("Nazwa figury: %s, promien: %.2f, wysokość: %.2f, L: %.2f, Pole: %.2f, Objętość: %.2f ", name, r, H, l,
                Pole(r,l),Objt(r,l,H));

    }
}
