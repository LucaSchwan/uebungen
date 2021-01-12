import java.util.Set;
import java.util.HashSet;

public abstract class AbstractReadableMap<K,V> implements ReadableMap<K,V> {
    protected Entry<K,V>[] entries;

    public AbstractReadableMap (Entry<K,V>[] e){
        entries = GenericArrayHelper.copyArray(e);
    }

    public AbstractReadableMap (){
        entries = GenericArrayHelper.newEntryArrayOfSize(10);
    }

    @Override
    public V getOrThrow (K nKey) throws UnknownKeyException{
        for(int i = 0; i<entries.length;i++){
            if(entries[i].key.equals(nKey)&&entries[i].value != null){
                return entries[i].value;
            }
        }
        throw new UnknownKeyException();
    }

    public ImmutableMap<K,V> asImmutableMap(){
        return new ImmutableMap(entries);
    }

    public Set<K> keysAsSet(){
      HashSet hash = new HashSet();

      for(int i = 0; i<entries.length;i++){
        if(!(entries[i] == null)){
            hash.add(entries[i].key);
        }
      }

      return hash;
    }
}
