import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public class ArraysTest {
    @Test
    public void test(){
        Arrays arr = new Arrays();
        Assert.assertEquals(7,arr.solution2(new int[]{7,9,3,9,3,9,9}));
    }
}
