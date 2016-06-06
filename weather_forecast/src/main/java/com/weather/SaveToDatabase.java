package com.weather;

import consoleLoggerSingleton.ConsoleLogger;
import com.eclipsesource.json.JsonObject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;

/**
 * @author      Piotr Sochacki
 * @version     1.0
 */
public class SaveToDatabase {

    static ConsoleLogger consoleLogger = ConsoleLogger.getInstance( );


    public static void main(String[] args) throws IOException {
        runSaveToDatabase();
    }

    /**
     * Call this method is equal to save to database
     *
     */
    public static void runSaveToDatabase() {
        SessionFactory sessionFactory = new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
        PrepareValuesOfWeather weather = new PrepareValuesOfWeather();
        JsonObject getWeatger = weather.getWeather();
        Session session = sessionFactory.openSession();
        WeatherEntity weatherEntity = new WeatherEntity();
        weatherEntity = weather.fillFieldsForDB(getWeatger, weatherEntity);
        session.save(weatherEntity);
        consoleLogger.displayLogger("Successfully saved to database!");
        session.close();
    }
}
