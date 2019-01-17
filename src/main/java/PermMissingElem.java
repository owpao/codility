import java.util.Arrays;

public class PermMissingElem {
    public int solution(int[] A) {
        int numToReturn = 1;
        if(A!=null&&A.length>0) {
            Arrays.sort(A);
            for (int i = 0; i < A.length; i++) {
                if (i + 1 != A[i]) {
                    numToReturn = i + 1;
                    break;
                }
                if(i+1==A.length){
                    numToReturn=A.length+1;
                }
            }
        }
        return numToReturn;
    }

    public int solution2(int[] A) {
        int numToReturn = 0;
        int sum=0;
        for (int i = 1; i <= A.length+1; ++i) {
            sum +=i;
        }
        numToReturn = sum-Arrays.stream(A).sum();
        return numToReturn;
    }
}
