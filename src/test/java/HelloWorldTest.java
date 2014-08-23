import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

   @Test
    public void testHelloWorld(){
       HelloWorld hw = new HelloWorld();
       Assert.assertNotNull(hw);
       Assert.assertEquals("Hello FriesToGo!", hw.sayHello("FriesToGo"));
   }


}
