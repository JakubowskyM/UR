public class Circle {
    private double r;
    private String name="Koło ";

    private double Pole(double r) {
        return Math.PI*Math.pow(r,2);
    }
    private double obwod(double r) {
        return 2*Math.PI*r;
    }
    public void view () {
        System.out.format("Figura: %s, promien: %.2f, pole: %.2f, obwod: %.2f",name, r,
                Pole(r), obwod(r));
    }
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
