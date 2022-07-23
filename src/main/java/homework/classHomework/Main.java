package homework.classHomework;

public class Main {
    public static void main(String[] args) {

        Trijsturis Trijsturis = new Trijsturis();
        Trijsturis.pirmaMala = 8;
        Trijsturis.otraMala = 8;
        Trijsturis.tresaMala = 9;

        System.out.println("2. uzdevums, 1. punkts\n");
        System.out.println("Izveidotā trijstūra laukums: " + Trijsturis.Area());
        System.out.println("Aprēķins, vai izveidotais trijstūris ir vienādmalu: "+ Trijsturis.isEquilateral());
        System.out.println("Aprēķins, vai izveidotais trijstūris ir vienādsānu: " + Trijsturis.isIsosceles());

        System.out.println("2. uzdevums, 2. punkts\n");
        Trijsturis TrijsturisDivi = new Trijsturis(1,1,1);

        System.out.println("Izveidotā trijstūra laukums: " + TrijsturisDivi.Area());
        System.out.println("Aprēķins, vai konstruktora trijstūris ir vienādmalu: " + TrijsturisDivi.isEquilateral());
        System.out.println("Aprēķins, vai konstruktpora trijstūris ir vienādsānu: " + TrijsturisDivi.isIsosceles());
    }
}
