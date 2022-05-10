package Collection_framework;

import java.util.TreeSet;

public
class TreeSetDemo_StringBuffer {
    public static
    void main (String[] args) {
        TreeSet t=new TreeSet ();
        //StringBuffer does not implement comparable interface hence classcastexception occurred.
        t.add(new StringBuffer ("A"));
        t.add(new StringBuffer ("b"));
        t.add(new StringBuffer ("B"));
        t.add(new StringBuffer ("a "));
        System.out.println (t);
    }
}
