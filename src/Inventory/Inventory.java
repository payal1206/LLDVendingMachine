package Inventory;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Inventory {
    private Map<Integer,Product> productMap;
    private Map<Integer,Integer> productIdMap;
    Queue<Integer> availableAisle;

    public Inventory(int count){
        availableAisle = new LinkedList<>();

        for (int i = 1; i <= count; i++){
            availableAisle.add(i);
        }
        productMap = new HashMap<>();
        productIdMap =  new HashMap<>();
    }

}
