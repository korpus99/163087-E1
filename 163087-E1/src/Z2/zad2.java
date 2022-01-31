package Z2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;


public class zad2 {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("Pierwszy");
        strList.add("Drugi");
        strList.add("Trzeci");
        strList.add("Czwarty");
        strList.add("Piąty");

        HashSet<String> hashs = new HashSet<String>(strList);
        TreeSet<String> trees = new TreeSet<String>(strList);

        wypiszCoDrugi(strList);
        System.out.println(" ");
        wypiszCoDrugi(hashs);
        System.out.println(" ");
        wypiszCoDrugi(trees);
    }

    public static <T extends Iterable> void wypiszCoDrugi(T t) {
        t.forEach(x -> System.out.println(x + ", "));
    }
}
