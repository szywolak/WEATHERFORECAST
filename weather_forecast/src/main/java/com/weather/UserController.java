package com.weather;

import consoleLoggerSingleton.ConsoleLogger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.List;

/**
 * @author      Szymon Wolak
 * @version     1.0
 */

@Controller
public class UserController {

    static ConsoleLogger consoleLogger = ConsoleLogger.getInstance( );

    /**
     * Controller push values for given login
     *
     * @return view - user_page
     */
    @RequestMapping(value="/user_page/{userName}", method= RequestMethod.GET)
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model, @PathVariable String userName) throws IOException {
        GetDataFromDatabase GetDataFromDatabase = new GetDataFromDatabase();
        List<WeatherEntity> weatherEntities = GetDataFromDatabase.selectFrom(userName);
        model.addAttribute("weatherEntities", weatherEntities);
        consoleLogger.displayLogger("You called REST!");

        return "user_page";
    }
}