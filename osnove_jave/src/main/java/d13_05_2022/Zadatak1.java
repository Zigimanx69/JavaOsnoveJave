package d13_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji ima niz brojeva od 25 elemenata, koji izgleda kao tabela 5x5.
//            Niz je fiksnih vrednosti (ne unosi ih korisnik) zatim korisnik unosi poziciju za koju se racuna suma.
//                Suma za poziciju se racuna tako sto se na vrednost tog polja dodaju vrednosti
//        elemenata iznad, ispod, sleve i sdesne strane tog elementa (Ukoliko ti elementi postoje,
//                vodite racuna da ne izadjete van opsega niza)
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
        niz.add(9);
        niz.add(4);
        niz.add(5);
        niz.add(4);
        niz.add(8);
        niz.add(5);
        niz.add(1);
        niz.add(5);
        niz.add(1);
        niz.add(4);
        niz.add(5);
        niz.add(4);
        niz.add(1);
        niz.add(4);
        niz.add(4);

        int zbir = 0;
        for (int i = 0; i < niz.size(); i++) {
            System.out.print(niz.get(i) + ", ");
            if (i % 5 == 4) {
                System.out.println();
            }
        }
        boolean tacno = true;
        while (tacno) {
            System.out.println("Unesite poziciju: ");
            int poz = s.nextInt();
            if (poz <= 4 || poz >= 20) {
                System.out.println("Van opsega ste niza");
            } else if (poz == 5 || poz == 9) {
                System.out.println("Van opsega ste niza");
            } else if (poz == 10 || poz == 14) {
                System.out.println("Van opsega ste niza");
            } else if (poz == 15 || poz == 19) {
                System.out.println("Van opsega ste niza");
            } else {
                zbir = niz.get(poz) + niz.get(poz - 1) + niz.get(poz + 1) + niz.get(poz + 5) + niz.get(poz - 5);
                tacno = false;
            }
        }
        System.out.println(zbir);


    }
}
