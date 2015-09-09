package arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by SMufazzalov on 07.09.2015.
 */
public class TestArrays {

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void createZeroLengthArray(){
        int a[] = new int[0];
        a[0] = 10;
    }

}
