package Collection_framework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public
class Map001 {
    public static
    void main (String[] args) {
       Map map=new HashMap<> ();
       map.put (101,"abc");
       map.put (109,"xyz");
       map.put (103,"mno");
       map.put (104,"pqr");
        System.out.println ("Map Implementation:   "+map);
        Map map1=new HashMap ();
        map1.put (105,"stuv");
        map1.putAll (map);
        map.put (102,"sonal");
        System.out.println (map);
        System.out.println ("Map using putall:  "+map1);
        System.out.println (map.isEmpty ());
        System.out.println (map.get (104));
        System.out.println (map1.get (105));
        map1.remove (105);
        System.out.println (map1);
        System.out.println (map.containsKey (1010));
        System.out.println (map1.containsKey (107));
        System.out.println (map.containsValue ("abc"));
        System.out.println (map1.containsValue ("bmnv"));
        System.out.println (map.isEmpty ());
        System.out.println (map1.size ());
        map1.clear ();
        System.out.println (map1);
        System.out.println ("*************************************************************");
        map=new TreeMap<> ();
        map.put (111,"sonal");
        map.put (112,"anup");
        map.put (113,"vihi");
        System.out.println ("Tree Map Implementation : "+map);
        System.out.println ("*************************************************************");
        map=new LinkedHashMap ();
        map.put (111,"sonal");
        map.put (112,"anup");
        map.put (113,"vihi");
        System.out.println ("LinkedhashMap Implementation : "+map);

    }
}
