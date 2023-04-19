# Bonusaufgaben - Abstrakte Klassen und Exceptions
## Level 3

Erstellen Sie eine abstrakte Klasse `BankAccount`, die eine Methode `withdraw(double amount)` definiert. Erstellen Sie dann konkrete Klassen `SavingsAccount` und `CheckingAccount`, die `BankAccount` erweitern und die `withdraw()` Methode implementieren.

Schreiben Sie ein Java-Programm, das ein Array von BankAccount-Objekten erstellt und die `withdraw()` Methode für jedes Objekt aufruft. Wenn das Konto überzogen wird, soll eine Exception `OverdraftException` geworfen werden.