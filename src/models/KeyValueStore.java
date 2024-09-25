package models;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class KeyValueStore<K, V> {
    private HashMap<K, V> store;

    public KeyValueStore() {
        store = new HashMap<>();
    }

    public void put(K key, V value) {
        store.put(key, value);
    }

    public V get(K key) {
        return store.get(key);
    }

    public boolean remove(K key) {
        return store.remove(key) != null;
    }

    public void forEachPair() {
        for (Map.Entry<K, V> entry : store.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}