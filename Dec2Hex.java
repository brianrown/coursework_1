import org.junit.Test;

import static org.junit.Assert.*;

public class Dec2Hex {
    private static int Arg1;
    private static boolean exited;

    private void exit() {
        exited = true;
    }

    public void main(String[] args) {
        if (args.length != 1) {
            System.err.println("The incorrect number of arguments have been entered. This program needs 1 argument to run");
            exit();
        }
        else {
            try {
                Arg1 = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Argument " + args[0] + " must be an integer.");
                exit();
            }
            if (Arg1 < 0) {
                System.err.println("Integer was less than 0, this cannot be converted");
                exit();
            }else if(0 < Arg1 && Arg1 < 2147483647){
                char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                int rem, num;
                num = Arg1;
                StringBuilder hexadecimal = new StringBuilder();
                System.out.println("Converting the Decimal Value " + num + " to Hex...");

                while (num != 0) {
                    rem = num % 16;
                    hexadecimal.insert(0, ch[rem]);
                    num = num / 16;
                }
                System.out.println("Hexadecimal representation is : " + hexadecimal);
            }
        }
    }

    @Test
    public void test1(){
        String[] array = {};
        main(array);
        assertTrue(Dec2Hex.exited);
    }
    @Test
    public void test2(){
        String[] array = {"24","27"};
        main(array);
        assertTrue(Dec2Hex.exited);
    }
    @Test
    public void test3(){
        String[] array = {"Ryan's Test"};
        main(array);
        assertTrue(Dec2Hex.exited);
    }

    @Test
    public void test4(){
        String[] array = {"-10"};
        main(array);
        assertTrue(Dec2Hex.exited);
    }
    @Test
    public void test5(){
        String[] array = {"10000"};
        main(array);
    }
    @Test
    public void test6(){
        String[] array = {"2147483647"};
    }
    @Test
    public void test7(){
        String[] array = {"2147483648"};
        main(array);
        assertTrue(Dec2Hex.exited);
    }
}
