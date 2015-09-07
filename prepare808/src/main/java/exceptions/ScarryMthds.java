package exceptions;

/**
 * Created by SMufazzalov on 07.09.2015.
 */
public class ScarryMthds {
    public void hello() throws MsgException {
        throw new MsgException("ooops i pass no trace");
    }

    public void fireException() throws MsgException {
        hello();
    }
}
