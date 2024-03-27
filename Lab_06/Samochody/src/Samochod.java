public class Samochod {
    private String kolor,marka,model;
    private int rok_produkcji, przebieg;

    public Samochod(String kolor, String marka, String model, int rok_produkcji, int przebieg) {
        this.kolor = kolor;
        this.marka = marka;
        this.model = model;
        this.rok_produkcji = rok_produkcji;
        this.przebieg = przebieg;
    }
    public Samochod(String kolor, String model, int rok_produkcji, int przebieg) {
        this.kolor = kolor;
        this.marka = "Fiat";
        this.model = model;
        this.rok_produkcji = rok_produkcji;
        this.przebieg = przebieg;
    }
 public Samochod(){
        setKolor("Biały");
        setMarka("BMW");
        setModel("E46");
        setRok_produkcji(2003);
        setPrzebieg(120000);
    }

    public void info(){
        System.out.println("Marka: "+getMarka()+", Model: "+getModel()+
                ", rok produkcji: "+getRok_produkcji()+", przebieg "+getPrzebieg()+" km"+
                ", kolor: "+getKolor());

    }
    public void ustawParametry() {
        Input input = new Input();
        System.out.println("Wpisz kolor");
        this.kolor = input.InputC();
        System.out.println("Podaj marke");
        this.marka = input.InputC();
        System.out.println("Podaj model");
        this.model = input.InputC();
        System.out.println("Podaj rok produkcji");
        this.rok_produkcji = input.InputInt();
        System.out.println("Podaj przebieg");
        this.przebieg = input.InputInt();
    }
    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRok_produkcji() {
        return rok_produkcji;
    }

    public void setRok_produkcji(int rok_produkcji) {
        this.rok_produkcji = rok_produkcji;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }
}
