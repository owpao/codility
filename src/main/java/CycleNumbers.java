public class CycleNumbers {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        if(A!=null &&A.length>0){
            int last = 0;
            for (int i=0; i<K;i++){
                last = A[A.length-1];
                for(int j = A.length-1;j>0;j--){
                    A[j]=A[j-1];
                }
                A[0]=last;
            }
            return A;
        }
        return A;
    }
}
