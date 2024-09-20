package M3_collections;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Task6 {
    public static void main(String[] args) throws IOException {
        int T;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter testcase count(T):");
        T = Integer.parseInt(reader.readLine());
        String[] outputs = new String[T];
        for (int i = 0; i < T; i++) {
            Map<Integer,Integer> map= new TreeMap<>();
            System.out.print("Enter query count for case"+(1+i) +":");
            int Q = Integer.parseInt(reader.readLine());
            String queriesString = reader.readLine();
            String[] queries = extractQueries(Q, queriesString);
            StringBuilder op = new StringBuilder();

            for (String query : queries) {
                String[] parts = query.split(" ");
                switch (query.charAt(0)){
                    case 'a':
                        int key = Integer.parseInt(parts[1]);
                        int val = Integer.parseInt(parts[2]);
                        map.put(key,val);
                        break;
                    case 'b':
                        key = Integer.parseInt(parts[1]);
                        op.append(map.getOrDefault(key,-1));
                        op.append(" ");
                        break;
                    case 'c':
                        op.append(map.size()).append(" ");
                        break;
                    case 'd':
                        key = Integer.parseInt(parts[1]);
                        map.remove(key);
                        break;
                    case 'e':
                        for (Integer integer : map.keySet()) {
                            op.append(integer).append(" ");
                        }
                        break;
                    default:


                }
            }
            outputs[i] = op.toString().trim();
        }
        for (int i = 0; i <T ; i++) {
            System.out.println("output for case "+(1+i)+":"+outputs[i]);
        }
    }

    private static String[] extractQueries(int Q, String queriesString) {
        String[] queries = new String[Q];
        int k = 0;
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < queriesString.length(); j++) {
            char c = queriesString.charAt(j);
            if (Character.isAlphabetic(c) && !sb.isEmpty()) {
                queries[k] = sb.toString().trim();
                k++;
                sb = new StringBuilder();
            }
            sb.append(c);
        }
        if (!sb.isEmpty()) {
            queries[k] = sb.toString().trim();
        }
        return queries;
    }

    /**** output for example cases
     * Enter testcase count(T):2
     * Enter query count for case1:6
     * a 1 2 a 66 3 b 66 d 1 c e
     * Enter query count for case2:4
     * a 1 66 b 5 e c
     * output for case 1:3 1 66
     * output for case 2:-1 1 1
     */
}

