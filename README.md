# BankManager

BankManager est un petit projet Java qui illustre l'heritage avec des types de comptes bancaires.

Le projet ne fournit pas une application bancaire complete: il n'y a pas de menu, pas de saisie utilisateur, pas de base de donnees et pas de gestion de transactions. Le programme cree simplement plusieurs objets, modifie leurs attributs et affiche leurs valeurs dans la console.

## Ce que le projet contient

- `BankAccount`: classe parent avec un numero de compte (`account`) et un solde (`balance`).
- `CheckingAccount`: compte courant qui herite de `BankAccount` et ajoute une limite (`limit`).
- `SavingsAccount`: compte d'epargne qui herite de `BankAccount` sans attribut supplementaire.
- `COD`: compte de type Certificate Of Deposit qui herite de `BankAccount` sans attribut supplementaire.
- `Main`: point d'entree du programme. Il cree un compte de chaque type, renseigne les valeurs avec les setters, puis les affiche avec les getters.

## Structure du projet

```text
BankManager/
├── README.md
└── src/
    └── main/
        └── java/
            └── com/
                └── bankmanager/
                    ├── BankAccount.java
                    ├── CheckingAccount.java
                    ├── COD.java
                    ├── Main.java
                    └── SavingsAccount.java
```

## Prerequis

- Java JDK installe
- Un terminal capable d'executer `javac` et `java`

## Lancer le projet

Depuis la racine du projet:

```bash
javac -d out src/main/java/com/bankmanager/*.java
java -cp out com.bankmanager.Main
```

## Sortie attendue

```text
CheckingAccount: account=CHECKING-100, balance=1200.5, limit=300.0
SavingsAccount: account=SAVINGS-200, balance=3500.0
COD: account=COD-300, balance=10000.0
```

## Notions montrees

- Creation d'une classe parent et de classes enfants.
- Utilisation de l'heritage avec `extends`.
- Encapsulation des attributs avec des getters et setters.
- Instanciation d'objets dans une methode `main`.
- Affichage de l'etat des objets dans la console.
