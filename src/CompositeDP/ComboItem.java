/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositeDP;

import IteratorDP.Aggregate;
import IteratorDP.ItemComponentIterator;
import IteratorDP.Iterator;
import java.util.ArrayList;
//import java.util.Iterator;


/**
 *
 * @author Alaa' Omar, this is the concrete Composite Item
 */
public class ComboItem extends ItemComponent {
    
    ArrayList<ItemComponent> itemComponents = new ArrayList();
    String name;
    String id;
   

    public ComboItem( String id,String name) {
        this.name = name;
        this.id = id;
      
        
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    @Override
    public String getId() {
        return id;
    }
    
    @Override
    public void add(ItemComponent itemComponent) {
          if (itemComponents.contains(itemComponent))
      {
       setMsg("Can not add aduplicate Customer\n");
      }
      else
      {
        itemComponents.add(itemComponent);
      }
    }
    
    @Override
    public void remove(ItemComponent itemComponent) {
        itemComponents.remove(itemComponent);
    }
    
    @Override
    public ItemComponent getChild(int i) {
        return (ItemComponent) itemComponents.get(i);
    }
    
    @Override
    public String getName() {
        return name;
    }
    
   @Override
   public StringBuilder print() {
      StringBuilder strBuilder = new StringBuilder();
        System.out.print("inside compo item print");
//        

strBuilder.append("\n Composite item Name:").append(this.name).append(", Item Price: ").append(getPrice()).append("\n");
//       
//        strBuilder.append("---------------------");
//           Iterator iterator = this.CreateIterator();
//   //     Iterator iterator = itemComponents.iterator();
//        while (iterator.hasNext()) {
//            ItemComponent itmComponent
//                    = (ItemComponent) iterator.next();
//            itmComponent.print();
//            
//            
      //  }
        
         strBuilder.append("\n");
System.out.print("inside compo item print" +strBuilder.toString());
return strBuilder;
    }
   
    @Override
    public double getPrice() {
        double total = 0;
        Iterator iterator = this.CreateIterator();
       // Iterator iterator = itemComponents.iterator();
        while (iterator.hasNext()) {
            ItemComponent itmComponent
                    = (ItemComponent) iterator.next();
            total += itmComponent.getPrice();
        }
        return total;
    }

    @Override
    public Iterator CreateIterator() {
       System.out.print("inside ComboItem CreateIterator ");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return new ItemComponentIterator(itemComponents);
    }

   
    
}
