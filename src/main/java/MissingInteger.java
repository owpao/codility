import java.util.Arrays;
import java.util.HashSet;

public class MissingInteger {
    public int solution(int[] A) {
        //if array does not contain any positive integer, return 1
        int[] positiveIntegers = Arrays.stream(A).filter(num -> num > 0).toArray();
        Arrays.sort(positiveIntegers);
        if (positiveIntegers.length == 0) {
            return 1;
        }
        //if array contains the range of integers without missing value in between, return maxValue+1
        int maxValue = Arrays.stream(positiveIntegers).max().getAsInt();
        HashSet<Integer> filteredNumbers = new HashSet<>();
        for (int positiveInteger : positiveIntegers) {
            filteredNumbers.add(positiveInteger);
            if (filteredNumbers.size() == maxValue) {
                return maxValue + 1;
            }
        }
        //if array contains positive integers that has a missing number in between
        for (int j = 1; j <= maxValue; j++) {
            if (filteredNumbers.add(j)) {
                return j;
            }
        }
        return 0;
    }
}
