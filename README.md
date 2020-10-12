# Mall-Store
An application that is built over some design patterns

- Mall
  - The mall itself.
  - Notable Attributes:
  - name - the name of the mall
  - stores - a collection of stores of different types
  - customers - the customers currently in the mall
  - Possible Methods:
  - void enter(Customer c) - customer c enters the mall
  - void exit(Customer c) - customer c exits the mall
  - ShoppingCart getShoppingCart - returns an empty shopping cart
  - Enumeration customers() - returns an enumeration of the customers in the mall
  - Enumeration stores() - returns an enumeration of the stores in the mall
  - void addStore(Store s) - add a store to the mall
- Store
o Abstract superclass for a store
o Notable Attributes:
§ name - the name of the store
§ id - unique ID for the store
§ items - items available for sale in the store
§ customers - the customers currently in the store
§ observers - the observers of the store
o Possible Methods:
§ abstract void enter(Customer c) - customer c enters the store
§ abstract void exit(Customer c) - customer c exits the store
§ Enumeration customers() - returns an enumeration of the customers in the
store
§ Enumeration items() - returns an enumeration of the items available for sale
in the store
§ void addObserver(Osberver o) - add an observer to the store
• BookStore
o A possible subclass of Store
• ShoeStore
o A possible subclass of Store
• GameStore
o A possible subclass of Store
• Item
o An item for sale in a store
o Notable Attributes:
§ name - the name of the item
§ id - unique ID for the item
§ storeId - the ID of the store from which the item came
§ price - the price of the item
• Customer
o A customer!
o Notable Attributes:
§ name - the name of the customer
§ shoppingCart - the shopping cart being used by the customer
§ store - the store the customer is currently in
• ShoppingCart
o A shopping cart for the customer
o Notable Attributes:
§ items - items currently in the shopping cart
o Possible Methods:
§ Enumeration items() - returns an enumeration of the items currently in the
cart
§ void addItem(item) - add an item to the shopping cart
§ void removeItem(item) - remove an item from the shopping cart
Note that required accessors and mutators are not listed in the above for the sake of brevity.

## Project	Requirements	
Use the above class diagram to write a working version of the shopping mall.
Your project must have at least one customer, three stores and five items for sale at each store.
Implement the user interface any way you like, either textual or graphical.
Your project must implement the following design patterns:
* Iterator
This one is easy. Methods that return an Enumeration demonstrate the Iterator pattern.
* Abstract Factory or Factory Method (or both!)
Create all stores using factories.
* Singleton
Allow only one instance of any factory type you create.
* Observer
All stores should be observable objects. In particular, a customer should be able to be notified
whenever a new item has been added for sale at a store. Demonstrate this pattern by having one or
more customers register for such notifications with one or more stores.
NOTE: The methods required to implement this pattern are not specified above!
* Composite
One way to utilize the Composite pattern is to sell combo items in a store, such as a combo meal or
a combo outfit. 
