package Collection_framework;

import java.util.TreeSet;

public
class TreeSet_Comparable
{
    public static
    void main (String[] args) {
        TreeSet t=new TreeSet (); //default natural sorting order
        t.add ("B");
        t.add ("Z"); //"z".compareTo("B");  =ve
        t.add ("A"); //"A".compareTo("B"); -ve
        System.out.println (t);
    }
}
