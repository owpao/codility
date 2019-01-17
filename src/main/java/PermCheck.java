import java.util.Arrays;

public class PermCheck {
    public int solution(int[] A) {
        int isPermutation = 0;
        Arrays.sort(A);
        if(A!=null&&A.length>0) {
            for (int i = 1; i <= A.length; i++) {
                if(A[i-1]!=i){
                    isPermutation = 0;
                    break;
                }
                isPermutation = 1;
            }
        }
        return isPermutation;
    }
}
