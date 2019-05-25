public class WeatherStation{
    public static void main(String[] args){
	WeatherData weatherData = new WeatherData();

	CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
	ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
	HeatIndexDisplay headIndexDisplay = new HeatIndexDisplay(weatherData);

	weatherData.setMeasurement(80, 65, 3.4f);
	weatherData.setMeasurement(82, 70, 29.4f);
	weatherData.setMeasurement(78, 90, 29.2f);
    }
}
