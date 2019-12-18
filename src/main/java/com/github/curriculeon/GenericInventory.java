package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by leon on 12/16/2019.
 */
public class GenericInventory<SomeType> implements InventoryInterface<SomeType>, Iterable<SomeType> {

    private ArrayList<SomeType> box = new ArrayList<>();

    @Override
    public void add(SomeType someObject) {
        box.add(someObject);
    }

    @Override
    public Boolean contains(SomeType someObject) {
        return box.contains(someObject);
    }

    @Override
    public SomeType get(int indexOfElement) {
        return box.get(indexOfElement);
    }

    @Override
    public SomeType remove(int indexOfElement) {
        return box.remove(indexOfElement);
    }

    @Override
    public SomeType[] toArray(SomeType[] objectsToBeAdded) {
        return box.toArray(objectsToBeAdded);
    }

    @Override
    public Iterator<SomeType> iterator() {
        return box.iterator();
    }
}
