package Tasks;

import java.util.Random;

public class TasksLab1 {
    private String name = "Jan Nowak";
    private int age = 22;

    protected void Task01() {
        System.out.println("Name: " + name+ " Age: " + age);
        System.out.print("Task 1 completed");
    }

    protected void Task02(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
        int diff = a - b;
        System.out.println("Difference: " + diff);
        int product = a * b;
        System.out.println("Product: " + product);

        System.out.print("Task 2 completed");
    }

    protected void Task03(int number) {
        if (number % 2 == 0){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        System.out.print("Task 3 completed");
    }

    protected void Task04(int number4) {
        if (number4 % 3 == 0){
            if (number4 % 5 == 0){
                System.out.println("True");
            }
        }
        else
            System.out.println("False");
        System.out.print("Task 4 completed");
    }

    protected void Task05(float number5) {
        float pow = (float) Math.pow(number5, 3);
        System.out.println("Power: " + pow);
        System.out.print("Task 5 completed");
    }

    protected void Task06(float number6) {
        float root = (float) Math.sqrt(number6);
        System.out.println("Root: " + root);
        System.out.print("Task 6 completed");
    }

    protected boolean Task07(int a7, int b7) {
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

        return(a*a+b*b==c*c);

    }
}


