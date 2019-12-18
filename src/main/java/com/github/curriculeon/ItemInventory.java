package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by leon on 12/16/2019.
 */
public class ItemInventory implements InventoryInterface<Item>, Iterable {

    List<Item> list = new ArrayList<>();
    @Override
    public void add(Item someObject) {
        list.add(someObject);
    }

    @Override
    public Boolean contains(Item someObject) {

        return list.contains(someObject);
    }

    @Override
    public Item get(int indexOfElement) {

        return list.get(indexOfElement);
    }

    @Override
    public Item[] remove(int indexOfElement) {
        list.remove(indexOfElement);
        return toArray((Item[]) list.toArray());
    }

    @Override
    public Item[] toArray(Item[] objectsToBeAdded) {
        return list.toArray(objectsToBeAdded);
    }

    @SuppressWarnings("rawtypes")
    @Override
    public Iterator iterator() {
        return this.list.iterator();
    }
}
