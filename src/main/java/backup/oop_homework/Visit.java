package backup.oop_homework;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

import static homework.oop_homework.DiscountRate.getProductDiscountRate;
import static homework.oop_homework.DiscountRate.getServiceDiscountRate;

public class Visit {

    @Getter
    @Setter


    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, Date date) {
        this.customer = customer;
        this.date = date;
    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        if (!customer.isMember()) {
            return serviceExpense;
        } else {
            return ((1 - getServiceDiscountRate(customer.getMemberType())) * serviceExpense);
        }
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        if (!customer.isMember()) {
            return productExpense;
        } else {
            return ((1 - getProductDiscountRate(customer.getMemberType())) * productExpense);
        }
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        return (getProductExpense() + getServiceExpense());
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';


    }

    public String getCustomerName() {
        return customer.getName();
    }
}
