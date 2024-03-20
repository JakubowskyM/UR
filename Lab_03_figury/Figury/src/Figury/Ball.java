package Figury;

public class Ball {
    private double r;
    private String name="Kula ";

    private double Pole(double r) {return 4*Math.PI*Math.pow(r,2);}
    private double Objt(double r) {return (4/3)*Math.PI*Math.pow(r,3);}

    public void setR(double r) {
        this.r = r;
    }
    public void view () {
        System.out.format("Figura: %s, promien r: %.2f, pole: %.2f, obwod: %.2f", name, r,
                Pole(r), Objt(r));
    }
}
