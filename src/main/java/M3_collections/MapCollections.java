package M3_collections;

import java.util.*;
import java.util.stream.Stream;

public class MapCollections {
    public static <MyObject> void main(String[] args) {

//        types of map
        Map ma = new HashMap();
        Map apB = new TreeMap();
        Map mapC = new LinkedHashMap();
        Map mapD = new IdentityHashMap();

//        Map iterators
        Map<String, MyObject> mp = new HashMap<>();

        for(MyObject anObject : mp.values()){ }

        for(String key : mp.keySet()){
            MyObject value = mp.get(key);
        }



//      Inserting Elements Into a Java Map
        Map<String, String> map = new HashMap<>();
        map.put("key1", " 1");
        map.put("key2", " 2");
        map.put("key3", " 3");

//        Inserting All Elements From Another Map
        Map<String, String> mapA = new HashMap<>();
        mapA.put("key1", "value1");
        mapA.put("key2", "value2");

        Map<String, String> mapB = new HashMap<>();
        mapB.putAll(mapA);
        System.out.println(mapA+" put all "+mapB);

        mapA.get("key1");  //Get Elements From a Java Map
        boolean hasKey = map.containsKey("123"); //Checking if Map Contains Key
        boolean hasValue = map.containsValue("value 1"); //Checking if Map Contains Value

//        Get or Default Value
        Map<String, String> map1 = new HashMap<>();
        map1.put("A", "1");
        map1.put("B", "2");
        map1.put("C", "3");
        String value = map1.getOrDefault("E", "default value");
        System.out.println("map1 "+map1 + " value "+value);

//-----------------------------------------------------------------------
        //ket iterations

        Map<String, String> mp1 = new HashMap<>();
        mp1.put("A", "1");
        mp1.put("B", "2");
        mp1.put("C", "3");

//        Using a Key Iterator
        Iterator<String> iterator = mp1.keySet().iterator();
        while(iterator.hasNext()){
            String key   = iterator.next();
            String valu = mp1.get(key);
        }

//        Using a Key For-Each Loop
        for(String key : mp1.keySet()) {
            String vale = mp1.get(key);
        }

//        Using a Key Stream
        Stream<String> stream = mp1.keySet().stream();
        stream.forEach(System.out::println);

//---------------------------------------------------------------
        // value itet=rator
        Iterator<String> iterato = mp1.values().iterator();
        while(iterato.hasNext()) {
            String nextValue = iterato.next();
        }

//      Using a Value For-Each Loop
        for(String vale : map.values()){
            System.out.println(vale);
        }

//        Using a Value Stream
        Stream<String> strea = map.values().stream();
        strea.forEach(System.out::println);

//-------------------------------------------
//        Using an Entry Iterator
        for(Map.Entry<String, String> entry : mp1.entrySet()){
            String key = entry.getKey();
            String value1 = entry.getValue();
        }

//        Using an Entry For-Each Loop
        for(Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey();
            String vaue = entry.getValue();
        }

//-----------------------------------------
        map.remove("key1"); //Removing Entries From a Java Map
        map.clear(); //Removing All Entries
        map.replace("key", "val2"); //Replacing an Entry in a Java Map
        int entryCount = map.size(); //Reading Number of Entries in Map

//        ---------------------------
        //compute()
        //computeIfAbsent()
        //computeIfPresent()
        //merge()

        int n1 =10;
        int n2 =1;
        int i = (n1 > n2) ? n1 : n2;
        System.out.println(i);

        Map<String,Integer> mp3 = new HashMap<>();
        mp3.put("key1", 1);
        mp3.put("key2", 2);
        mp3.compute("key2",(k,v)-> 10);  //to add or update k,v
        mp3.computeIfPresent("key2",(k,v)-> 20);  //to update v if present
        mp3.computeIfAbsent("key2",(k)->6); //to add v if absent or not present in map
        mp3.putIfAbsent("key3", 3);
        System.out.println(mp3);




    }
}
