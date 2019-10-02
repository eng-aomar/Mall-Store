
import FactoryDP.Store;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alaa' Omar, this is a concrete Shoe Store factory, that implements a
 * createStore() method, which is a singltion
 */
public class ShoeStoreFactory implements IStoreFactory {

    private Store store;
    private volatile static ShoeStoreFactory instance = null;

    private ShoeStoreFactory() {
    }

    public static ShoeStoreFactory getFactoryInstance() {
        ShoeStoreFactory localInstance = ShoeStoreFactory.instance;

        if (localInstance == null) {
            synchronized (ShoeStoreFactory.class) {
                localInstance = ShoeStoreFactory.instance;
                if (localInstance == null) {
                    return new ShoeStoreFactory();
                }
            }
        }
        return localInstance;
    }

    @Override
    public Store createStore() {

        store = new ShoeStore(this);

        return store;
    }

}
