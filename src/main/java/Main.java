import main.java.HashMap.HashMapImp;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(("Hello").hashCode());
        HashMapImp hashMapImp = new HashMapImp();
        System.out.println(("test").hashCode() % 16);
        System.out.println(("test2").hashCode() % 16);
        hashMapImp.add("test", "test return");
        hashMapImp.add("test2", "test return 2");
        System.out.println(Arrays.toString(hashMapImp.getMap()));
        System.out.println(hashMapImp.get("test"));
        System.out.println(hashMapImp.get("test2"));
        System.out.println(hashMapImp.get("test3"));
    }
}