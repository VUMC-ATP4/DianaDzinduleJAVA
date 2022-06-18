package Homework;

public class FirstClass {
    public static void main(String[] args) {
        String valsts = "Šveice";
        int iedzivotajuskaits = 8570700;
        int platiba = 41284;
        String galvaspilseta = " Berne";
        byte valoduSkaits = 4;
        String oficialasValodas = " vācu, franču, itāļu, retoromāņu";
        String vardsValodas = " valodas";
        char daudzskaitlis = 's';
        boolean vaiIrESDaibvalsts = false;
        String oficialaValuta = "CHF";
        char currency = '€';

        System.out.println("Valsts: " + valsts);
        System.out.println("Iedzīvotāju skaits: " + iedzivotajuskaits);
        System.out.println("Plaība: " + platiba);
        System.out.println("Galvasilsēta: " + valsts + daudzskaitlis + galvaspilseta);
        System.out.println("Vai Šveice ir Eiropas Savienības dalībvalsts?: " + vaiIrESDaibvalsts);
        System.out.println("Šveicē ir " + valoduSkaits +  "oficiālās " + vardsValodas + oficialasValodas + vardsValodas);
        System.out.println("Šveices valūta ir: " + oficialaValuta + ", nevar izmantot " + currency);

    }
}
