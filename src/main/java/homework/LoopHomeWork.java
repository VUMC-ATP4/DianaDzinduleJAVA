package homework;

import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
        lidzSummaiSimts();
        pirmskaitlis();
        trisMasivi()
        paraSkaitliLidzSimts();
        faktorials();
        pinKods();




    }
    public static void lidzSummaiSimts() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n1. uzdevums");

        int skaitlisUzdevuma1 = 0;
        while (skaitlisUzdevuma1 <= 100) {
            System.out.println("Ievadi veselu skaitli (vēlams no 1 līdz 99): ");
            int skaitlisSummai = sc.nextInt();
            skaitlisUzdevuma1 = skaitlisUzdevuma1 + skaitlisSummai;
            System.out.println("Pašlaik summa ir: " + skaitlisSummai + "\nIevadi vēl kādu skaiti, lai šo skaitļu summa būtu 100!");

        }
        System.out.println("Gatavs.");

    }
    public static void pirmskaitlis() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n 2. uzdevums");

        int skaitlisUzdevumaDivi;
        System.out.println("Ievadi skaitli, noskaidrosim, vai tas ir pirmskaitlis: ");
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
    public static void trisMasivi() {
        System.out.println("\n\n3. uzdevums");
    }

    public static void paraSkaitliLidzSimts(){
        System.out.println("\n\n4. uzdevums");
        System.out.println("\nŠeit rindā visi skaitļi, kas ir pāra robežās no 1 līdz 100: ");

        int[] saraksts = new int[100];
        for (int paraSkaitluInteger = 1; i <= saraksts.length ; paraSkaitluInteger++) {

            if(paraSkaitluInteger % 2 == 0){
                System.out.print(paraSkaitluInteger + ",");
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
