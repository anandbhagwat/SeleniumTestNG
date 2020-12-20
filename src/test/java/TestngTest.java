import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
public class TestngTest {

    @Test(groups = {"testng", "allTests"})
    public void TestNgTest1(){
        assertThat("", "Anand", equalTo("Anand"));
    }

}
