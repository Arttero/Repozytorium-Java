package Tasks;

import Tasks.Lab1.Lab1menu;
import Tasks.Lab2.Lab2menu;
import Tasks.Lab3.Lab3menu;
import Tasks.Lab4.Lab4menu;
import Tasks.Lab5.Lab5menu;
import Tasks.Lab6.Lab6menu;

//utworzenie klasy typu run
public class Run {

    //obiekty klasy lab
    Lab1menu lab1 = new Lab1menu();
    Lab2menu lab2 = new Lab2menu();
    Lab3menu lab3 = new Lab3menu();
    Lab4menu lab4 = new Lab4menu();
    Lab5menu lab5 = new Lab5menu();
    Lab6menu lab6 = new Lab6menu();

    //obiekt klasy Inputdata
    InputData inputData = new InputData();

    //metoda runmain menu
    public void RunMain() {
        Menu();
    }

    //utworzenie menu
    private void Menu() {
        while (true) {
            System.out.println("\n1. Lab 1");
            System.out.println("2. Lab 2");
            System.out.println("3. Lab 3");
            System.out.println("4. Lab 4");
            System.out.println("5. Lab 5");
            System.out.println("6. Lab 6");
            System.out.println("0. Wyjście");
            System.out.print("Wybierz lab: ");

            int chooseLab = inputData.InputInt();

            //wybor labolatoria
            switch (chooseLab) {
                case 1:
                    lab1.Lab1();
                    break;
                case 2:
                    lab2.Lab2();
                    break;
                case 3:
                    lab3.Lab3();
                    break;
                case 4:
                    lab4.Lab4();
                    break;
                case 5:
                    lab5.Lab5();
                    break;
                case 6:
                    lab6.Lab6();
                    break;
                case 0:
                    System.out.printf("Wyjscie...");
                    return;
                default:
                    System.out.printf("Bledne dane");

            }
        }
    }
}