package com.weather;

import com.eclipsesource.json.JsonObject;
import com.github.dvdme.ForecastIOLib.ForecastIO;

import java.util.Date;

/**
 * @author      Michał Wnęk
 * @version     1.0
 */
public class PrepareValuesOfWeather {


    /**
     * Get weather as webservice
     *
     * @return JsonObject - weather
     */
    public JsonObject getWeather() {
        ForecastIO fio = new ForecastIO("afa3723b72070e1425fe75005493ec93");
        fio.setUnits(ForecastIO.UNITS_SI);
        fio.setExcludeURL("minutely");
        String firstCord = "52.229676";
        String secondCord = "21.012228999999934";
        fio.getForecast(firstCord, secondCord);
        System.out.println(fio.getCurrently());
        JsonObject generatedWeather = fio.getCurrently();
        return generatedWeather;
    }

    /**
     * Fill entity weather
     *
     * @param generatedWeather - returned value from getWeather()
     * @param weatherEntity - hibernate's entity
     * @return filled weather entity
     */
    public WeatherEntity fillFieldsForDB(JsonObject generatedWeather, WeatherEntity weatherEntity) {
        Date data = new Date();
        String currentData = data.toString();
        String summary = generatedWeather.get("summary").toString();
        String precipIntensity = generatedWeather.get("precipIntensity").toString();
        String precipProbability = generatedWeather.get("precipProbability").toString();
        String temperature = generatedWeather.get("temperature").toString();
        String dewPoint = generatedWeather.get("dewPoint").toString();
        String humidity = generatedWeather.get("humidity").toString();
        String windSpeed = generatedWeather.get("windSpeed").toString();
        String windBearing = generatedWeather.get("windBearing").toString();
        String visibility = generatedWeather.get("visibility").toString();
        String pressure = generatedWeather.get("pressure").toString();
        String ozone = generatedWeather.get("ozone").toString();
        String cloudCover = generatedWeather.get("cloudCover").toString();

        weatherEntity.setLogin("SzymonWolak");
        weatherEntity.setDate(currentData);
        weatherEntity.setCord1("52.229676");
        weatherEntity.setCord2("21.012228999999934");
        weatherEntity.setSummary(summary);
        weatherEntity.setPrecipIntensity(precipIntensity);
        weatherEntity.setPrecipProbability(precipProbability);
        weatherEntity.setTemperature(temperature);
        weatherEntity.setDewPoint(dewPoint);
        weatherEntity.setHumidity(humidity);
        weatherEntity.setWindSpeed(windSpeed);
        weatherEntity.setWindBearing(windBearing);
        weatherEntity.setVisibility(visibility);
        weatherEntity.setPressure(pressure);
        weatherEntity.setCloudCover(cloudCover);
        weatherEntity.setOzone(ozone);
        return weatherEntity;
    }
}
