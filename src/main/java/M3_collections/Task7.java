package M3_collections;

import java.util.*;

public class Task7 {
    public static void main() {

        Map<String,Integer> hash = new HashMap<>();
        hash.put("ff", 133);
        hash.put("bff", 2);
        hash.put("c", 3);
        hash.compute("c",(k,v)-> 10);
        hash.computeIfPresent("a",(k,v)-> 20);
        hash.computeIfAbsent("d",(k)->6);
        System.out.println("hash map "+hash);

        Map<String,Integer> tree = new TreeMap<>();
        tree.put("ff", 133);
        tree.put("bff", 2);
        tree.put("c", 3);
        System.out.println("tree map "+tree);

        Map<String,Integer> linked = new LinkedHashMap<>();
        linked.put("ff", 133);
        linked.put("bff", 2);
        linked.put("c", 3);
        System.out.println("linked map "+linked);

        Set<String> entries = hash.keySet();
        Collection<Integer> values = hash.values();
        Set<Map.Entry<String, Integer>> entries1 = hash.entrySet();

        Map<String,Integer> m2 = new Hashtable<>();
        m2.put("ff", 133);
        m2.put("bff", 2);
        System.out.println("m2 map "+m2);
//        ===============================================

        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("ff");
        linkedSet.add("bff");
        linkedSet.add("c");
        System.out.println("linkedset "+linkedSet);

        Set<String> hashSet = new HashSet<>();
        hashSet.add("ff");
        hashSet.add("bff");
        hashSet.add("c");
        System.out.println("hashSet "+hashSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("ff");
        treeSet.add("bff");
        treeSet.add("c");
        System.out.println("treeSet "+treeSet);

//        ==================================================
        List<String> aryList = new ArrayList<>();
        aryList.add("ff");
        aryList.add("bff");
        aryList.add("c");
        System.out.println("aryList "+aryList);

        List<String> linkList = new LinkedList<>();
        linkList.add("ff");
        linkList.add("bff");
        linkList.add("c");
        System.out.println("linkList "+linkList);

        List<String> vector = new Vector<>();
        vector.add("ff");
        vector.add("bff");
        vector.add("c");
        System.out.println("vector "+vector);

        Stack<String> stack = new Stack<>();
        stack.push("ff");
        stack.push("ff");
        stack.push("c");
        System.out.println("stack "+stack);
        System.out.println("peak "+stack.peek()); //element at top in list
        System.out.println("pop "+stack.pop());  //remove top element
        System.out.println("stack "+stack);
        System.out.println("peak "+stack.peek());

        PriorityQueue q = new PriorityQueue<>();
        q.add("w");
        q.add("edef");
        System.out.println("PriorityQueue "+q);

        Queue queue = new LinkedList<>();
        queue.add("wrr");
        queue.add("edef");
        System.out.println("Queue "+queue);
        queue.offer("wf");
        queue.offer("edefd");
        System.out.println("Queue "+queue);
        System.out.println("peak "+queue.peek());
        System.out.println("pool "+queue.poll());
    }
}

