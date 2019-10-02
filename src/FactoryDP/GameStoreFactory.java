
import FactoryDP.Store;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alaa' Omar, this is a concrete Game Store Factory class,which
 * implements the create one instance of GameStore method
 */
public class GameStoreFactory implements IStoreFactory {

    private Store store;
    private volatile static GameStoreFactory instance = null;

    private GameStoreFactory() {
    }

    public static GameStoreFactory getFactoryInstance() {
        GameStoreFactory localInstance = GameStoreFactory.instance;

        if (localInstance == null) {
            synchronized (GameStoreFactory.class) {
                localInstance = GameStoreFactory.instance;
                if (localInstance == null) {
                    return new GameStoreFactory();
                }
            }
        }
        return localInstance;
    }

    @Override
    public synchronized Store createStore() {

        if (store == null) {
            store = new GameStore(this);

        }
        return store;
    }

}
