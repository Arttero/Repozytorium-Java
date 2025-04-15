package Tasks.Lab9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TasksLab9 {


    public void Task01(){
        List<String> imiona = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj imie:");
            String input = scanner.nextLine();
            imiona.add(input);


            if (input.equals("-")){
                break;
            }
        }
        
    }
    public void Task02(){
        List<String> imiona = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Wpisz \"-\" zamiast imiona pierwszej osoby aby zakończyć\n");
            System.out.println("Podaj imiona pary:");

            System.out.println("Podaj imię pierwszej osoby:");
            String imie1 = scanner.nextLine();

            if (imie1.equals("-")){//zakończenie pętli
                break;
            }
            System.out.println("Podaj imię drugiej osoby:");
            String imie2 = scanner.nextLine();

            imiona.add(imie1);
            imiona.add(imie2);
        }
        System.out.println("Podaj jedno imię którejkolwiek pary:");
        String szukaniePary = scanner.nextLine();
        int index = imiona.indexOf(szukaniePary);

        if (index != -1){
            if (index % 2 == 0){
                System.out.println("Para: "+ imiona.get(index +1));
            } else {
                System.out.println("Para: "+ imiona.get(index -1));
            }
        }

    }
    public void Task03(){
        List<UczestnikWydarzenia> uczestnicy = new ArrayList<>();

        uczestnicy.add(new UczestnikWydarzenia(1,"Gosia", 23));
        uczestnicy.add(new UczestnikWydarzenia(2,"Nikolas", 20));
        uczestnicy.add(new UczestnikWydarzenia(3,"Edek", 17));

        System.out.println("Lista uczestników:");
        for (UczestnikWydarzenia uczestnik : uczestnicy){
            System.out.println(uczestnik);
        }

        System.out.println("\nPełnoletni uczestnicy:");
        for (UczestnikWydarzenia uczestnik : uczestnicy) {
            if (uczestnik.isPelnoletni()) {
                System.out.println(uczestnik.getImie());
            }
        }
    }
    public void Task04(){

    }
    public void Task05(){

    }
}