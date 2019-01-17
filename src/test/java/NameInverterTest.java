import org.junit.Test;

import static org.junit.Assert.*;

public class NameInverterTest {
    @Test
    public int solution(int N) {
        String binaryStr = "";
        int gap = 0;
        if(N>0){
            binaryStr = Integer.toBinaryString(N);
        }
        for (char bit : binaryStr.toCharArray()){
            if("1".equals(bit)) //reset to zero
                gap = 0;
            else
                gap++;
        }
        System.out.println("gap : "+gap);
        return gap;
    }
}