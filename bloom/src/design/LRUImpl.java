package design;

import java.util.*;

public class LRUImpl<K, V> extends LinkedHashMap<K, V> {
    private int size;

    public static void main(String[] args) {
        LRUImpl<Integer, Integer> cache = LRUImpl.newInstance(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(1, 1);
        cache.put(3, 3);

        System.out.println(cache);
    }

    private LRUImpl(int size) {
        super(size, 0.75f, true);
        this.size = size;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > size;
    }

    public static <K, V> LRUImpl<K, V> newInstance(int size) {
        return new LRUImpl<K, V>(size);
    }

}
