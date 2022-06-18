package classroom;

public class Main {
    public static void main(String[] args) {

        //[Mainīgā tips] [Mainīgā nosaukums] = [Vērtība];
        //Vārdi un teikumi JAVA valodā tiek saglabāti mainīgā tipā 'String'

        String dogName = "Reksis";
        int dogAge = 10;
        double dogWeight = 15.5;
        String dogBreed = "VAS";
        boolean isDogHungry = true;
        char dogGender = 'V';
        char currency = '$';
        int dogPrice = 100;

        System.out.println("Suņa vārds: " + dogName);
        System.out.println("Suņa vecums: " + dogAge);
        System.out.println("Suņa svars: " + dogWeight);
        System.out.println("Suņa šķirne: " + dogBreed);
        System.out.println("Vai suns ir izsalcis? " + isDogHungry);
        System.out.println("Suņa dzimums ir: " + dogGender);
        System.out.println("Suņa kucēni maksā: " + dogPrice + currency);

        int summa;
        int pirmaisSkaitlis = 20;
        int otraisSkaitlis = 10;

        summa = pirmaisSkaitlis + otraisSkaitlis;
        System.out.println(pirmaisSkaitlis + "+" + "(" + otraisSkaitlis + ")" + "=" + summa);
        int suma = pirmaisSkaitlis + otraisSkaitlis;
        int dalijums = pirmaisSkaitlis / otraisSkaitlis;
        int reizinajus = pirmaisSkaitlis * otraisSkaitlis;
        int atlikums = pirmaisSkaitlis % otraisSkaitlis;

        int starpiba = pirmaisSkaitlis - otraisSkaitlis;
        System.out.println("starpiba" + starpiba);
        System.out.println("summa" + suma);
        System.out.println("dalijums" + dalijums);
        System.out.println("dalijums" + dalijums);
    }
}