package homework.oop_homework;

import java.util.Date;

public class Example {
    public static void main(String[] args) {
        System.out.println("Klienti un to statuss:");
        Customer customer1 = new Customer("Diana Dzindule", true, "Silver");
        Customer customer2 = new Customer("Anna Bērziņa", true, "Gold");
        Customer customer3 = new Customer("Juris Kreilis", true, "Premium");
        Customer customer4 = new Customer("Nikita Milka");
        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);
        System.out.println(customer4);

        Visit visit = new Visit(customer1, new Date());
        visit.setProductExpense(10);
        visit.setServiceExpense(20);

        Visit visit2 = new Visit(customer2, new Date());
        visit2.setProductExpense(10);
        visit2.setServiceExpense(20);

        Visit visit3 = new Visit(customer3, new Date());
        visit3.setProductExpense(10);
        visit3.setServiceExpense(20);

        Visit visit4 = new Visit(customer4, new Date());
        visit4.setProductExpense(10);
        visit4.setServiceExpense(20);

        System.out.println("\nApmeklējuma Nr.1 informācija, dati pirms klienta atlaižu sistēmas piemērošanas:\n" + visit.toString());
        System.out.println("\nApmeklējums Nr. 1 rezultāts:" + visit.getCustomerName() + " = " + String.format("%.2f",visit.getTotalExpense()));

        System.out.println("\nApmeklējuma Nr.2 informācija, dati pirms klienta atlaižu sistēmas piemērošanas:\n" + visit2.toString());
        System.out.println("KVizīte Nr. 2:" + visit2.getCustomerName() + " = " + String.format("%.2f",visit2.getTotalExpense()));

        System.out.println("\nApmeklējuma Nr.3 informācija, dati pirms klienta atlaižu sistēmas piemērošanas:\n" + visit3.toString());
        System.out.println("Vizīte Nr. 3:" + visit3.getCustomerName() + " = " + String.format("%.2f",visit3.getTotalExpense()));

        System.out.println("\nApmeklējuma Nr.4 informācija, dati pirms klienta atlaižu sistēmas piemērošanas:\n" + visit4.toString());
        System.out.println("Vizīte Nr. 4:" + visit4.getCustomerName() + " = " + String.format("%.2f",visit4.getTotalExpense()));

    }
}
