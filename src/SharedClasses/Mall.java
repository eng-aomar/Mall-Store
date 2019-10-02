/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SharedClasses;

import FactoryDP.Store;
import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author fr-pa
 */
public class Mall {

    private String mallName;
    /*Mall Name*/
    ArrayList customers = new ArrayList();
    ArrayList stores = new ArrayList();
    //privae JTextArea jArea;
String msg;
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public void enter(Customer c) {
         if (customers.contains(c))
      {
       setMsg("Can not add aduplicate Customer\n");
      }
      else
      {
        customers.add(c);
        System.out.println(c.getCustomerName() + " Entered " + this.mallName);
          setMsg("A new Customer (" + c.getCustomerName()+ ") has been added to MAll: " + this.getMallName() + "\n");
      }
    }

    public void exit(Customer c) {
        
        Iterator customersterator = customers.iterator();
        while (customersterator.hasNext()) {
            if (c== customersterator.next()) {
                customersterator.remove();
                setMsg(c.getCustomerName() + " Customer Exit " + this.mallName);
                System.out.println(c.getCustomerName() + " Customer Exit " + this.mallName);
                //jArea.append(c.getCustomerName() + " Customer Exit " + this.mallName + "\n");
            }
            else 
            {
                 setMsg(c.getCustomerName() + " is no longer belongs to: " + this.mallName);
            }
        }
    }

    public Mall(String mallName) {
        this.mallName = mallName;
       // this.jArea=jArea;
        System.out.println("Mall Name:" + mallName);
       // jArea.append("Mall Name:" + mallName +"\n");
        
    }

    public ShoppingCart getShoppingCart() {
        return new ShoppingCart();
    }

    public void addStore(Store s) {
          if (stores.contains(s))
      {
       setMsg("Can not add aduplicate Store\n");
      }
      else
      {
        stores.add(s);
        System.out.println(s.getStoreName() + " Has been added To " + this.mallName);
      setMsg("A new Store (" + s.getStoreName() + ") has been added to MAll: " + this.getMallName() + "\n");
    }
    }
    public void getMallCustomers() {
//        ArrayList customersINMall = new ArrayList();
        Iterator customerIterator = customers.iterator();
          System.out.print("Mall Customers: ");
        //  jArea.append("Mall Customers: ");
        while (customerIterator.hasNext()) {
            Customer c = (Customer) customerIterator.next();
//            customersINMall.add(c);
             System.out.print(c.getCustomerName() +",");
           //  jArea.append(c.getCustomerName() +",");
              
        }
;
        
       
    }

    public void getMallStores() {
//        ArrayList mallStores = new ArrayList();
        Iterator storeIterator = stores.iterator();
        System.out.println();
         System.out.print("Mall Stores: ");
       //  jArea.append("Mall Stores:");
        while (storeIterator.hasNext()) {
            Store s = (Store) storeIterator.next();
//            mallStores.add(s);
            System.out.println(s.getStoreName()+",");
           // jArea.append(s.getStoreName()+",");
        }
//        return mallStores;
 //jArea.append("\n");
    }

}
