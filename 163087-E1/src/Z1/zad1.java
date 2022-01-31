package Z1;

import java.time.LocalTime;
import java.lang.Comparable;

public class zad1 {
    public static void main(String[] args) {
       Integer[] intListSorted = new Integer[]{1,2,1};
       Integer[] intList = new Integer[]{1,2,3};
       LocalTime[] timeListSorted = new LocalTime[]{
           LocalTime.of(10,30),
           LocalTime.of(11,30),
           LocalTime.of(10,30)
       };
       LocalTime[] timeList = new LocalTime[]{
           LocalTime.of(10,30),
           LocalTime.of(11,30),
           LocalTime.of(12,30)
       };

        System.out.println(ArrayUtil.jestPalindromem(intListSorted));
        System.out.println(ArrayUtil.jestPalindromem(intList));
        System.out.println(ArrayUtil.jestPalindromem(timeListSorted));
        System.out.println(ArrayUtil.jestPalindromem(timeList));
    }

    static class ArrayUtil {
        public static <T extends Comparable<T>>boolean jestPalindromem(T[]array) {
            Integer leng = array.length-1;
            for (int i=0; i< array.length-1; i++) {
                if (i == leng) {
                    return true;
                }
                if (array[i] != array[leng]) {
                    return false;
                }
                leng--;
            }
            return true;
        }
    }
}
