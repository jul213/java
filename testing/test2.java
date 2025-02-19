import org.junit.*;

public class NewTestClass{

    @Test(expected = FileNotFoundException.class)
    public void newTest(){

    }

    @Test(timeout = 500)
    public void newTest2(){

    }

    @Test(expected = IOException.class, timeout = 800)
    public void newTest3(){

    }
}