package com.github.curriculeon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 12/16/2019.
 */
public class GenericInventory<SomeType> implements InventoryInterface<SomeType> {
    List <SomeType> list = new ArrayList<>();
    @Override
    public void add(SomeType someObject) {
        list.add(someObject);
    }

    @Override
    public Boolean contains(SomeType someObject) {
        return list.contains(someObject);
    }

    @Override
    public SomeType get(int indexOfElement) {

        return list.get(indexOfElement);
    }

    @Override
    public SomeType remove(int indexOfElement) {
        return list.remove(indexOfElement);
    }

    @Override
    public SomeType[] toArray(SomeType[] arrayToBePopulated) {
        SomeType[] result =  list.toArray(arrayToBePopulated);
        return result;
    }
}
