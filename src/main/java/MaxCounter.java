import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class MaxCounter {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        Arrays.fill(counters,0);
        int maxValue = 0;

        for (int num : A) {
            if(num > N){
                Arrays.fill(counters,maxValue);
            }
            else {
                counters[num - 1] += 1;
                if(counters[num-1]>maxValue){
                    maxValue=counters[num-1];
                }
            }
        }
        return counters;
    }
}
