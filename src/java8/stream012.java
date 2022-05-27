package java8;
//Once u got the stream may be from group of values or  arrays or collections,
// we can use all the available  methods on that stream like filter(),map(),etc.
import java.util.stream.Stream;

public
class stream012 {
    public static
    void main (String[] args) {
        Stream<Integer> s=Stream.of (9,99,999,9999,99999);
        s.forEach (System.out::println);
        Integer[] i={10,20,30,40,50};
        Stream.of (i).forEach (System.out::println);
    }
}
