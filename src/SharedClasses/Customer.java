/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SharedClasses;

import CompositeDP.ItemComponent;
import FactoryDP.Store;

import IteratorDP.Iterator;

import ObserverDP.IObserver;
import javax.swing.JTextArea;

/**
 *
 * @author fr-pa
 */
public class Customer implements IObserver {

    private String CustomerName;
    private String CustID;
    private Store store;
    /* subject */
    ShoppingCart shoppingCart;
    private JTextArea tArea;
    Customer[] customers;

    public Customer(String CustID, String CustomerName, ShoppingCart shoppingCart, JTextArea tArea) {
             this.CustID = CustID;
        this.CustomerName = CustomerName;

        this.shoppingCart = shoppingCart;
       

        this.tArea = tArea;
        // tArea.append(CustomerName +" Customer Has been Created " +"\n");

    }

    public String getCustID() {
        return CustID;
    }

    public void setCustID(String CustID) {
        this.CustID = CustID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    @Override
    public void update(ItemComponent itm) {
        System.out.println("New Item Added for Sale, to Customer:" + this.getCustomerName() + " ,Item Name: " + itm.getName() + " ,Item Price: " + itm.getPrice()); //To change body of generated methods, choose Tools | Templates.
        tArea.append("this is a Notification: A new Item has been Added for Sale, to Customer:" + this.getCustomerName() + " ,Item Name: " + itm.getName() + " ,Item Price: " + itm.getPrice() + "\n");
    }

//    public Iterator createIterator() {
//        return new ArrayListIterator(customers);
//    }
}
