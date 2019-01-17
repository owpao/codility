import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CycleNumbersTest {
    @Test
    public void test(){
        CycleNumbers cn = new CycleNumbers();
        Assert.assertEquals(new int[]{7,6,3,8,9}, cn.solution(new int[]{3,8,9,7,6},3));
    }
}