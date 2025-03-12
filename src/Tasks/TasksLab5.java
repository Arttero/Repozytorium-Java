package Tasks;

import java.util.Scanner;

public class TasksLab5 {
    Scanner scanner = new Scanner(System.in);

    private String firstname, lastname;
    private int age;



    protected void Task01() {

        //Obiekt utworzony z pomoca 3 parametrow
        Osoba osoba1 = new Osoba("Jan", "Kowalski", 25);
        osoba1.pokazDane();

        //Obiekt utworzony z pomoca 2 parametrow
        Osoba osoba2 = new Osoba("Michal", 26);
        osoba2.pokazDane();

        Osoba osoba3 = new Osoba();
        osoba3.pokazDane();

    }
    protected void Task02() {
        Student student1 = new Student(new Osoba("Jan", "Kowalski", 25), 123456, "Informatyka", 2);
        student1.pokazDane();

        Student student2 = new Student(new Osoba("Michal", "Nowak", 26), 12354);
        student2.pokazDane();

        Student student3 = new Student(new Osoba("Jan", "Kowalski", 25));
        student3.pokazDane();

        Student student4 = new Student(new Osoba("Michal", 23));
        student4.pokazDane();

    }
    protected void Task03() {
        System.out.print("Podaj imie studenta: ");
        String imie = scanner.nextLine();
        System.out.print("Podaj nazwisko studenta: ");
        String nazwisko = scanner.nextLine();
        System.out.print("Podaj wiek studenta: ");
        int wiek = scanner.nextInt();
        System.out.print("Podaj numer indeksu studenta: ");
        int index = scanner.nextInt();
        System.out.print("Podaj specjalnosc studenta: ");
        String specjalnosc = scanner.nextLine();
        System.out.print("Podaj rok studenta: ");
        int rok = scanner.nextInt();

        //
        Student nowyStudent = new Student(new Osoba(imie, nazwisko, wiek),index,specjalnosc,rok);
        nowyStudent.pokazDane();
    }
    protected void Task04() {

    }
}
