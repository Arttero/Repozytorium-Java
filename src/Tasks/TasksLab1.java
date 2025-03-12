package Tasks;

import java.util.Random;

public class TasksLab1 {
    //obiekt klasy Inputdata
    InputData inputData = new InputData();

    private String name = "Jan Nowak";
    private int age = 22;

    protected void Task01() {
        System.out.println("Imie: " + name+ " Wiek: " + age);
    }

    protected void Task02() {
        System.out.print("Podaj liczbę a: ");
        int a = inputData.InputInt();
        System.out.print("Podaj liczbę b: ");
        int b = inputData.InputInt();

        int sum = a + b;
        System.out.println("Suma: " + sum);
        int diff = a - b;
        System.out.println("Roznica: " + diff);
        int product = a * b;
        System.out.println("Iloczyn: " + product);
    }

    protected void Task03() {
        System.out.print("Podaj liczbę: ");
        int number = inputData.InputInt();

        if (number % 2 == 0){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    protected void Task04() {
        System.out.print("Podaj liczbę: ");
        int number4 = inputData.InputInt();

        if (number4 % 3 == 0){
            if (number4 % 5 == 0){
                System.out.println("True");
            }
        }
        else
            System.out.println("False");
    }

    protected void Task05() {
        System.out.print("Podaj liczbę: ");
        float number5 = inputData.InputFloat();

        float pow = (float) Math.pow(number5, 3);
        System.out.println("Wynik do potegi 3: " + pow);
    }

    protected void Task06() {
        System.out.print("Podaj liczbę: ");
        float number6 = inputData.InputFloat();

        float root = (float) Math.sqrt(number6);
        System.out.println("Pierwiastek kwadratowy: " + root);
    }

    protected boolean Task07() {
        System.out.print("Podaj liczbę a: ");
        int a7 = inputData.InputInt();
        System.out.print("Podaj liczbę b: ");
        int b7 = inputData.InputInt();
        if(a7 > b7) {
            int tmp = a7;
            a7 = b7;
            b7 = tmp;
        }
        Random random = new Random();
        int a = random.nextInt(b7 - a7 + 1) + a7;
        int b = random.nextInt(b7 - a7 + 1) + a7;
        int c  = random.nextInt(b7 - a7 + 1) + a7;

        int[] arr = {a,b,c};
        java.util.Arrays.sort(arr);
        a = arr[0];
        b = arr[1];
        c = arr[2];


        boolean result = a*a+b*b==c*c;
        System.out.println("Wynik: " + result);
        return result;
    }
}

