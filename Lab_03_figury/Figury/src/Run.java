import Figury.*;

public class Run {
    Input input = new Input();

    public void running() {
        int wybor;

        while (true) {
            Menu();
            wybor=input.InputInt();
            switch(wybor) {
                case 1 ->viewCircle();
                case 2 ->viewSquare();
                case 3 ->viewRectangle();
                case 4 ->viewCube();
                case 5 ->viewCuboid();
                case 6 ->viewBall();
                case 7 ->viewCone();
                case 8 ->Close();
                default -> defaultInstruction();
            }

        }
    }

    private void defaultInstruction() {
        System.out.println("Bledne dane, koniec programu");
        System.exit(0);
    }

    private void viewCircle(){
        System.out.println("Podaj r: ");
        double promien = input.InputDb();
        Circle kolo =new Circle();
        kolo.setR(promien);
        kolo.view();
    }
    private void viewSquare(){
        System.out.println("Podaj a: ");
        double bok = input.InputDb();
        Square kwadrat = new Square();
        kwadrat.setA(bok);
        kwadrat.view();
    }
    private void viewRectangle(){
        System.out.println("Podaj a: ");
        double boka = input.InputDb();
        System.out.println("Podaj b: ");
        double bokb = input.InputDb();
        Rectangle kwadrat = new Rectangle();
        kwadrat.setA(boka);
        kwadrat.setB(bokb);
        kwadrat.view();
    }
    private void viewCube(){
        System.out.println("Podaj a: ");
        double a = input.InputDb();
        Cube szesc = new Cube();
        szesc.setA(a);
        szesc.view();
    }
    private void viewCuboid(){
        System.out.println("Podaj a: ");
        double a = input.InputDb();
        System.out.println("Podaj b: ");
        double b = input.InputDb();
        System.out.println("Podaj c: ");
        double c = input.InputDb();
        Cuboid szesc = new Cuboid();
        szesc.setA(a);
        szesc.setB(b);
        szesc.setC(c);
        szesc.view();
    }
    private void viewBall(){
        System.out.println("Podaj r: ");
        double r = input.InputDb();
        Ball kula = new Ball();
        kula.setR(r);
        kula.view();
    }
    private void viewCone(){
        System.out.println("Podaj r: ");
        double r = input.InputDb();
        System.out.println("Podaj H: ");
        double H = input.InputDb();
        System.out.println("Podaj l: ");
        double l = input.InputDb();
        Cone stoz = new Cone();
        stoz.setR(r);
        stoz.setH(H);
        stoz.setL(l);
        stoz.view();
    }
    private void Close(){
        System.out.println("Czy na pewno chcesz wyjsc?(t/n): ");
        String znak = input.InputC();
        if(znak=="t" || znak=="T") System.exit(0);
    }
    private void Menu(){
        System.out.println(" \nKalkulator figur geometrycznych ");
        System.out.println("1. Kolo \n");
        System.out.println("2. Kwadrat \n");
        System.out.println("3. Prostokat \n");
        System.out.println("4. Sześcian \n");
        System.out.println("5. Prostopadłościan \n");
        System.out.println("6. Kula \n");
        System.out.println("7. Stożek \n");
        System.out.println("Wybierz opcje: ");

    }
}
