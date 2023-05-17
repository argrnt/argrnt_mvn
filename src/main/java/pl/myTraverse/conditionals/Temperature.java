package pl.myTraverse.conditionals;

public class Temperature {


    public String measurement(double temp) {

        if (temp > 35 && temp <= 37) {
            return "temperature normal";
        }
        if (temp > 37 && temp < 38.5) {
            return "low-grade fever";
        }
        if (temp >= 38.5 && temp <= 40) {
            return "fever";
        }
        if (temp > 40 && temp < 41) {
            return "call an ambulance";
        }
        return "measurement error";
    }


}
