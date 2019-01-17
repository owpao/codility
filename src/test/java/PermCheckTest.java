import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PermCheckTest {
    @Test
    public void test(){
        PermCheck pc = new PermCheck();
        Assert.assertEquals(1,pc.solution(new int[] {4,1,3,2}));
    }

    @Test
    public void test2(){
        PermCheck pc = new PermCheck();
        Assert.assertEquals(0,pc.solution(new int[] {4,1,2}));
    }

    @Test
    public void test3(){
        PermCheck pc = new PermCheck();
        Assert.assertEquals(0,pc.solution(new int[] {4,1,4}));
    }

    @Test
    public void test4(){
        PermCheck pc = new PermCheck();
        Assert.assertEquals(0,pc.solution(new int[] {}));
    }
}