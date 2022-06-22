package com.enwereVincent;

import Interfaces.iCustomer;
import Model.Staff;

import java.util.ArrayList;
import java.util.Arrays;

import static com.enwereVincent.Main.input;

public class Customer extends Staff implements iCustomer  {

    private String Address;

    private  Product[] product;



    public Customer(int id, String name , String address){
        super(id, name);
//        this.id = id;
//        this.Name = name;
        this.Address = address;
    }
    //Overloaded Constructor that intializes the product array.
    public Customer(int id, String name , String address, Product[] addProduct){
        super(id, name);
        this.Address = address;
        this.product = addProduct;
    }

    //The buy method loops through the product array and creates new product objects
    public  void buyProduct(){
        input.nextLine();
        for (int i = 0; i < product.length; i++){
            System.out.print("Enter Product " + "No." + (i + 1) + " ");
            String prod =  input.nextLine();
            product[i] = new Product(prod);
        }
        System.out.println("Hello!, You Just Bought: " + Arrays.toString(product));
    }

    public int getId() {
        return super.getId();
    }

    public String getName() {
        return super.getName();
    }

    public String getAddress() {
        return Address;
    }

    public Product[] getProduct() {
        return product;
    }
}
