package com.github.curriculeon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by leon on 12/16/2019.
 */
public class ItemInventory implements InventoryInterface<Item>, Iterable<Item> {
    List<Item> productManager = new ArrayList<>();
    @Override
    public void add(Item someObject) {
        this.productManager.add(someObject);
    }

    @Override
    public Boolean contains(Item someObject) {
        return this.productManager.contains(someObject);
    }

    @Override
    public Item get(int indexOfElement) {
        return this.productManager.get(indexOfElement);
    }

    @Override
    public Item remove(int indexOfElement) {
        return this.productManager.remove(indexOfElement);
    }

    @Override
    public Item[] toArray(Item[] objectsToBeAdded) {
        return this.productManager.toArray(objectsToBeAdded);
    }

    @Override
    public Iterator<Item> iterator() {
        return this.productManager.iterator();
    }
}
