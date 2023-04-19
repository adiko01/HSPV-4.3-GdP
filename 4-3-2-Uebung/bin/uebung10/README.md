# Übungsblatt 10
## Aufgabe 1
Erstellen Sie eine Klasse `Kuehlschrank`, die den Inhalt eines Kühlschranks verwalten soll,
also die Lebensmittel und deren vorrätige Quantität. Um dies zu erreichen, nutzen Sie
eine HashMap mit dem Key Lebensmittel (Datentyp String) und dem Value Quantität.

Schreiben Sie eine Methode, die das Befüllen des Kühlschranks ermöglicht. Nutzen Sie
dazu Eingaben/Ausgaben auf der Konsole. Vermeiden Sie doppelte Einträge (also, dass
der Nutzer mehrfach dasselbe Lebensmittel hinzufügt). Die Methode soll eine eigene
`KuehlschrankException` auslösen, wenn der Nutzer anstelle einer Menge eine falsche Eingabe macht.

Schreiben Sie anschließend eine Methode, die die Menge eines `Lebensmittels` ausgibt,
das der Nutzer über die Konsole eingeben kann.

Danach erstellen Sie noch eine Methode, die den gesamten Inhalt des Kühlschranks auflistet.

Erstellen Sie eine Testklasse, die die Klasse `Kuehlschrank` testet.