import java.util.*;


public class WeatherData extends Observable{
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
	observers = new ArrayList();
    }

    public void measurementsChanged() {
	setChanged();
	notifyObservers();
    }

    public void setMeasurement(float temperature, float humidity, float pressure){
	this.temperature = temperature;
	this.humidity = humidity;
	this.pressure = pressure;

	measurementsChanged();
    }

    public float getTemperature() { return temperature;}
    public float getHumidity() { return humidity;}
    public float getPressure() { return humidity;}
}
