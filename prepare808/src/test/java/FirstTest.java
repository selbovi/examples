import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by SMufazzalov on 07.09.2015.
 */
public class FirstTest {
    static String OK = "OK";

    @Test
    public void first() throws Exception {
        assert ("OK".equals(OK));
    }
}
