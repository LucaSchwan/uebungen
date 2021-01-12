public interface ReadableMap <K,V> {
    public V getOrThrow (K key) throws UnknownKeyException;
    public ImmutableMap<K,V> asImmutableMap();
}
