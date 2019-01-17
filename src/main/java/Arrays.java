import java.util.ArrayList;
import java.util.HashSet;

public class Arrays {

    public int solution(int[] A) {
        // write your code in Java SE 8
        //
        int elem = 0;
        for (int i = 0; i < A.length; i++) {
            elem = elem ^ A[i]; // xor

        }
        return elem;
    }

    public static int solution2(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> dups = new HashSet<Integer>();
        int elem = -1;

        for (int i = 0; i < A.length; i++) {
            if (dups.add(A[i])) {
                elem = A[i];
            }
        }
        return elem;
    }
}
