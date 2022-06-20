package com.enwereVincent;
import java.util.ArrayList;

public class Manager{



    private int id;
    private String name;
    private ArrayList<Cashier> cashier;


    public Manager(int id , String name){

        this.id = id;
        this.name = name;
        cashier = new ArrayList<>();
    }


    public  void  hireCashier(Cashier cashierAdd) {
        cashier.add(cashierAdd);
        System.out.println("You Have Successfully Hired A new Manager!");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cashier=" + cashier +
                '}';
    }
}
