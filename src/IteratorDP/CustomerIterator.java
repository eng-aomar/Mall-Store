/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IteratorDP;


import SharedClasses.Customer;
import java.util.ArrayList;

/**
 *
 * @author fr-pa
 */
public class CustomerIterator implements Iterator{
      ArrayList<Customer> items;
    int position = 0;

    public CustomerIterator(ArrayList items) {
        this.items = items;
    }

    @Override
    public Object next() {
        Customer menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        System.out.println("inside ItemComponentIterator has next ");
        if (position >= items.size() || items.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void remove() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (position <= 0) {
            throw new IllegalStateException("You can’t remove an item until you’ve done at least one next()");
        }
        if (items.get(position - 1) != null) {
            for (int i = position - 1; i < (items.size() - 1); i++) {
               // items.get(i) = items.get(i + 1);
            }
          //  items.get(item.size() - 1) = null;
        }
    }
    
}
