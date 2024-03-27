public class SamochodOsobowy extends Samochod {
    private double waga, pojemnosc_silnika;
    private int ilosc_miejsc;

    public SamochodOsobowy(String kolor, String marka, String model, int rok_produkcji, int przebieg, double waga, double pojemnosc_silnika, int ilosc_miejsc) {
        super(kolor, marka, model, rok_produkcji, przebieg);
        this.waga = waga;
        this.pojemnosc_silnika = pojemnosc_silnika;
        this.ilosc_miejsc = ilosc_miejsc;
    }



    public void info () {
    super.info();
        System.out.println(", waga: "+getWaga()+" kg"+", pojemnosc silnika: "+getPojemnosc_silnika()+", ilość miejsc: "+getIlosc_miejsc());

    }

    
    public void ustawParametry() {
        super.ustawParametry();
        Input input = new Input();
        System.out.println("Podaj wage: (od 2 do 4,5 ton) ");
        this.waga= input.InputDb();
        while(waga>4.5 || waga<2)
        {
            System.out.println("Podaj poprawna wage: ");
            this.waga=input.InputDb();
        };
        System.out.println("Podaj pojemnosc silnika: ");
        this.pojemnosc_silnika= input.InputDb();
        while(pojemnosc_silnika>3 || pojemnosc_silnika<0.8)
        {
            System.out.println("Podaj poprawna pojemnosc silnika:");
            this.pojemnosc_silnika=input.InputDb();
        };
        System.out.println("Podaj ilośc miejsc: ");
        this.ilosc_miejsc= input.InputInt();
    }

    public SamochodOsobowy() {

    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public double getPojemnosc_silnika() {
        return pojemnosc_silnika;
    }

    public void setPojemnosc_silnika() {
        this.pojemnosc_silnika = pojemnosc_silnika;
    }

    public int getIlosc_miejsc() {
        return ilosc_miejsc;
    }

    public void setIlosc_miejsc(int ilosc_miejsc) {
        this.ilosc_miejsc = ilosc_miejsc;
    }
}
