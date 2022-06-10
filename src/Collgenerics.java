import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collgenerics {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("laila");
        list.add("soukaina");
        list.add("fatiha");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }

}
