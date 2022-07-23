package backup.oop_homework;

public class DiscountRate {
    private static double serviceDiscountPremium = 0.2;
    private static double productDiscountSilver = 0.1;
    private static double serviceDiscountGold = 0.15;
    private static double productDiscountGold = 0.1;
    private static double serviceDiscountSilver = 0.1;
    private static double productDiscountPremium = 0.1;



    public static double getServiceDiscountRate(String type) {
        switch (type) {
            case "Silver":
                return serviceDiscountSilver;
            case "Gold":
                return serviceDiscountGold;
            case "Premium":
                return serviceDiscountPremium;
            default:
                throw new IllegalArgumentException("Lai saņemtu atlaidi mūsu salona pakalpojumiem, Jums jāiegādājas kāds no abonamentiem!");
        }
    }

    public static double getProductDiscountRate(String type) {
        switch (type) {
            case "Silver":
                return serviceDiscountSilver;
            case "Gold":
                return serviceDiscountGold;
            case "Premium":
                return serviceDiscountPremium;
            default:
                throw new IllegalArgumentException("Lai saņemtu atlaidi iegādātajiem produktiem, Jums jāiegādājas kāds no abonamentiem!");
        }
    }

}
