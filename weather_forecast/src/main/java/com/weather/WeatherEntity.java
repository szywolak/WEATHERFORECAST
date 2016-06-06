package com.weather;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author      Michał Wnęk
 * @version     1.0
 */

@Entity
@Table(name = "save_weather")
@Access(value=AccessType.FIELD)
public class WeatherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "date")
    private String date;

    @Column(name = "login")
    private String login;

    @Column(name = "cord1")
    private String cord1;

    @Column(name = "cord2")
    private String cord2;

    @Column(name = "summary")
    private String summary;

    @Column(name = "precipIntensity")
    private String precipIntensity;

    @Column(name = "precipProbability")
    private String precipProbability;

    @Column(name = "apparentTemperature")
    private String apparentTemperature;

    @Column(name = "dewPoint")
    private String dewPoint;

    @Column(name = "humidity")
    private String humidity;

    @Column(name = "windSpeed")
    private String windSpeed;

    @Column(name = "cloudCover")
    private String cloudCover;

    @Column(name = "pressure")
    private String pressure;

    @Column(name = "ozone")
    private String ozone;

    @Column(name = "temperature")
    private String temperature;

    @Column(name = "windBearing")
    private String windBearing;

    @Column(name = "visibility")
    private String visibility;



    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getVisibility() {

        return visibility;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWindBearing() {
        return windBearing;
    }

    public Integer getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getCord1() {
        return cord1;
    }

    public String getCord2() {
        return cord2;
    }

    public String getSummary() {
        return summary;
    }

    public String getPrecipIntensity() {
        return precipIntensity;
    }

    public String getPrecipProbability() {
        return precipProbability;
    }

    public String getApparentTemperature() {
        return apparentTemperature;
    }

    public String getDewPoint() {
        return dewPoint;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public String getCloudCover() {
        return cloudCover;
    }

    public String getPressure() {
        return pressure;
    }

    public String getOzone() {
        return ozone;
    }


    public void setCloudCover(String cloudCover) {
        this.cloudCover = cloudCover;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setCord1(String cord1) {
        this.cord1 = cord1;
    }

    public void setCord2(String cord2) {
        this.cord2 = cord2;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setPrecipIntensity(String precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public void setPrecipProbability(String precipProbability) {
        this.precipProbability = precipProbability;
    }

    public void setApparentTemperature(String apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    public void setDewPoint(String dewPoint) {
        this.dewPoint = dewPoint;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public void setWindBearing(String windBearing) {
        this.windBearing = windBearing;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setOzone(String ozone) {
        this.ozone = ozone;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}