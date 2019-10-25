import static junit.framework.TestCase.assertTrue;
public class Dec2HexTest {
    @org.junit.Test
    public void test1(){
        String[] array = {};
        Dec2Hex.main(array);
        assertTrue(Dec2Hex.exited);
    }
    @org.junit.Test
    public void test2(){
        String[] array = {"24","27"};
        Dec2Hex.main(array);
        assertTrue(Dec2Hex.exited);
    }
    @org.junit.Test
    public void test3(){
        String[] array = {"Ryan's Test"};
        Dec2Hex.main(array);
        assertTrue(Dec2Hex.exited);
    }
    @org.junit.Test
    public void test4(){
        String[] array = {"-10"};
        Dec2Hex.main(array);
        assertTrue(Dec2Hex.exited);
    }
    @org.junit.Test
    public void test5(){
        String[] array = {"10000"};
        Dec2Hex.main(array);
    }
    @org.junit.Test
    public void test6(){
        String[] array = {"2147483647"};
        Dec2Hex.main(array);
    }
    @org.junit.Test
    public void test7(){
        String[] array = {"2147483648"};
        Dec2Hex.main(array);
        assertTrue(Dec2Hex.exited);
    }
}