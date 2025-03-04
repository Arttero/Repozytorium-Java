package Tasks;
import java.util.Scanner;

public class Run {


    TasksLab2 tasksLab2 = new TasksLab2();

    //obiekt klasy Inputdata
    InputData inputData = new InputData();

    public void RunMain() {
        Menu();
    }


    private void Menu() {
        while (true) {
            System.out.println("\n1. Task 1");
            System.out.println("2. Task 2");
            System.out.println("3. Task 3");
            System.out.println("4. Task 4");
            System.out.println("5. Task 5");
            System.out.println("6. Task 6");
            System.out.println("7. Task 7");
            System.out.println("0. Exit");
            System.out.println("Select a task: ");

            int choose = inputData.InputInt();
            switch (choose) {
                case 1:
                    System.out.print("Podaj a:");
                    int a = inputData.InputInt();
                    System.out.print("Podaj b:");
                    int b = inputData.InputInt();
                    System.out.print("Podaj c:");
                    int c = inputData.InputInt();
                    tasksLab2.Task01(a,b,c);
                    break;
                case 2:
                    System.out.printf("Podaj x: ");
                    double x2 = inputData.InputDouble();
                    tasksLab2.Task02(x2);
                    break;
                case 3:
                    System.out.printf("Podaj x: ");
                    int x3 = inputData.InputInt();
                    System.out.printf("Podaj y: ");
                    int y3 = inputData.InputInt();
                    System.out.printf("Podaj z: ");
                    int z3 = inputData.InputInt();
                    tasksLab2.Task03(x3,y3,z3);
                    break;
                case 4:
                    System.out.printf("Czy pada deszcz (true/false): ");
                    boolean Deszcz = inputData.boleanInput();
                    System.out.printf("Czy jest autobus na przystanku (true/false): ");
                    boolean Autobus = inputData.boleanInput();
                    tasksLab2.Task04(Deszcz, Autobus);
                    break;
                case 5:
                    System.out.printf("Czy jest znizka na samochod (true/false): ");
                    boolean Samochod = inputData.boleanInput();
                    System.out.printf("Czy dostales premie (true/false):");
                    boolean Premia = inputData.boleanInput();
                    tasksLab2.Task05(Samochod, Premia);
                    break;
                case 6:
                    System.out.printf("Wybierz operacje:");
                    System.out.printf("\n1. Dodawanie\n2. Odejmowanie\n3. Mnozenie\n4. Dzielenie\n5. Reszta\n");
                    int choose6 = inputData.InputInt();
                    System.out.printf("Podaj a: ");
                    int a6 = inputData.InputInt();
                    System.out.printf("Podaj b: ");
                    int b6 = inputData.InputInt();
                    tasksLab2.Task06(choose6,a6,b6);
                    break;
                
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Wrong input!");
            }
        }
    }
}
