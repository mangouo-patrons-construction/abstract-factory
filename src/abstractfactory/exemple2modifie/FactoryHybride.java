package abstractfactory.exemple2modifie;

public class FactoryHybride implements AbstractFactory {
    @Override
    public Automobile construireAutomobile() {
        return new AutomobileHybride();
    }

    @Override
    public Scooter construireScooter() {
        return new ScooterHybride();
    }
}
