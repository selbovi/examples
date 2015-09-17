package inheritance;

import org.testng.annotations.Test;

/**
 * Created by SMufazzalov on 17.09.2015.
 */
public class TestInheritance {

    @Test
    public void hidingAndOverriding(){

        Beta b = new Baap();
        assert(b.h == 4);
        assert(((Baap)b).h == 44);
        assert (b.get() == 44);
    }
}
