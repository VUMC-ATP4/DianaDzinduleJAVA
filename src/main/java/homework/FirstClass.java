package homework;

public class FirstClass {
    public static void main(String[] args) {
        String valsts = "Šveice";
        int iedzivotajuSkaits = 8570700;
        double iedzSkaits = 8.5;
        String miljons = "miljoni";
        double platiba = 41.3;
        String tukstos = "tūktoši";
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
        int divi = 2;
        int tris = viens + divi;
        int cetri = divi + divi;
        double pieci = 5;


        System.out.println("Valsts: " + valsts + punkts);
        System.out.println("Iedzīvotāju skaits: " + iedzivotajuSkaits +
                "\njeb, spēlējoties ar operatoriem, varu saskaitīt, atņemt un reizināt ciparus, lai iegūtu šo pašu skaitli " +
                (14%10 * cetri - (cetri + cetri)) +
                (cetri * divi - tris) +
                (cetri + cetri - tris % divi) +
                (cetri % divi) +
                (tris*tris - divi) +
                (viens*viens-viens) +
                (0/1) + punkts);
        System.out.println("Platība: " + (cetri * tris * divi / divi / tris) + punkts + (tris + divi) +
                "\njeb, spēlējoties ar operatoriem, varu saskaitīt, atņemt un reizināt ciparus, lai iegūtu šo pašu skaitli " +
                ((pieci*divi-viens)/divi) + punkts);
        System.out.println("Galvaspilsēta: " + valsts + daudzskaitlis + galvaspilseta + punkts);
        System.out.println ("Valoda: " + valoduSkaits + "jeb" + atstarpe + oficialasValodas +vardsValodas + punkts);
        System.out.println("Vai Šveice ir Eiropas Savienības dalībvalsts?: " + vaiIrESDaibvalsts + punkts);
        System.out.println("Valūta " + oficialaValuta + punkts);


        System.out.println(valsts + atstarpe + "ir skaista" + punkts);
        System.out.println("Šveicē dzīvo" + atstarpe + iedzivotajuSkaits + atstarpe + "jeb" + atstarpe + iedzSkaits + atstarpe + miljons + " iedzīvotāji.");
        System.out.println(valsts + daudzskaitlis + atstarpe + "platība ir" + atstarpe + platiba + atstarpe + tukstos + atstarpe + "m" + m2 + punkts);
        System.out.println("Šveicē ir " + valoduSkaits + atstarpe + "oficiālās " + vardsValodas + oficialasValodas + vardsValodas + punkts);
        System.out.println(valsts + daudzskaitlis + atstarpe + "valūta ir:" + atstarpe + oficialaValuta + ", nevar izmantot " + currency + punkts);
        if (vaiIrESDaibvalsts) {
            System.out.println(valsts + atstarpe + "ir Eiropas Savienības dalībvalsts" + punkts);
        }
        else {
            System.out.println(valsts + atstarpe + "nav Eiropas Savienības dalībvalsts" + punkts);
        }

    }
}
