package homework.classHomework;

public class Trijsturis {
    int pirmaMala;
    int otraMala;
    int tresaMala;
    double laukums;

    Trijsturis(){
        System.out.println("1. uzdevums\nŠeit veidojam trijstūri. ");

    }
    Trijsturis(int a, int b, int c){
        this.pirmaMala = a;
        this.otraMala= b;
        this.tresaMala = c;

    }
    public double Area(){
        System.out.println("Šeit aprēķināts šī trijstūra laukums. ");
        return (Math.sqrt(((pirmaMala*pirmaMala+otraMala*otraMala+tresaMala*tresaMala)*
                (pirmaMala*pirmaMala+otraMala*otraMala+tresaMala*tresaMala))
                - 2*(pirmaMala*pirmaMala*pirmaMala+otraMala*otraMala*otraMala*otraMala+tresaMala*tresaMala*tresaMala*tresaMala)))/4;
    }

    public boolean isEquilateral(){

        if (pirmaMala == otraMala && otraMala == tresaMala & tresaMala == pirmaMala){
            return true;
        }else {
            return false;
        }
    }

    public boolean isIsosceles (){

        if (pirmaMala == otraMala && otraMala != tresaMala){
            return true;
        }else {
            return false;
        }
    }

}
