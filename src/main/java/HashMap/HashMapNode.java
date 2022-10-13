package HashMap;

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


    public int getHash() {
        return hash;
    }

    public Object getObject() {
        return object;
    }

    public String getKey() {
        return key;
    }

    public HashMapNode getNext() {
        return next;
    }

}
