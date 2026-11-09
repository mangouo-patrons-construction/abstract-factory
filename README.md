# Patron Abstract Factory

Auteur : Mangouo Jacky Victoire — INF461 / INF4067, Devoir 1 : Patrons de construction

- `src/abstractfactory/exemple1` : exemple du cours (familles 1 et 2)
- `src/abstractfactory/exemple2` : exemple du cours (Scooter / Automobile, Essence et Electrique)
- `src/abstractfactory/exemple2modifie` : exemple modifie (ajout de la famille Hybride)

## Compilation et execution
```
mkdir out
javac -d out $(find src -name "*.java")
java -cp out abstractfactory.exemple1.Client
java -cp out abstractfactory.exemple2.Client
java -cp out abstractfactory.exemple2modifie.Client
```

## Diagrammes
Diagrammes de classes realises avec Dia (sources `.dia` et `.png` dans `diagrammes/`).
