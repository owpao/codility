public class NameInverter {
    public static void main(String[] args) {
        NameInverter ni = new NameInverter();
        ni.solution(9);
    }

    public int solution(int N) {
        String binaryStr = "";
        int gap = 0;
        int maxGap = 0;
        if(N>0){
            binaryStr = Integer.toBinaryString(N);
            System.out.println(binaryStr);
        }

        for (int i = 0; i<binaryStr.length(); i++){
            if(String.valueOf(binaryStr.charAt(i)).equals("1") && i+1<=binaryStr.length()) { //reset to zero
                if(gap>maxGap)
                    maxGap = gap;
                gap = 0;
            }
            else if(String.valueOf(binaryStr.charAt(i)).equals("0")) {
                gap++;
            }
        }
        System.out.println("gap : "+maxGap);
        return maxGap;
    }
}
