package com.enwereVincent;
import Interfaces.iManager;
import Model.Staff;

import java.util.ArrayList;

public class Manager extends Staff implements iManager {




    private ArrayList<Cashier> cashier;


    public Manager(int id , String name){

        super(id,name);
        cashier = new ArrayList<>();
    }


    @Override
    public  void  hireCashier(Cashier cashierAdd) {

        cashier.add(cashierAdd);
        System.out.println("You Have Successfully Hired A new Cashier!");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", cashier=" + cashier +
                '}';
    }
}
