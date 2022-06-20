package com.enwereVincent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {




        //Manager Player Implementation.
        Manager manager = new Manager(1 , "Chief");
        manager.hireCashier(new Cashier(2 , "Chike"));

        //Instantiation and implementation of  the cashier Role.

        //Get the number Of products the cashier wants th sell.
        System.out.print("How Many Products Do You Want to sell?: ");
        int numberOfProducts = input.nextInt();

        //Array of the product class.
        Product[] products = new Product[numberOfProducts];

        //An Overloaded Instance of the customer class
        Customer customer = new Customer(1, "Customer 1" , "Lagos" );
        Cashier cashier = new Cashier(1, "Cashier1" , customer , products);
        cashier.sellProduct();

        //Customer's Invoice From Cashier
        System.out.println(cashier.invoice());


        //Get the number Of products the cashier wants th sell.
        System.out.print("How Many Products Do You Want to Buy?: ");
        int numberOfProductsToBuy = input.nextInt();

        //Array of the product class.
        Product[] productsToBuy = new Product[numberOfProductsToBuy];
        //An Overloaded Instance of the customer class
        Customer customer1 = new Customer(1, "Vincent" , "Abuja" , productsToBuy );

        customer1.buyProduct();




    }


    public static void sellMrthod(Product product){
        ArrayList<Product> products= new ArrayList<>();
        products.add(product);
    }

}
