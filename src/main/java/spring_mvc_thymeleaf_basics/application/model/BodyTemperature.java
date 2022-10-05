package spring_mvc_thymeleaf_basics.application.model;

public class BodyTemperature {

    private double temperature;
    private String tempStatus;

    public BodyTemperature(double temperature, String tempStatus) {
        this.temperature = temperature;
        this.tempStatus = tempStatus;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getTempStatus() {
        return tempStatus;
    }

    public void setTempStatus(String tempStatus) {
        this.tempStatus = tempStatus;
    }

}
