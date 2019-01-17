import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrogJmpTest {
    @Test
    public void Test(){
        FrogJmp fj = new FrogJmp();
        Assert.assertEquals(3,fj.solution(10,85,30));
    }
    @Test
    public void Test2(){
        FrogJmp fj = new FrogJmp();
        Assert.assertEquals(2,fj.solution(1,5,2));
    }

}