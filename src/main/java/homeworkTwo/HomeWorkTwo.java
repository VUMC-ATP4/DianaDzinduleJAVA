package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        int x = 6;
        System.out.println(x - 5 + ". uzdevums");
        System.out.println("a." + (x > 0));
        System.out.println("b." + (x < 0));
        System.out.println("c." + (x > 5 && x < 10));
        if (!(x <= 5) && x < 10) {
            System.out.println("d.true");
        } else {
            System.out.println("d.false");
        }
        if (x == 0 || x == 10) {
            System.out.println("e.true");
        } else {
            System.out.println("e.false");
        }
        if ((x * x) > 10) {
            System.out.println("f.true");
        } else {
            System.out.println("f.false");
        }
        System.out.println(x - 4 + ". uzdevums");


        Scanner scanner = new Scanner(System.in);

        System.out.println();
        int menesis;
        Scanner input = new Scanner(System.in);
        System.out.print("Ievadi jebkuru mēneša numuru kā veselu skaitli: ");
        menesis = input.nextInt();
        switch (menesis) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 3:
                System.out.println("Marts");
                break;
            case 4:
                System.out.println("Aprīlis");
                break;
            case 5:
                System.out.println("Maijs");
                break;
            case 6:
                System.out.println("Junijs");
                break;
            case 7:
                System.out.println("Jūlijs");
                break;
            case 8:
                System.out.println("Augusts");
                break;
            case 9:
                System.out.println("Septembris");
                break;
            case 10:
                System.out.println("Oktobris");
                break;
            case 11:
                System.out.println("Novembris");
                break;
            case 12:
                System.out.println("Decembris");
                break;
            default:
                System.out.println("Gadā ir tikai 12 mēneši - varēji ierakstīt skaitli no 1 līdz 12!");


        }
        System.out.println("3. uzdevums");
        int skaitlis1;
        int skaitlis2;
        int skaitlis3;

        System.out.print("Ievadi vienu veselu skaitli: ");
        skaitlis1 = input.nextInt();
        System.out.print("Ievadi otru veselu skaitli: ");
        skaitlis2 = input.nextInt();
        System.out.print("Ievadi trešo veselo skaitli: ");
        skaitlis3 = input.nextInt();

        if(skaitlis1 >= skaitlis2)
        {
            if(skaitlis1 >= skaitlis3)
                System.out.println("Lielākais, no ievadītajiem trim skaitļiem, ir skaitlis " + skaitlis1);
            else
                System.out.println("LLielākais, no ievadītajiem trim skaitļiem, ir skaitlis " + skaitlis3);
        }
        else
        {
            if(skaitlis2 >= skaitlis3)
                System.out.println("Lielākais, no ievadītajiem trim skaitļiem, ir skaitlis " + skaitlis2);
            else
                System.out.println("Lielākais, no ievadītajiem trim skaitļiem, ir skaitlis " + skaitlis3);
        }
        System.out.println("4. uzdevums");

         //   String krasa;
         //   switch (krasa) {
          //      case "sarkana":
          //          result = "domestic animal";
          //          break;
          //      case "dzeltena":
          //          result = "domestic animal";
           //         break;
           //     case "zaļa":
           //         result = "wild animal";
           //         break;
           //     default:
           //         result = "unknown animal";
            //        break;
           // }
           // return result;
        //}
       // krasa.equals("Zaļa"); //false
       // krasa.equals("Zila"); //true

        System.out.println("\n5. uzdevums");
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();
        System.out.println("\n6. uzdevums");
        printBusinessCardTwo("Diana", "Dzindule", "+371 28322952", 1984);
        printBusinessCardTwo("Juris", "Kreilis", "+371 2222222", 1986);

        System.out.println("\n7. uzdevums");
        int a;
        int b;

        System.out.println("Ievadi pirmo veselo skaitli:");
        a = scanner.nextInt();
        System.out.println("Ievadi otro veselo skaitli:");
        b = scanner.nextInt();
        int summa =sum(a,b);
        System.out.println("Ievadīto skaitļu summma ir " + summa);

        System.out.println("\n8. uzdevums");
        double pirmaisDecimalskaitlis;
        double otraisDecimalskaitlis;
        double tresaisDecimalskaitlis;

        System.out.println("Ievadi pirmo decimālskaitli:");
        pirmaisDecimalskaitlis = scanner.nextDouble();
        System.out.println("Ievadi otro decimālskaitli:");
        otraisDecimalskaitlis = scanner.nextDouble();
        System.out.println("Ievadi trešo decimālskaitli:");
        tresaisDecimalskaitlis = scanner.nextDouble();

        double average = average(pirmaisDecimalskaitlis,otraisDecimalskaitlis,tresaisDecimalskaitlis);

        System.out.println("Ievadīto skaitļu vidēja vērtība: " + average);

    }
    public static void printBusinessCard(){
        String vards = "Diāna";
        String uzvards = "Dzindule";
        String talrunis = "+371 28322952";
        int dzimsanasGads = 1984;

        System.out.println("\n##########\nVizītkarte\n##########");
        System.out.println("Vārds: " + vards);
        System.out.println("Uzvārds: " + uzvards);
        System.out.println("Telefona numurs: " + talrunis);
        System.out.println("Dzimšanas gads: " + dzimsanasGads);
    }
   public static void printBusinessCardTwo(String vards, String uzvards, String talrunis, int dzimsanasGads){
        System.out.println("\n##########\nVizītkarte\n##########");
        System.out.println("Vārds: " + vards);
        System.out.println("Uzvārds: " + uzvards);
        System.out.println("Telefona numurs: " + talrunis);
        System.out.println("Dzimšanas gads: " + dzimsanasGads);



    }
    public static int sum(int a, int b) {
        return a+b;
    }
    public static double average(double pirmaisDecimalskaitlis, double otraisDecimalskaitlis, double tresaisDecimalskaitlis) {
        return (pirmaisDecimalskaitlis + otraisDecimalskaitlis + tresaisDecimalskaitlis) / 3;
    }
}
