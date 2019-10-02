/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SharedClasses;

import CompositeDP.ItemComponent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JTextArea;

/**
 *
 * @author Alaa' Omar
 */
public class ShoppingCart {
    
    ArrayList items;
 //  JTextArea jArea;
   
    public ShoppingCart() {
         items= new ArrayList();
        // this.jArea=jArea;
    }
     public void addItem(ItemComponent itm)
    {
       items.add(itm);
    }

    public void removeItem(Item itm)
    {
        Iterator itemIterator = items.iterator();
        while (itemIterator.hasNext()) {
           if(itm.equals(itemIterator.next())){
                items.remove(itm);
        }
        }
    }
    
    public void getItems ()
    {
//        ArrayList itemsInShoopingCart = new ArrayList();
       Iterator itemIterator = items.iterator();
       System.out.println("Shopping Cart Items: ");
      // jArea.append("Shopping Cart Items: \n");
        while (itemIterator.hasNext()) {
            ItemComponent x = (ItemComponent)itemIterator.next();
//                itemsInShoopingCart.add(x);
              //jArea.append("Item Details, ID;"+x.getId()+" ,Name: "+ x.getName() +" ,Price:"+ x.getPrice() +"\n");
        } 
//        return itemsInShoopingCart;
    }
}


