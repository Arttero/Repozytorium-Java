package Tasks;
import java.util.Scanner;

//klasa do wczytywania danych
public class InputData {

    //obiekt klasy scanner
    Scanner input = new Scanner(System.in);

    //metody do pobierania danych od uzytkownika/wczytywania danych
    protected int InputInt() {
        int value = input.nextInt();
        input.nextLine();
        return value;
    }
    protected float InputFloat() {
        float value = input.nextFloat();
        input.nextLine();
        return value;
    }
}
