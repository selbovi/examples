package exceptions;

import org.testng.annotations.Test;

/**
 * Created by SMufazzalov on 07.09.2015.
 */
public class TestExceptions {

    @Test
    public void assureStackTraceNotLost() {
        ScarryMthds scarryMthds = new ScarryMthds();
        try {
            scarryMthds.fireException();
        } catch (MsgException e) {
            e.printStackTrace();
            assert (e.getStackTrace() != null);
        }
    }
}
