package main;

public class HashMapNode {

    int hash;
    final Object object;
    final String key;

    HashMapNode next;

    public HashMapNode(String key, Object object, int hash) {
        this.key = key;
        this.object = object;
        this.hash = hash;
    }
}
