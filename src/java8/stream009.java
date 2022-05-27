package java8;
//min() & max() methods in streams
import java.util.ArrayList;

public
class stream009 {
    public static
    void main (String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer> ();
        l.add (-1);
        l.add (10);
        l.add (20);
        l.add (5);
        l.add (15);
        l.add (25);
        System.out.println (l);
        Integer min=l.stream ().min ((i1,i2)->i1.compareTo (i2)).get ();//default natural sorting order
        System.out.println ("min value in ascending order: "+min);
        int max=l.stream ().max ((i1,i2)->i1.compareTo (i2)).get();//default natural sorting order
        System.out.println ("max value in ascending oredr: "+max);
        int min_desc=l.stream ().min ((i1,i2)->-i1.compareTo (i2)).get ();//customized sorting order
        System.out.println ("Min value in descending oredr: "+min_desc);
        int max_desc=l.stream ().max((i1,i2)->-i1.compareTo (i2)).get ();//customized sorting order
        System.out.println ("Max value in descending order: "+max_desc);
    }
}
