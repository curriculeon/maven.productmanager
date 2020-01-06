package com.github.curriculeon;

import java.util.List;

/**
 * Created by leon on 12/16/2019.
 */
public class GenericInventory<SomeType> implements InventoryInterface<SomeType> {
    private List<SomeType> list;

    @Override
    public void add(SomeType someObject) {
        list.add(someObject);
    }

    @Override
    public Boolean contains(SomeType someObject) {
        if (list.contains(someObject)){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public SomeType get(int indexOfElement) {
        return null;
    }

    @Override
    public SomeType remove(int indexOfElement) {
        return null;
    }

    @Override
    public SomeType[] toArray(SomeType[] objectsToBeAdded) {
        return null;
    }
}
