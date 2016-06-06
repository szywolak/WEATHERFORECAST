package com.weather;

import consoleLoggerSingleton.ConsoleLogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author      Szymon Wolak
 * @version     1.0
 */
@SpringBootApplication
public class RunApplication {

    static ConsoleLogger consoleLogger = ConsoleLogger.getInstance( );

    public static void main(String[] args) {
        SpringApplication.run(RunApplication.class, args);
        consoleLogger.displayLogger("Application successfully started!");
    }
}