package models;

import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;
import java.util.Iterator;

public class KeyValueStore<K, V> {
    private static class Node<K, V> {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 16;
    private LinkedList<Node<K, V>>[] table;

    public KeyValueStore() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int getHash (K key) {
        return Math.abs(key.hashCode()) % SIZE;
    }
    public void put(K key, V value) {
        int index = getHash(key);
        LinkedList<Node<K, V>> bucket = table[index];
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }
        bucket.add(new Node<>(key, value));
    }

    public V get(K key) {
        int index = getHash(key);
        LinkedList<Node<K, V>> bucket = table[index];
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    public void remove(K key) {
        int index = getHash(key);
        LinkedList<Node<K, V>> bucket = table[index];
        bucket.removeIf(node -> node.key.equals(key));
    }

    public void forEachPair() {
        for (LinkedList<Node<K, V>> bucket : table) {
            for (Node<K, V> node : bucket) {
                System.out.println("Key: " + node.key + ", Value: " + node.value);
            }
        }
    }
}