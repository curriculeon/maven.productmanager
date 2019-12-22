package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by leon on 12/16/2019.
 */
public class GenericInventory<SomeType> implements InventoryInterface<SomeType>, Iterable<SomeType> {
    List<SomeType> productManager = new ArrayList<>();

    @Override
    public void add(SomeType someObject) {
        this.productManager.add(someObject);
    }

    @Override
    public Boolean contains(SomeType someObject) {
        return this.productManager.contains(someObject);
    }

    @Override
    public SomeType get(int indexOfElement) {
        return this.productManager.get(indexOfElement);
    }

    @Override
    public SomeType remove(int indexOfElement) {
        return this.productManager.remove(indexOfElement);
    }

    @Override
    public SomeType[] toArray(SomeType[] objectsToBeAdded) {
        return this.productManager.toArray(objectsToBeAdded);
    }

    @Override
    public Iterator<SomeType> iterator() {
        return this.productManager.iterator();
    }
}
