

import CompositeDP.ItemComponent;
import FactoryDP.Store;
import IteratorDP.CustomerIterator;
import IteratorDP.ItemComponentIterator;
import SharedClasses.Customer;
import java.util.ArrayList;
import java.util.Iterator;
import ObserverDP.IObserver;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alaa' Omar, Concrete Class of abstract Store
 */
public class GameStore extends Store {

    GameStoreFactory gameStoreFactory;
    private ArrayList customers = new ArrayList();
    private ArrayList observers = new ArrayList();
    ArrayList items;

    public GameStore(GameStoreFactory gameStoreFactory) {
        this.gameStoreFactory = gameStoreFactory;
        customers = new ArrayList();
        observers = new ArrayList();
        items = new ArrayList();
    }

      @Override
    public void enter(Customer c) {
         if (customers.contains(c))
      {
       setMsg("Can not add aduplicate Customer\n");
      }
      else
      {
        customers.add(c);
          setMsg("New Customer added: " + c.getCustomerName() + " To Store: " + this.getStoreName() + "\n");
        
      }
    }

    //remove customers from mall
    @Override
    public void exit(Customer c) {
        
        Iterator<Customer> customerIterator = customers.iterator();
        
        while (customerIterator.hasNext()) {
            if (c== customerIterator.next()) {
                customerIterator.remove();
              setMsg(" The Customer has been removed from: " + this.getStoreName() + "\n");
                
            }
            else
            {
                setMsg("the selected Customer is no longer blongs " + this.getStoreName() + "\n");
            }

        }

    }

        //register observer for updates
    @Override
    public void registerObserver(IObserver o) {
          if (observers.contains(o))
      {
       setMsg("Can not add aduplicate observers\n");
      }
      else
      {
        observers.add(o);
         setMsg("New Observer added To Store: " + this.getStoreName() + "\n");
      }
    }

      //remove observer for updates
    @Override
    public void removeObserver(IObserver o) {
//       the iterator design pattern is used in this method

        Iterator<IObserver> ObserverIterator = observers.iterator();
        
        while (ObserverIterator.hasNext()) {
            if (o == ObserverIterator.next()) {
                ObserverIterator.remove();
              setMsg(" Observer has been removed from: " + this.getStoreName() + "\n");
                
            }
            else
            {
                setMsg("the selected Customer is not an observer of " + this.getStoreName() + "\n");
            }

        }
    }

    @Override
    public void notifyObservers() {
     int index = items.size() - 1;
        ItemComponent itm = (ItemComponent) items.get(index);
        Iterator<IObserver> ObserverIterator = observers.iterator();
        while (ObserverIterator.hasNext()) {
            ObserverIterator.next().update(itm);
        }
    }

    public void ItemsForSaleAdded() {
        System.out.println("inside ItemsForSaleAdded\n");
        notifyObservers();
    }

    @Override
    public void addItem(ItemComponent itm) {
       
        System.out.println("inside additem from button add item to stoe\n");
  
      if (items.contains(itm))
      {
       setMsg("Can not add aduplicate item\n");
      }
      else
      {
          items.add(itm);
           int index = items.lastIndexOf(itm);
        ItemsForSaleAdded();
          System.out.println("inside additem, index = " +index);
          setMsg("New Item added: " + itm.getName() + " To Store: " + this.getStoreName() );
      
     
    }
      return;
    }
    @Override
    public void getStoreObservors() {
//        ArrayList observersINStore = new ArrayList();
        Iterator observersIterator = observers.iterator();
        tArea.append(this.getStoreName() + "Observers:\n ");
        while (observersIterator.hasNext()) {
            Customer c = (Customer) observersIterator.next();
//            observersINStore.add(c);
            tArea.append( c.getCustomerName() + ",");

        }
        tArea.append("\n");
////        return observersINStore;
    }

    @Override
    public IteratorDP.Iterator CreateIterator() {
       System.out.print("inside book store CreateIterator, customers:"+ customers.size()+"\n");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return new CustomerIterator(customers); 
    }

  

}
