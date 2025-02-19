import org.junit.*;

public class NewTestClass{

    @Test(expected = FileNotFoundException.class)
    public void newTest(){

    }

    @Test(timeout = 500)
    public void newTest2(){

    }
}