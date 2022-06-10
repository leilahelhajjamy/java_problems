import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapentry {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(4,"soukaina");
        map.put(5,"umedyy");
        map.put(8,"houda");
        map.put(7,"laila");

        Set<Map.Entry<Integer,String>> set = map.entrySet();
        Iterator<Map.Entry<Integer,String>> itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry e = itr.next();
            System.out.println(e.getKey() +" "+e.getValue());
        }

    }
}
