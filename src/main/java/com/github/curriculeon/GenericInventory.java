package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by leon on 12/16/2019.
 */
public class GenericInventory<SomeType> implements InventoryInterface<SomeType> {
    List<SomeType> inventoryList=new ArrayList<SomeType>();

    @Override
    public void add(SomeType someObject) {
        inventoryList.add(someObject);
    }

    @Override
    public Boolean contains(SomeType someObject) {
        return inventoryList.contains(someObject);
    }

    @Override
    public SomeType get(int indexOfElement) {
        return inventoryList.get(indexOfElement);
    }

    @Override
    public SomeType remove(int indexOfElement) {
        return inventoryList.remove(indexOfElement);
    }

    @Override
    public SomeType[] toArray(SomeType[] objectsToBeAdded) {
        return (SomeType[]) inventoryList.toArray();
    }
    @Override
    public Iterator iterator() {
        return inventoryList.iterator();
    }
}
