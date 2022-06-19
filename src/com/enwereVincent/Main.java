package com.enwereVincent;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//        System.out.print("How Many Products Do You Want?: ");
//        int n = input.nextInt();
//        Product[] products = new Product[n];
//        Customer customer = new Customer(1, "Customer1" , "Lagos" );
//        Customer customer1 = new Customer(1, "Vincent" , "Abuja" , products );
        //Cashier cashier = new Cashier(1, "Vincent" , customer , products);
        //cashier.sellProduct();
       /// customer1.buyProduct();
        //System.out.println(cashier.invoice());


       // System.out.println(Arrays.toString(products));


        //Manager Player Implementation.
       Manager manager = new Manager(1 , "Chief");
        manager.hireCashier(new Cashier(2 , "Chike"));


    }
}
