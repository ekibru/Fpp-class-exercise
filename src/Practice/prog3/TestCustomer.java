package Practice.prog3;

import Practice.Address;
import Practice.Customer;

public class TestCustomer {
    public static void main(String[] args) {
        Address home = new Address("1223 N 4th st","Fairfield","IA","56556");
        Address shipping = new Address("1112 N 10th st","Fairfield","IA","56557");

        Address home2 = new Address("123 N 4th st","Fairfield","IA","56552");
        Address shipping2 = new Address("711 N 10th st","Fairfield","IA","56554");

        Customer c1 = new Customer("Bob","Smith","332-34-7891");
        c1.setBillingAdd(home);
        c1.setShippingAdd(shipping);
        Customer c2 = new Customer("Jack","Dorsey","111-23-0123");
        c2.setBillingAdd(home2);
        c2.setShippingAdd(shipping2);
        System.out.println(c1);
        System.out.println("*************");
        System.out.println(c2);


    }
}
