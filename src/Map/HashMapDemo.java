package Map;

import java.util.*;

public
class HashMapDemo {
    public static
    void main (String[] args) {
        HashMap m=new HashMap ();
        m.put ("sonal",101);
        m.put ("anup",102);
        m.put ("vihi",103);
        m.put ("kaushu",null);
       //  m.put (null,107);

        System.out.println (m);
        //m.put ("sonal",105);
        System.out.println (m.put ("sonal",105));
        System.out.println (m);
        Set s=m.keySet ();
        System.out.println (s);
        Collection C=m.values ();
        System.out.println (C);
        Set s1=m.entrySet ();
        System.out.println (s1);

        Iterator itr= s1.iterator ();
        while (itr.hasNext ()) {
            Map.Entry m1 = (Map.Entry) itr.next ();
            System.out.println (m1.getKey () + "-----" + m1.getValue ());
            if (m1.getKey ().equals ("sonal")) {
                m1.setValue ("106");
            }
            //System.out.println (m1);
        }         //  System.out.println (m1);
            System.out.println (m);
        }
    }

