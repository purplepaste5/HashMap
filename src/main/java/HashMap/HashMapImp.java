package HashMap;

public class HashMapImp implements HashMapInt {
    static final int CAPACITY = 16;
    HashMapNode[] nodeMap = new HashMapNode[CAPACITY];

    @Override
    public Object add(String key, Object object) {
        int hash = createHash(key);
        HashMapNode node = new HashMapNode(key, object, hash);
        nodeMap[hash % CAPACITY] = node;

        return object;
    }

    @Override
    public boolean remove(String key) {
        int hash = createHash(key);
        HashMapNode nodeCheck = nodeMap[hash % CAPACITY];
        if (nodeCheck.getKey().equals(key)) {
            nodeMap[hash % CAPACITY] = null;
            return true;
        } else {
            // loop through the next ones to try to find it and if not return false
            return false;
        }
    }

    @Override
    public Object get(String key) {
        int hash = createHash(key);
        HashMapNode nodeCheck = nodeMap[hash % CAPACITY];
        if (nodeCheck.getKey().equals(key)) {
            return nodeCheck.getObject();
        } else {
            // loop through the next ones to try to find it and if not return false
            return null;
        }

    }

    public HashMapNode[] getMap() {
        return nodeMap;
    }

    private int createHash(String key) {
        // create hash of key
        return key.hashCode();
    }
}
