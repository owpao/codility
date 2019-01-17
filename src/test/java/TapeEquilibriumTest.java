import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TapeEquilibriumTest {
    @Test
    public void test(){
        TapeEquilibrium te = new TapeEquilibrium();
        Assert.assertEquals(1,te.solution(new int[]{3,1,2,4,3}));
    }

    @Test
    public void test_1(){
        TapeEquilibrium te = new TapeEquilibrium();
        Assert.assertEquals(3,te.solution(new int[]{3,1,2,4,5}));
    }

    @Test
    public void test2(){
        TapeEquilibrium te = new TapeEquilibrium();
        Assert.assertEquals(0,te.solution(new int[]{3,3,3,3}));
    }

    @Test
    public void test3(){
        TapeEquilibrium te = new TapeEquilibrium();
        Assert.assertEquals(0,te.solution(new int[]{}));
    }
}