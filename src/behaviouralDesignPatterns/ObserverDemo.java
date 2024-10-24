package behaviouralDesignPatterns;

import java.util.ArrayList;
import java.util.List;

interface Observer{
    void update(float temp , float humidity);
}

/*
it tells observers about update
 */
class WeatherStation{
    private List<Observer> observerList = new ArrayList<>();
    private float temp;
    private float humidity;

    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }

    public void setMeasurement(float temp , float humidity){
        this.temp = temp;
        this.humidity = humidity;
        notifyObservers();
    }
    private void notifyObservers(){
        for(Observer observer : observerList){
            observer.update(temp , humidity);
        }
    }
}

class CurrentConditionDisplay implements Observer{
    @Override
    public void update(float temp, float humidity) {
        System.out.println("Current Condition: " + temp + "F degrees and "
        + humidity + "% humidity");
    }
}


// client code
public class ObserverDemo {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay();
        CurrentConditionDisplay currentDisplay1 = new CurrentConditionDisplay();

        weatherStation.addObserver(currentDisplay);
        weatherStation.addObserver(currentDisplay1);
        weatherStation.setMeasurement(80 , 65);

    }
}
