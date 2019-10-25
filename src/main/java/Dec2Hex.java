import java.util.logging.LogRecord;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

public class Dec2Hex {
    private static int arg1;
    static boolean exited;
    private static Logger logger = Logger.getLogger(String.valueOf(Dec2Hex.class));

    private static void exit() {
        exited = true;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            logger.log(new LogRecord(INFO,"The incorrect number of arguments have been entered. This program needs 1 argument to run"));
            exit();
        }
        else {
            try {
                arg1 = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                logger.log(new LogRecord(INFO,"Argument " + args[0] + " must be an integer."));
                exit();
            }
            if (arg1 < 0) {
                logger.log(new LogRecord(INFO,"Integer was less than 0, this cannot be converted"));
                exit();
            }else if(0 < arg1 && arg1 < 2147483647){
                char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                int rem;
                int num;
                num = arg1;
                StringBuilder hexadecimal = new StringBuilder();
                logger.log(new LogRecord(INFO,"Converting the Decimal Value " + num + " to Hex..."));
                while (num != 0) {
                    rem = num % 16;
                    hexadecimal.insert(0, ch[rem]);
                    num = num / 16;
                }
                logger.log(new LogRecord(INFO,"Hexadecimal representation is : " + hexadecimal));
            }
        }
    }

}
