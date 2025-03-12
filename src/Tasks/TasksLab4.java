package Tasks;

import java.util.Random;
import java.util.Scanner;

public class TasksLab4 {
    protected void Task01(){
        int rozmiar = 10; // rozmiar tablicy
        int[] tablica = new int[rozmiar];

        for(int i=0; i<rozmiar; i++){
            tablica[i] = losujLiczbe(0,100); // nie ma powiedziane od ilu do ilu ma losowac liczbe
        }

        //obliczanie sumy
        int suma = 0;
        for(int i=0; i<tablica.length; i++){
            suma += tablica[i];
        }

        // obliczenie sredniej petla for
        double wynik = (double)suma/tablica.length;

        //obliczanie sredniej petla for each
        double wynik2 = 0;
        for(int liczba : tablica){
            wynik2 += liczba;
        }
        double srednia = wynik2/tablica.length;

        //wyswietlanie wynikow
        System.out.println("Suma tablicy: " + suma);
        System.out.println("Srednia tablicy: " + srednia);
        System.out.println("Wynik petli for: " + wynik);
        System.out.println("Wynik petli for each: " + wynik2);

    }
    protected void Task02(){

        //definiowanie tablicy z parzysta liczba elementow
        int[] tablicaParzystych = {1,2,3,4,5,6};

        //definiowanie tablicy z nieparzysta liczba elementow
        int[] tablicaNieparzystych = {10,20,30,40,50,60,70 };

        System.out.printf("Co drugi element tablicy parzystej: ");
        for(int i = 0; i < tablicaParzystych.length; i+=2){
            System.out.printf("%d ",tablicaParzystych[i]);
        }
        System.out.println(); // nowa linia

        System.out.printf("Co drugi element tablicy nieparzystej: ");
        for(int i = 0; i < tablicaNieparzystych.length; i+=2){
            System.out.printf("%d ",tablicaNieparzystych[i]);
        }
    }
    protected void Task03(){
        String[] tablica = {"Jan","Krzysztof","Marek","Anna"};

        for(String element : tablica){
            System.out.println(element.toUpperCase());
        }
    }
    protected void Task04(){
        Scanner scanner = new Scanner(System.in);
        String[] slowa = new String[5];

        System.out.printf("Podaj 5 slow\n");
        for(int i = 0; i < slowa.length; i++){
            System.out.printf("Podaj %d slowo: ",i+1);
            slowa[i] = scanner.nextLine();
        }

        System.out.printf("Wynik:\n");
        for (int i =slowa.length-1; i>=0; i--){
            String odwroconeSlowo = new StringBuilder(slowa[i]).reverse().toString();
            System.out.println(odwroconeSlowo);
        }
    }
    protected void Task05(){
        Scanner scanner = new Scanner(System.in);
        int[] liczby = new int[10];
        System.out.print("Podaj 10 liczb:\n");
        for(int i = 0; i < liczby.length; i++){
            System.out.printf("Podaj %d liczbe: ",i+1);
            liczby[i] = scanner.nextInt();
        }

        //sortowanie i wyswietlanie posortowanych liczb
        java.util.Arrays.sort(liczby);
        System.out.print("Wynik sortowania wyswietlania: ");
        for(int liczba : liczby){
            System.out.printf("%d ",liczba);
        }
    }
    protected void Task06(){
        
    }
    protected void Task07(){

    }

    //zadanie 1
    private int losujLiczbe(int min,int max){
        Random random = new Random();
        return random.nextInt(max-min+1)+min;
    }
}
