import java.util.*;

/**
 *              collection                       map
 *   set          list          queue          sortedmap
 * sortedset
 *
 **/
public class TestCollection {

    public static void main(String[] args) {
        //testHashSet();
        //testArrayList();
        //testMap();
    }

    public static void testMap() {
        Map<String, Integer> m = new HashMap<String, Integer>();
        m.put("a", 1);
        m.put("b", 2);

        System.out.println(m.size() + " distinct words:");
        System.out.println(m);
    }

    public static void testArrayList() {
        List<String> l = new ArrayList<String>();
        l.add("a");
        l.add("b");
        System.out.println(l.toString());
    }

    public static void testHashSet() {
        Set<String> os = new HashSet<String>();
        os.add("a");
        os.add("a");
        os.add("b");
        os.add("c");
        os.add("d");
        os.add("a");
        Set<String> s = new HashSet<String>();
        for (String a : os)
            if (!s.add(a))
                System.out.println("Duplicate detected: " + a);

        System.out.println(s.size() + " distinct words: " + s);
    }

}
