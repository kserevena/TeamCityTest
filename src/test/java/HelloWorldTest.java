import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

/**
 * Created by karlserevena on 17/04/2016.
 */
public class HelloWorldTest {
    @Test
    public void sayHello() throws Exception {

        final HelloWorld helloWorld = new HelloWorld();
        assertThat(helloWorld.sayHello(), is("hello"));
    }

    @Test
    public void failingTest() throws Exception {
        fail();

    }
}