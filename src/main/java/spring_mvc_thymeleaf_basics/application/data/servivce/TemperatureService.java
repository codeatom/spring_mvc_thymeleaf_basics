package spring_mvc_thymeleaf_basics.application.data.servivce;

import spring_mvc_thymeleaf_basics.application.model.BodyTemperature;

public class TemperatureService {

    public static BodyTemperature TemperatureStatus(String temp) {

        if(!isDouble(temp)){
            return null;
        }

        if (Double.parseDouble(temp) < 36.5)
        {
            return new BodyTemperature(Double.parseDouble(temp),
                    "Your temperature is below normal levels! Consider seeing a doctor");
        }
        else if (Double.parseDouble(temp) >= 37.5)
        {
            return new BodyTemperature(Double.parseDouble(temp),
                    "Your temperature is above normal levels! Consider seeing a doctor");
        }
        else
        {
            return new BodyTemperature(Double.parseDouble(temp), "Your temperature is normal");
        }
    }

    public static boolean isDouble(String temp){
        try
        {
            Double.parseDouble(temp);
            return true;
        }
        catch(NumberFormatException e)
        {
            return false;
        }
    }

}
