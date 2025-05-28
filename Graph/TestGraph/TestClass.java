import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nodeEdge = br.readLine();
        String[] nodeEdgeArr = nodeEdge.split(" ");
        int node = Integer.parseInt(nodeEdgeArr[0]);
        int edge = Integer.parseInt(nodeEdgeArr[1]);
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<edge;i++){
            String s = br.readLine();
            String[] li = s.split(" ");
            List<Integer> temp = map.getOrDefault(Integer.parseInt(li[0]),new ArrayList<Integer>());
            // System.out.println(temp.toString());
            temp.add(Integer.parseInt(li[1]));
            map.put(Integer.parseInt(li[0]),temp);
        }
        // for(Map.Entry<Integer, List<Integer>> e: map.entrySet()){
        //     System.out.println("Adjacency list of node "+e.getKey()+": "+e.getValue().toString());
        // }

        int q = Integer.parseInt(br.readLine());
        for(int i=0;i<q;i++){
            String query = br.readLine();
            String[] queryArr = query.split(" ");
            int a = Integer.parseInt(queryArr[0]);
            int b = Integer.parseInt(queryArr[1]);
            // System.out.println(map.get(a));
            if((map.get(a)!=null && map.get(a).contains(b))||(map.get(b)!=null && map.get(b).contains(a))){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
