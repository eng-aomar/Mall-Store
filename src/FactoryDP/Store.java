package FactoryDP;

//import IteratorDP.Iterator;
import IteratorDP.Aggregate;
import ObserverDP.IObserver;
import SharedClasses.Customer;
import java.util.ArrayList;

import ObserverDP.ISubject;
import java.util.Iterator;
import javax.swing.JTextArea;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

/**
 *
 * @author Alaa' Omar, Abstract Class 
 */
public abstract class Store implements ISubject,Aggregate {

    private String storeName;
    private String StoreID;
    private ArrayList customers;
    private ArrayList observers;
    protected JTextArea tArea;
//    ArrayList items;
   String msg;
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Store() {

        customers = new ArrayList();
        observers = new ArrayList();
//        items = new ArrayList();

    }

    public void setStoreID(String StoreID) {
        this.StoreID = StoreID;
    }

    public String getStoreID() {
        return StoreID;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public abstract void enter(Customer c);

    public abstract void exit(Customer c);

//    public void addObserver(IObserver o) {
//        observers.add(o);
//    }
//    public void addItem(ItemComponent itm) {
//        items.add(itm);
//    }
    public Iterator getStoreCustomers() {
//        ArrayList customersINStore = new ArrayList();
        //Iterator customerIterator = 
       Iterator customerIterator = customers.iterator();
        System.out.println( ((Customer)customerIterator.next()).getCustomerName());
//        while (customerIterator.hasNext()) {
//            Customer c = (Customer) customerIterator.next();
////            customersINStore.add(c);
//            System.out.println(this.storeName + " " + c.getCustomerName());
//            tArea.append(this.storeName + " : Customers : " + c.getCustomerName() + "\n");
//            
//            

       // }
       // tArea.append("\n");
      return customerIterator;

       // Iterator itrtor
    }

    public abstract void getStoreObservors();

    public abstract void removeObserver(IObserver o);

    public void SetTextArea(JTextArea jt) {
        this.tArea = jt;
    }

}
