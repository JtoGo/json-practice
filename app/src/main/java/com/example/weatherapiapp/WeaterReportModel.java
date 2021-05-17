package com.example.weatherapiapp;

public class WeaterReportModel {
        private int id;
        private String weather_state_name;
        private String getWeather_state_abbr;
        private String wind_direction_compass;
        private String created;
        private String applicable_date;
        private float min_temp;
        private float max_tmp;
        private float the_temp;
        private float wind_speed;
        private float wind_direction;
        private int air_pressure;
        private int humidity;
        private int visibility;
        private int predictability;

    public WeaterReportModel(int id, String weather_state_name, String getWeather_state_abbr, String wind_direction_compass, String created, String applicable_date, float min_temp, float max_tmp, float the_temp, float wind_speed, float wind_direction, int air_pressure, int humidity, int visibility, int predictability) {
        this.id = id;
        this.weather_state_name = weather_state_name;
        this.getWeather_state_abbr = getWeather_state_abbr;
        this.wind_direction_compass = wind_direction_compass;
        this.created = created;
        this.applicable_date = applicable_date;
        this.min_temp = min_temp;
        this.max_tmp = max_tmp;
        this.the_temp = the_temp;
        this.wind_speed = wind_speed;
        this.wind_direction = wind_direction;
        this.air_pressure = air_pressure;
        this.humidity = humidity;
        this.visibility = visibility;
        this.predictability = predictability;
    }

    @Override
    public String toString() {
        return "WeaterReportModel{" +
                "id=" + id +
                ", weather_state_name='" + weather_state_name + '\'' +
                ", getWeather_state_abbr='" + getWeather_state_abbr + '\'' +
                ", wind_direction_compass='" + wind_direction_compass + '\'' +
                ", created='" + created + '\'' +
                ", applicable_date='" + applicable_date + '\'' +
                ", min_temp=" + min_temp +
                ", max_tmp=" + max_tmp +
                ", the_temp=" + the_temp +
                ", wind_speed=" + wind_speed +
                ", wind_direction=" + wind_direction +
                ", air_pressure=" + air_pressure +
                ", humidity=" + humidity +
                ", visibility=" + visibility +
                ", predictability=" + predictability +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getWeather_state_name() {
        return weather_state_name;
    }

    public String getGetWeather_state_abbr() {
        return getWeather_state_abbr;
    }

    public String getWind_direction_compass() {
        return wind_direction_compass;
    }

    public String getCreated() {
        return created;
    }

    public String getApplicable_date() {
        return applicable_date;
    }

    public float getMin_temp() {
        return min_temp;
    }

    public float getMax_tmp() {
        return max_tmp;
    }

    public float getThe_temp() {
        return the_temp;
    }

    public float getWind_speed() {
        return wind_speed;
    }

    public float getWind_direction() {
        return wind_direction;
    }

    public int getAir_pressure() {
        return air_pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getVisibility() {
        return visibility;
    }

    public int getPredictability() {
        return predictability;
    }
}
