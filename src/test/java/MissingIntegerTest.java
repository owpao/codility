import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MissingIntegerTest {
    @Test
    public void test(){
        MissingInteger mi = new MissingInteger();
       Assert.assertThat(mi.solution(new int[]{1,3,6,4,1,2}),is(5));
    }

    @Test
    public void test2(){
        MissingInteger mi = new MissingInteger();
        Assert.assertThat(mi.solution(new int[]{1,2,3}),is(4));
    }

    @Test
    public void test3(){
        MissingInteger mi = new MissingInteger();
        Assert.assertThat(mi.solution(new int[]{-1,-3}),is(1));
    }

    @Test
    public void test4(){
        MissingInteger mi = new MissingInteger();
        Assert.assertThat(mi.solution(new int[]{-1,-3,1}),is(2));
    }

    @Test
    public void test5(){
        MissingInteger mi = new MissingInteger();
        Assert.assertThat(mi.solution(new int[]{-1,-3,2}),is(1));
    }

    @Test
    public void test6AntiSum(){
        MissingInteger mi = new MissingInteger();
        Assert.assertThat(mi.solution(new int[]{-1,-3,2,2}),is(1));
    }

    @Test
    public void test7AntiSum2(){
        MissingInteger mi = new MissingInteger();
        Assert.assertThat(mi.solution(new int[]{-1,-3,1,1}),is(2));
    }

    @Test
    public void test2MissingValues(){
        MissingInteger mi = new MissingInteger();
        Assert.assertThat(mi.solution(new int[]{-1,-3,1,4}),is(2));
    }
}