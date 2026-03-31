public class WeatherService {

    public static String getWeather(String city) {


        if (city.equals("pune")) {
            return "Hot.....Sunny weather";
        }
        if (city.equals("Delhi")) {
            return "windy,hot..";
        } else {
            return "Unknown";
        }

    }

    public static void main(String[] args) {
        String city= "pune";
        getWeather(city);
    }
}
