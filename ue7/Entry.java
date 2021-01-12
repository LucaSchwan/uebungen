public class Entry <K,V>{
    K key;
    V value;

    public Entry (K k, V v){
        key = k;
        value = v;
    }

    public K getKey(){
        return key;
    }
    
    public V getValue(){
        return value;
    }

}