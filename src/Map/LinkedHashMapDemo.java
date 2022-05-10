package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public
class LinkedHashMapDemo {
    public static
    void main (String[] args) {
        LinkedHashMap m=new LinkedHashMap ();
        //insertion order is preserved in linked hashmap
        //linkedhash set & linked hashmap are used in developing cache based apps commonly where duplicates are not
        // allowed & insertion order is preserved.
        m.put ("sonal",101);
        m.put ("anup",102);
        m.put ("vihi",103);
        m.put ("kaushu",null);
         m.put (null,null);

        System.out.println (m);
    }
}
