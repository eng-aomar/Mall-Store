
import FactoryDP.Store;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alaa' Omar, this is a concrete class of BookStoreFactory, that
 * implements the CreateStore Method
 */
public class BookStoreFactory implements IStoreFactory {

    private Store store;
    private volatile static BookStoreFactory instance = null;

    private BookStoreFactory() {
    }

    // singleton method, the code below checks for an instance of BookStoreFactory,
    //if there is not, it enters a synchronized block ( for multithreding check)
    public static BookStoreFactory getFactoryInstance() {
        BookStoreFactory localInstance = BookStoreFactory.instance;

        if (localInstance == null) {
            synchronized (BookStoreFactory.class) {
                localInstance = BookStoreFactory.instance;
                if (localInstance == null) {
                    return new BookStoreFactory();
                }
            }
        }
        return localInstance;
    }

    @Override
    public  Store createStore() {

        store = new BookStore(this);

        return store;
    }

}
