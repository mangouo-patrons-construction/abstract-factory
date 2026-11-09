package abstractfactory.exemple2;

public class Client {
    // La categorie n'est connue qu'a l'execution
    static AbstractFactory choisirFabrique(String categorie) {
        switch (categorie) {
            case "Essence":
                return new FactoryEssence();
            case "Electrique":
                return new FactoryElectrique();
            default:
                throw new IllegalArgumentException("Categorie inconnue : " + categorie);
        }
    }

    public static void main(String[] args) {
        String[] categories = { "Essence", "Electrique" };
        for (String categorie : categories) {
            System.out.println("--- Categorie : " + categorie + " ---");
            AbstractFactory fabrique = choisirFabrique(categorie);
            Scooter scooter = fabrique.construireScooter();
            Automobile automobile = fabrique.construireAutomobile();
            scooter.methodeScooter();
            automobile.methodeAutomobile();
        }
    }
}
