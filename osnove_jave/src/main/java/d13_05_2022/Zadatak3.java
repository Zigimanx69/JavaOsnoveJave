package d13_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji ima niz brojeva duzine 10.
//        Niz je fiksnih vrednosti (ne u nosi ih korisnik) a zatim se od korisnika
//        ucitava pozicija elementa koji zeli da izbaci iz niza. Pre i nakon izbacivanja
//        ispisati niz na ekranu. Ukoliko korisnik unese poziciju van opsega niza, ispisati poruku o gresci.
//        Primer izvrsenja 1:
//        Niz je: 1,3,5,6,7,1,3,4,2,9
//        Unesite poziciju za izbacivanje: 5
//        Niz nakon brisanja je: 1,3,5,6,7,3,4,2,9

        ArrayList<Integer> niz = new ArrayList<Integer>();

        niz.add(2);
        niz.add(4);
        niz.add(6);
        niz.add(7);
        niz.add(4);
        niz.add(4);
        niz.add(2);
        niz.add(5);
        niz.add(1);
        niz.add(4);

        System.out.print("Niz je : ");
        for (int i = 0; i < niz.size(); i++) {
            System.out.print(niz.get(i) + ", ");
        }
        System.out.println();
        System.out.println("Unesite poziciju za izbacivanje: ");
        int poz = s.nextInt();

        niz.remove(poz);
        System.out.println("Niz nakon brisanja je : ");
        for (int i = 0; i < niz.size(); i++) {
            System.out.print(niz.get(i) + ", ");
        }


    }
}

