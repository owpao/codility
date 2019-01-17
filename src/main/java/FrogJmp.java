public class FrogJmp {
    public int solution(int X, int Y, int D) {
        int numOfJumps = 0;
        if (X < Y) {
            Y=Y-X;
            numOfJumps = (Y%D>0)? Y/D+1:Y/D;
        }
        return numOfJumps;
    }
}
