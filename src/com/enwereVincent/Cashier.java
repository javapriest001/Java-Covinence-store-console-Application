package com.enwereVincent;

import java.util.Arrays;

import static com.enwereVincent.Main.input;

public class Cashier {
    private int id;
    private String Name;
    private Customer customer;
    private Product[] product;




    /*
        Creating a product array where the cashier will be able to add the products bought by the customer.
         */
    public Cashier(int id , String Name ){
        this.id = id;
        this.Name = Name;
    }

    public Cashier(int id , String Name, Customer customer , Product[] product){
        this.id = id;
        this.Name = Name;
        this.customer = customer;
        this.product = product;
    }

    public void sellProduct(){
        input.nextLine();
        for (int i = 0; i < product.length; i++){
            System.out.print("Enter Product " + (i + 1) + " ");
            String prod =  input.nextLine();
            product[i] = new Product(prod);
        }
        System.out.println("Pro");
    }
    public int getId() {
        return id;
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
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }

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

}
