package Tasks;



public class TasksLab2 {

    //zad 2
    private double a2(double x) {
        if (x > 0) {
            return 2 * x;
        }
        else if (x == 0) {
            return 0;
        }
        else {
            return -3 * x;
        }
    }
    private double b2(double x) {
        if (x>=1){
            return x*x;
        }
        else {
            return x;
        }
    }
    private double c2(double x) {
        if (x>2){
            return 2+x;
        }else if (x==2){
            return 8;
        }else {
            return x-4;
        }
    }

    protected void Task01(int a, int b,int c) {
        System.out.printf("Wzor: "+a+"x^2+"+b+"x+"+c+"=0\n");
        int x1 = (int) (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        int x2 = (int) (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        System.out.printf("x1 = %d\n", x1);
        System.out.printf("x2 = %d\n", x2);
        System.out.print("\nTask 1 completed");
    }
    protected void Task02(double x) {
        double resultAx = a2(x);
        double resultBx = b2(x);
        double resultCx = c2(x);
        System.out.printf("Wynik dla x = "+x+ ":\n");
        System.out.printf("a(x): "+resultAx);
        System.out.printf("\nb(x): "+resultBx);
        System.out.printf("\nc(x): "+resultCx);
        System.out.print("\nTask 2 completed");

    }
    protected void Task03(int x,int y,int z) {
        int temp;
        if (x > y){
            temp = x;
            x = y;
            y = temp;
        }
        if (y > z){
            temp = y;
            y = z;
            z = temp;
        }
        if (x > y){
            temp = x;
            x = y;
            y = temp;
        }
        System.out.printf("Posortowane liczby: %d %d %d\n",x,y,z);
        System.out.print("\nTask 3 completed");
    }
    protected void Task04(boolean Deszcz, boolean Autobus) {
        if (Deszcz && Autobus){
            System.out.printf("Wez parasol");
            System.out.printf("Dostaniesz sie na uczelnie");
        } else if (Deszcz && !Autobus){
            System.out.printf("Nie dostaniesz sie na uczelnie");
        } else if (!Deszcz && Autobus){
            System.out.printf("Dostaniesz sie na uczelnie");
            System.out.printf("Milego dnia i pieknej pogody");
        }
        System.out.printf("\nTask 4 completed");
    }
    protected void Task05(boolean Samochod, boolean Premia) {
        if (!Samochod || Premia){
            System.out.printf("Mozesz kupic samochod\n Znizki na samochod nie ma");
        } else if (!Samochod || !Premia){
            System.out.printf("Zakup samochodu trzeba odlozyc na pozniej\nZnizki na samochod nie ma");
        }else if (Samochod || Premia){
            System.out.printf("Mozesz kupic samochod");
        }
    }
    protected void Task06(int choose6,int a6,int b6) {
        switch (choose6) {
            case 1:
                System.out.printf("Wynik = "+(a6+b6)+"\n");
                break;
                case 2:
                    System.out.printf("Wynik = "+(a6-b6)+"\n");
                    break;
                    case 3:
                        System.out.printf("Wynik = "+(a6*b6)+"\n");
                        break;
                        case 4:
                            System.out.printf("Wynik = "+(a6/b6)+"\n");
            case 5:
                System.out.printf("Wynik = "+(a6%b6)+"\n");
                break;
                default:
                    System.out.println("Wrong input!");
        }
    }
}
