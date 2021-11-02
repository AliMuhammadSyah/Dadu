package dadu;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Program Start");
        System.out.println("Inputan : ");
        Scanner in = new Scanner(System.in);
        LemparDadu dadu = new LemparDadu();
        String kode;

        while (true) {
            kode = in.nextLine().toLowerCase();
            if (kode.equals("q"))
                break;
            System.out.println(dadu.parse(kode));
        }
    }
}