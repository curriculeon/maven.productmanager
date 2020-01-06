package com.github.curriculeon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 12/16/2019.
 */
public class ItemInventory implements InventoryInterface<Item> {
    private List<Item> list;

    public ItemInventory(){
        this.list = new ArrayList<>();
    }

    public ItemInventory(List<Item> list){
        this.list = list;
    }

    @Override
    public void add(Item someObject) {
        list.add(someObject);
    }

    @Override
    public Boolean contains(Item someObject) {
        if (list.contains(someObject)){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public Item get(int indexOfElement) {
        return list.get(indexOfElement);
    }

    @Override
    public Item remove(int indexOfElement) {
        return list.remove(indexOfElement);
    }

    @Override
    public Item[] toArray(Item[] objectsToBeAdded) {
        return list.toArray(objectsToBeAdded);
    }
}
