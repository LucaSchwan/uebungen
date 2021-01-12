public class MutableMap<K,V> extends AbstractReadableMap<K,V> implements WritableMap<K,V> {
    
    @Override
    public void put(K nKey, V nValue){
        for(int i = 0; i<entries.length; i++){
            if(entries[i].key.equals(nKey)||entries[i].key.equals(null)){
                entries[i] = new Entry(nKey,nValue);
                return;
            }
        }
        entries = GenericArrayHelper.copyArrayWithIncreasedSize(entries, entries.length*2);
    }
}
