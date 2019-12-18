package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by leon on 12/16/2019.
 */
public class GenericInventory<SomeType> implements InventoryInterface<SomeType>, Iterable{
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
    public SomeType[] remove(int indexOfElement) {

        list.remove(list.get(indexOfElement));

        return toArray((SomeType[]) list.toArray());
    }

    @Override
    public SomeType[] toArray(SomeType[] arrayToBePopulated) {
        SomeType[] result =  list.toArray(arrayToBePopulated);
        return result;
    }

    @Override
    public Iterator <SomeType>iterator() {
        return this.list.iterator();
    }
}
