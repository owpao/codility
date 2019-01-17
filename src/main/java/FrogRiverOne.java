import java.util.Collection;
import java.util.HashSet;

public class FrogRiverOne {

    public int solution(int X, int[] A) {
        Collection<Integer> numList = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if(A[i]<=X){
                numList.add(A[i]);
            }
            if(numList.size()==X) return i;
        }
        return -1;
    }
}
