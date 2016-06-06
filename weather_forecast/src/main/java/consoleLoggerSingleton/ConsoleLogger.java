package consoleLoggerSingleton;

import java.util.Date;

/**
 * @author      Piotr Sochacki
 * @version     1.0
 */
public class ConsoleLogger {

    private static ConsoleLogger singleton = new ConsoleLogger( );

    private ConsoleLogger(){ }

    public static ConsoleLogger getInstance( ) {
        return singleton;
    }

    /**
     * Logger as Singleton
     * @return given String
     */

    public static void displayLogger(String logInfo) {
        Date date = new Date();
        System.out.println(date + "   INFO: "+logInfo);
    }
}