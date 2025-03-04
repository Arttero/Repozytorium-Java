package Tasks;

import java.util.Scanner;

public class Run {

    //obiekty klasy tasks
    TasksLab1 tasksLab1 = new TasksLab1();

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
                    tasksLab1.Task01();
                    break;
                case 2:
                    System.out.printf("Enter number a:");
                    int a = inputData.InputInt();
                    System.out.printf("Enter number b:");
                    int b = inputData.InputInt();
                    tasksLab1.Task02(a, b);
                    break;
                case 3:
                    System.out.println("Enter a number:");
                    int number = inputData.InputInt();
                    tasksLab1.Task03(number);
                    break;
                case 4:
                    System.out.println("Enter a number:");
                    int number4 = inputData.InputInt();
                    tasksLab1.Task04(number4);
                    break;
                case 5:
                    System.out.println("Enter a number:");
                    float number5 = inputData.InputFloat();
                    tasksLab1.Task05(number5);
                    break;
                case 6:
                    System.out.println("Enter a number:");
                    float number6 = inputData.InputFloat();
                    tasksLab1.Task06(number6);
                    break;
                case 7:
                    System.out.printf("Enter a number a:");
                    int a7 = inputData.InputInt();
                    System.out.printf("Enter a number b:");
                    int b7 = inputData.InputInt();
                    tasksLab1.Task07(a7,b7);
                    boolean result = tasksLab1.Task07(a7,b7);
                    System.out.printf("\nResult:"+result);
                    System.out.println("\nTask 7 completed");
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
