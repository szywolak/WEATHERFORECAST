package com.weather;

import com.eclipsesource.json.JsonObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import consoleLoggerSingleton.ConsoleLogger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author      Damian Matuła
 * @version     1.0
 */
public class GetDataFromDatabase {

    static ConsoleLogger consoleLogger = ConsoleLogger.getInstance( );

    /**
     * Short one line description.
     *
     * @param  login select from database with given login
     * @return All records for given user
     */
    public List selectFrom(String login) throws IOException {

        SessionFactory sessionFactory = new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        WeatherEntity weatherEntity = new WeatherEntity();
        Transaction tx = session.beginTransaction();
        String queryString = String.format("from com.weather.WeatherEntity where login LIKE '%s'", login);
        Query query = session.createQuery(queryString);
        List<WeatherEntity> weatherEntities = query.list();
        ObjectMapper mapper = new ObjectMapper();
        String path = String.format("user_reports/%s.json", login);
        mapper.writeValue(new File(path), weatherEntities);
        String jsonInString = mapper.writeValueAsString(weatherEntities);
        consoleLogger.displayLogger("You get the data successfully");

        return weatherEntities;
    }
}