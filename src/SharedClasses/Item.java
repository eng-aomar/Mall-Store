/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SharedClasses;

import CompositeDP.ItemComponent;
import IteratorDP.Iterator;





/**
 *
 * @author fr-pa
 */
public class Item extends ItemComponent {

    String name;
    String id;
    double price;

    public Item( String id,String name, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
       
      
        
    }

    public Item() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public StringBuilder print() {

    StringBuilder strBuilder = new StringBuilder();

        System.out.print(" inside leaf print :" + this.getName());
        
        System.out.println(", " + this.getId());
        System.out.println(" -- " + this.getPrice());
        
        
        strBuilder.append("\n");
        String str =         "Leaf item id: "+this.getId() +", item Name:" + this.getName() + " item price:" + this.getPrice()+"\n" ;
          System.out.println("str" +str.toString());
        strBuilder.append( str);
      
        strBuilder.append("---------------------");
        return strBuilder;

    }

    @Override
    public Iterator CreateIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    
}
