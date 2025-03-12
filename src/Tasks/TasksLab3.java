package Tasks;
import java.util.Scanner;
import java.util.Random;


public class TasksLab3 {

    //scanner
    Scanner scanner = new Scanner(System.in);
    protected void Task01(){
        System.out.println("Podaj liczbe studentow: ");
        int n = scanner.nextInt();

        int i =0;
        int punkty;
        float suma = 0;
        while(i<n){
            System.out.printf("Podaj liczbe punktow studenta %d: ",i+1);
            punkty = scanner.nextInt();
            suma += punkty;
            i++;
        }
        float wynik = suma/n;
        System.out.printf("Sriednia punktow = "+wynik);
    }

    protected void Task02(){
        float sumaLiczbDodatnich =0;
        float sumaLiczbUjemnych =0;
        int i = 0;

        while (i<10){
            System.out.print("Podaj liczbe: ");
            float liczba = scanner.nextFloat();
            if(liczba<0){
                sumaLiczbUjemnych += liczba;
            }else{
                sumaLiczbDodatnich += liczba;
            }
            i++;
        }
        System.out.printf("Suma liczb ujemych = "+sumaLiczbUjemnych+"\nSuma liczb dodatnich = "+sumaLiczbDodatnich);
    }

    protected void Task03() {
        int liczba = 0;
        int sumaParzystych = 0;

        System.out.printf("Podaj liczbe elemntow ciagu: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("\nPodaj liczbe elementu ciagu %d: ", i + 1);
            liczba = scanner.nextInt();

            if(liczba % 2 == 0){
                sumaParzystych += liczba;
            }
        }
        System.out.printf("Suma elementow ciagu = " + sumaParzystych);
    }

    protected void Task04() {
        int liczba = 0;
        int sumaParzystych = 0;

        System.out.printf("Podaj liczbe elemntow ciagu: ");
        int n = scanner.nextInt();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            liczba = random.nextInt(-10,45);
            if(liczba % 2 == 0){
                sumaParzystych += liczba;
            }
        }
        System.out.printf("Suma elementow ciagu = " + sumaParzystych);
    }

    protected void Task05() {
        System.out.printf("Podaj slowo: ");
        String slowo = scanner.next();
        String reversed = new StringBuilder(slowo).reverse().toString();
        if(slowo.equals(reversed)){
            System.out.printf("Podane slowo jest palindromem\n");
        }
        else{
            System.out.printf("Podane slowo nie jest palindromem\n");
        }
    }
}
