import java.util.Arrays;

public class TapeEquilibrium {

    public int solution(int[] A) {
        int minDifference = Integer.MAX_VALUE;
        int sum = 0;
        int part1 = 0;

        for (int i = 0; i < A.length; i++) {
            sum = Arrays.stream(A).sum();
        }

        if (A != null && A.length >= 1) {
            for (int i = 1; i < A.length; i++) {
                part1 += A[i-1];
                int part2 = sum - part1;
                minDifference = Math.min (minDifference, Math.abs(part1-part2));
            }
        } else minDifference = 0;

        return minDifference;
    }
}
