package HashMap;

public class HashMapImp implements HashMapInt{
    static final int CAPACITY = 16;
    Object[] map = new Object[CAPACITY];

    @Override
    public Object add(String key, Object object) {
        int hash = createHash(key);
        map[hash % CAPACITY] = object;

        return object;
    }

    @Override
    public boolean remove(String key) {
        int hash = createHash(key);
        map[hash % CAPACITY] = null;
        return true;
    }

    @Override
    public Object get(String key) {
        return null;
    }

    private int createHash(String key) {
        // create hash of key
        return key.hashCode();
    }
}
