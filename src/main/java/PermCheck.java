import java.util.Arrays;

public class PermCheck {
    public int solution(int[] A) {
        int isPermutation = 0;
        int sum = 0;
        if(A!=null&&A.length>0) {
            for (int i = 1; i <= A.length; i++) {
                sum += i;
            }
            if (Arrays.stream(A).sum() == sum) {
                isPermutation = 1;
            }
        }
        return isPermutation;
    }
}
