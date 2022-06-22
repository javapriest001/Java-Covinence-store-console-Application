package com.enwereVincent;

import Interfaces.iCashier;
import Model.Staff;

import java.util.Arrays;

import static com.enwereVincent.Main.input;

public class Cashier extends Staff implements iCashier {

    private Customer customer;
    private Product[] product;




    /*
        Creating a product array where the cashier will be able to add the products bought by the customer.
         */
    public Cashier(int id , String name ){
        super(id, name);
    }

    public Cashier(int id , String name, Customer customer , Product[] product){
        super(id, name);
        this.customer = customer;
        this.product = product;
    }

    @Override
    public void sellProduct(){
        input.nextLine();
        for (int i = 0; i < product.length; i++){
            System.out.print("Enter Product to be sold " + (i + 1) + " ");
            String prod =  input.nextLine();
            product[i] = new Product(prod);
        }

    }
    @Override
    public String invoice(){
        String message =  "################################# \n"+
                "Thank You For your Patronage, " + getCustomer().getName() +"! \n" +
                "RECIEPT OF PURCHASES  \n" +
                "################################# \n"+
                "CUSTOMER DETAILS: {"+
                "ID: " + getCustomer().getId() + ","+  " " +
                "Name: " + getCustomer().getName() + ","+ " " +
                "Address: " + getCustomer().getAddress()+
                " } \n"+
                "################################# \n"+
                "PRODUCTS: " + Arrays.toString(product);


        return message;
    }


    public int getId() {
        return super.getId();
    }

    public String getName(){
        return super.getName();
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product[] getProduct() {
        return product;
    }





    @Override
    public String toString() {
        return "Cashier{" +
                "id=" + super.getId() +
                ", Name='" + super.getName() + '\'' +
                '}';
    }

}
