package Tasks;
import java.util.Scanner;


public class InputData {


    Scanner input = new Scanner(System.in);


    protected int InputInt() {
        int value = input.nextInt();
        input.nextLine();
        return value;
    }
    protected double InputDouble() {
        double value = input.nextDouble();
        input.nextLine();
        return value;
    }
    protected boolean boleanInput() {
        String value = input.nextLine();
        return value.equals("true");
    }
}
