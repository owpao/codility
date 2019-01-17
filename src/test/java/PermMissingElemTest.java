import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PermMissingElemTest {
    @Test
    public void test(){
        PermMissingElem pme = new PermMissingElem();
        Assert.assertEquals(4, pme.solution(new int[]{2,3,1,5}));
    }

    @Test
    public void test2(){
        PermMissingElem pme = new PermMissingElem();
        Assert.assertEquals(1, pme.solution(new int[]{}));
    }

    @Test
    public void test3(){
        PermMissingElem pme = new PermMissingElem();
        Assert.assertEquals(4, pme.solution(new int[]{1,2,3}));
    }
    @Test
    public void test4(){
        PermMissingElem pme = new PermMissingElem();
        Assert.assertEquals(1, pme.solution(new int[]{2,3,4}));
    }
}