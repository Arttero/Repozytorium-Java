package Tasks;

import java.util.Scanner;

public class Run {

    //obiekty klasy tasks
    TasksLab1 tasksLab1 = new TasksLab1();
    TasksLab2 tasksLab2 = new TasksLab2();
    TasksLab3 tasksLab3 = new TasksLab3();
    TasksLab4 tasksLab4 = new TasksLab4();
    TasksLab5 tasksLab5 = new TasksLab5();

    //obiekt klasy Inputdata
    InputData inputData = new InputData();

    public void RunMain() {
        Menu();
    }

    private void Menu() {
        while (true) {
            System.out.println("\n1. Lab 1");
            System.out.println("2. Lab 2");
            System.out.println("3. Lab 3");
            System.out.println("4. Lab 4");
            System.out.println("5. Lab 5");
            System.out.println("0. Wyjście");
            System.out.print("Wybierz lab: ");

            int chooseLab = inputData.InputInt();

            switch (chooseLab) {
                case 1:
                    Lab1();
                    break;
                case 2:
                    Lab2();
                    break;
                case 3:
                    Lab3();
                    break;
                case 4:
                    Lab4();
                    break;
                case 5:
                    Lab5();
                    break;
                case 0:
                    System.out.printf("Wyjscie...");
                    return;
                default:
                    System.out.printf("Bledne dane");

            }
        }
    }

    // 1 Labolatorium
    private void Lab1() {
        while (true) {
            System.out.println("\n1. Zadanie 1");
            System.out.println("2. Zadanie 2");
            System.out.println("3. Zadanie 3");
            System.out.println("4. Zadanie 4");
            System.out.println("5. Zadanie 5");
            System.out.println("6. Zadanie 6");
            System.out.println("7. Zadanie 7");
            System.out.println("0. Powrót do menu glownego");
            System.out.print("Wybierz zadanie: ");

            int chooseZad = inputData.InputInt();

            switch (chooseZad) {
                case 1:
                    tasksLab1.Task01();
                    break;
                case 2:
                    tasksLab1.Task02();
                    break;
                case 3:
                    tasksLab1.Task03();
                    break;
                case 4:
                    tasksLab1.Task04();
                    break;
                case 5:
                    tasksLab1.Task05();
                    break;
                case 6:
                    tasksLab1.Task06();
                    break;
                case 7:
                    tasksLab1.Task07();
                    break;
                case 0:
                    System.out.printf("Wyjscie...");
                    return;
                default:
                    System.out.printf("Bledne dane");
            }
        }
    }

    // 2 Labolatorium
    private void Lab2() {
        while (true) {
            System.out.println("\n1. Zadanie 1");
            System.out.println("2. Zadanie 2");
            System.out.println("3. Zadanie 3");
            System.out.println("4. Zadanie 4");
            System.out.println("5. Zadanie 5");
            System.out.println("6. Zadanie 6");
            System.out.println("7. Zadanie 7");
            System.out.println("0. Wyjscie");
            System.out.println("Wybierz zadanie: ");

            int chooseZad = inputData.InputInt();
            switch (chooseZad) {
                case 1:
                    tasksLab2.Task01();
                    break;
                case 2:
                    tasksLab2.Task02();
                    break;
                case 3:
                    tasksLab2.Task03();
                    break;
                case 4:
                    tasksLab2.Task04();
                    break;
                case 5:
                    tasksLab2.Task05();
                    break;
                case 6:
                    tasksLab2.Task06();
                    break;
                case 0:
                    System.out.println("Wyjscie...");
                    return;
                default:
                    System.out.println("Bledne dane");
            }
        }
    }

    // 3 Labolatorium
    private void Lab3() {
        while (true) {
            System.out.println("\n1. Zadanie 1");
            System.out.println("2. Zadanie 2");
            System.out.println("3. Zadanie 3");
            System.out.println("4. Zadanie 4");
            System.out.println("5. Zadanie 5");
            System.out.println("0. Wyjscie");
            System.out.println("Wybierz zadanie: ");

            int chooseZad = inputData.InputInt();
            switch (chooseZad) {
                case 1:
                    tasksLab3.Task01();
                    break;
                case 2:
                    tasksLab3.Task02();
                    break;
                case 3:
                    tasksLab3.Task03();
                    break;
                case 4:
                    tasksLab3.Task04();
                    break;
                case 5:
                    tasksLab3.Task05();
                    break;
                case 0:
                    System.out.println("Wyjscie...");
                    return;
                default:
                    System.out.println("Bledne dane");
            }
        }
    }

    // 4 Labolatorium
    private void Lab4() {
        while (true) {
            System.out.println("\n1. Zadanie 1");
            System.out.println("2. Zadanie 2");
            System.out.println("3. Zadanie 3");
            System.out.println("4. Zadanie 4");
            System.out.println("5. Zadanie 5");
            System.out.println("6. Zadanie 6");
            System.out.println("7. Zadanie 7");
            System.out.println("0. Wyjscie");
            System.out.println("Wybierz zadanie: ");

            int chooseZad = inputData.InputInt();
            switch (chooseZad) {
                case 1:
                    tasksLab4.Task01();
                    break;
                case 2:
                    tasksLab4.Task02();
                case 3:
                    tasksLab4.Task03();
                    break;
                case 4:
                    tasksLab4.Task04();
                    break;
                case 5:
                    tasksLab4.Task05();
                    break;
                case 6:
                    tasksLab4.Task06();
                    break;
                case 7:
                    tasksLab4.Task07();
                    break;
                case 0:
                    System.out.printf("Wyjscie...");
                    return;
                default:
                    System.out.printf("Bledne dane");
            }
        }
    }
    private void Lab5(){
        while (true){
            System.out.println("\n1. Zadanie 1");
            System.out.println("2. Zadanie 2");
            System.out.println("3. Zadanie 3");
            System.out.println("4. Zadanie 4");
            System.out.println("0. Wyjscie");
            System.out.println("Wybierz zadanie: ");

            int chooseZad = inputData.InputInt();
            switch (chooseZad){
                case 1:
                    tasksLab5.Task01();
                    break;
                case 2:
                    tasksLab5.Task02();
                    break;
                case 3:
                    tasksLab5.Task03();
                    break;
                case 4:
                    tasksLab5.Task04();
                    break;
                case 0:
                    System.out.println("Wyjscie...");
                    return;
                default:
                    System.out.println("Bledne dane");
            }
        }
    }
    private void Lab6(){

    }
}