import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MaxCounterTest {
    @Test
    public void test(){
        MaxCounter mc = new MaxCounter();
        Assert.assertThat(mc.solution(5,new int[]{3,4,4,6,1,4,4}), is(new int[]{3,2,2,4,2}));
    }

}