package Homework;

public class FirstClass {
    public static void main(String[] args) {
        String valsts = "Šveice";
        int iedzivotajuskaits = 8570700;
        double platiba = 41.3;
        String tukstos = "tūktoš";
        byte m2 = 2;
        String galvaspilseta = " Berne";
        byte valoduSkaits = 4;
        String oficialasValodas = " vācu, franču, itāļu, retoromāņu";
        String vardsValodas = " valodas";
        char daudzskaitlis = 's';
        boolean vaiIrESDaibvalsts = false;
        String oficialaValuta = "CHF";
        char currency = '€';
        char punkts = '.';
        char atstarpe = ' ';
        int viens = 1;

        System.out.println("Valsts: " + valsts + punkts);
        System.out.println("Iedzīvotāju skaits: " + iedzivotajuskaits + punkts);
        System.out.println("Platība: " + platiba + punkts);
        System.out.println("Galvaspilsēta: " + valsts + daudzskaitlis + galvaspilseta + punkts);
        System.out.println("Vai Šveice ir Eiropas Savienības dalībvalsts?: " + vaiIrESDaibvalsts + punkts);



        System.out.println(valsts + atstarpe + "ir skaista" + punkts);
        System.out.println(valsts + daudzskaitlis + atstarpe + "platība ir" + atstarpe + platiba + atstarpe + tukstos + "m" + m2 + punkts);
        System.out.println("Šveicē ir " + valoduSkaits + atstarpe + "oficiālās " + vardsValodas + oficialasValodas + vardsValodas + punkts);
        System.out.println(valsts + daudzskaitlis + atstarpe + "valūta ir:" + atstarpe + oficialaValuta + ", nevar izmantot " + currency + punkts);
        System.out.println(valsts + vaiIrESDaibvalsts + punkts);
    }
}
