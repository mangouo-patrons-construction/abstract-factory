package abstractfactory.exemple2;

public class FactoryElectrique implements AbstractFactory {
    @Override
    public Automobile construireAutomobile() {
        return new AutomobileElectrique();
    }

    @Override
    public Scooter construireScooter() {
        return new ScooterElectrique();
    }
}
