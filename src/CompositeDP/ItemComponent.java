/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositeDP;

import IteratorDP.Aggregate;
import IteratorDP.Iterator;

/**
 *
 * @author Alaa' Omar, this is the abstract class for the composite item
 */
public abstract class ItemComponent implements Aggregate {

    String name;
    String id;
  String msg;
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void add(ItemComponent itemComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(ItemComponent itemComponent) {
        throw new UnsupportedOperationException();
    }

    public ItemComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getId() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public StringBuilder print() {
        throw new UnsupportedOperationException();
    }
}
