import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrogRiverOneTest {
    @Test
    public void test(){
        FrogRiverOne fro = new FrogRiverOne();
        Assert.assertEquals(6,fro.solution(5,new int[]{1,3,1,4,2,3,5,4}));
    }

    @Test
    public void test2(){
        FrogRiverOne fro = new FrogRiverOne();
        Assert.assertEquals(-1,fro.solution(3,new int[]{1,3,1,4,3,5,4}));
    }
}