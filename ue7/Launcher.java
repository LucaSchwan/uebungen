import java.util.Set;
import java.util.*;

public class Launcher {
    public static void main(String[] args){
        MutableMap<String, Integer> map = new MutableMap<>();
        
        putEntries(map);
        printEntries(map);

        ImmutableMap<String,Integer> immutableMap = map.asImmutableMap();
        printEntries(immutableMap);
    }

    public static void putEntries(WritableMap<String,Integer> map){
        map.put("sizeInMB",42);
        map.put("version",4);
        map.put("yearOfRelease",2015);
    }

    public static void printEntries(ReadableMap<String,Integer> map){
        Set<String> s = map.keysAsSet();
        

        for(Iterator<String> i = s.iterator(); i.hasNext();){
            String str = i.next();
            try{
                System.out.println(str + ": " + map.getOrThrow(str));
            }
            catch(Exception unknownKeyException){
                System.out.println("unknownKeyException");
            }
        }
    }
}

