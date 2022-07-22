package homework;

import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
        lidzSkaitluSummaiSimts();
        irPirmskaitlis();
        masiviDatuTipiem();
        paraSkaitliLidzSimts();
        faktorials();
        pinKods();




    }



    public static void lidzSkaitluSummaiSimts() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n1. uzdevums");

        int skaitlisUzdevumaViens = 0;
        while (skaitlisUzdevumaViens <= 100) {
            System.out.println("Ievadi veselu skaitli (vēlams no 1 līdz 99), es saskaitīšu skaitļus, ko ievadīsi līdz summai 100: ");
            int skaitlisSummai = sc.nextInt();
            skaitlisUzdevumaViens = skaitlisUzdevumaViens + skaitlisSummai;
            System.out.println("Pašlaik summa nav sasniegta, kad būs, tad būs GATAVS!" + skaitlisSummai + "\nIevadi vēl kādu skaiti, lai ievadīto skaitļu summa būtu 100!");

        }
        System.out.println("Gatavs.");

    }
    public static void irPirmskaitlis() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n 2. uzdevums");

        int skaitlisUzdevumaDivi;
        System.out.println("Ievadi kādu skaitli! Noskaidrosim, vai tas ir pirmskaitlis: ");
        skaitlisUzdevumaDivi = scanner.nextInt();
        boolean vaiIrPirmskaitlis = false;

        for (int i = 2; i <= skaitlisUzdevumaDivi / 2; i++) {

            if (skaitlisUzdevumaDivi % i == 0) {
                vaiIrPirmskaitlis = true;
                break;
            }
        }
        if(!vaiIrPirmskaitlis)
            System.out.println(skaitlisUzdevumaDivi + " ir pirmskaitlis.");
        else
            System.out.println(skaitlisUzdevumaDivi+ " nav pirmskaitlis.");


    }
    public static void masiviDatuTipiem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n3. uzdevums\n");
        int[] skaitliUzdevumamTris = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] majdzivniekiuzdevumamTris = {"suns", "kaķis", "žurka", "trusis"};
        char[] burtiUzdevumamTris = {'x', 'y', 'z' };

        System.out.println("\nwhile:\n\n\n");

        int skaitli = 0;
        while (skaitli < skaitliUzdevumamTris.length) {
            System.out.println(skaitliUzdevumamTris[skaitli]);
            skaitli++;
        }

        int dzivnieki = 0;
        while (dzivnieki < majdzivniekiuzdevumamTris.length) {
            System.out.println(majdzivniekiuzdevumamTris[dzivnieki]);
            dzivnieki++;
        }

        int burti = 0;
        while (burti < burtiUzdevumamTris.length) {
            System.out.println(burtiUzdevumamTris[burti]);
            burti++;
        }

        System.out.println("\ndo while:\n\n\n");

        int c = 0;
        do {
            System.out.println(skaitliUzdevumamTris[c]);
            c++;
        }
        while (c < skaitliUzdevumamTris.length);

        int d = 0;
        do {
            System.out.println(majdzivniekiuzdevumamTris[d]);
            d++;
        }
        while (d < majdzivniekiuzdevumamTris.length);

        int e = 0;
        do {
            System.out.println(burtiUzdevumamTris[e]);
            e++;
        }
        while (e < burtiUzdevumamTris.length);

        System.out.println("\nfor loop:\n\n\n");

        for (int randomNumber : skaitliUzdevumamTris) {
            System.out.println(randomNumber);
        }
        for (String s : majdzivniekiuzdevumamTris) {
            System.out.println(s);
        }
        for (char randomLetter : burtiUzdevumamTris) {
            System.out.println(randomLetter);
        }

        System.out.println("\nfor each:\n\n\n");


        for (int i : skaitliUzdevumamTris) {
            System.out.println(i);
        }
        for (String strTemp : majdzivniekiuzdevumamTris) {
            System.out.println(strTemp);
        }
        for (char j : burtiUzdevumamTris) {
            System.out.println(j);
        }
        System.out.println("\nViss.\n\n\n");
    }

    public static void paraSkaitliLidzSimts() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n4. uzdevums");
        System.out.println("\nŠeit saraksts ar skaitļiem, kas ir pāra skaitļi (robežās no 1 līdz 100): ");

        int[] skaitluSaraksts = new int[100];
        for (int paraSkaitluInteger = 1; paraSkaitluInteger <= skaitluSaraksts.length; paraSkaitluInteger++) {
            if (paraSkaitluInteger % 2 == 0) {
                System.out.print(paraSkaitluInteger);
            }

        }
    }

    public static void faktorials() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n5. uzdevums");

        System.out.println("Ievadi veselu skaitli, izrēķināšu tā faktoriālu: ");
        int skaitlisUzdevumsPieci = sc.nextInt(),
                klusFaktorials = 1;
        long faktorialsRezultats = 1;
        for (klusFaktorials = 1; klusFaktorials <= skaitlisUzdevumsPieci; klusFaktorials++) {
            faktorialsRezultats = faktorialsRezultats * klusFaktorials;
        }
        System.out.println("\nFaktoriāls no " + skaitlisUzdevumsPieci + " ir: " + faktorialsRezultats);
    }

    public static void pinKods() {
        System.out.println("\n\n6. uzdevums");

        Scanner sc = new Scanner(System.in);
        final int pinKods = 1234;
        int meginajumuSkaits = 0;
        while (meginajumuSkaits <= 2) {
            System.out.print("\nIevadi četru ciparu PIN kodu, Tev ir trīs mēģinājumi:");
            if (pinKods == sc.nextInt()) {
                System.out.println("\nPIN ir pieņemts, laipni lūdzam atpakaļ.");
                break;
            }
            else if (meginajumuSkaits == 2) {
                System.out.println("\nAtvainojiet, bet jūs esat bloķēts.");
                break;
            }
            else   System.out.println("\nNepareizs PIN, mēģiniet vēlreiz.");
            meginajumuSkaits++;
        }
    }


}
