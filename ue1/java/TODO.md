# Zinsenzins Rechner

Was das Programm machen soll:

- Benutzer nach Startbetrag fragen (double)
- Benutzer nach Zinssatz fragen (double)
- Ziel oder Zeit als String annehmen

Ziel:

- Benutzer nach Zielbetrag fragen (double)
- Mithilfe geeigneter Schleife Zeit (in Jahren) berechnen die es braucht den Zielbetrag zu erreichen
- Ausgabe in Form von: "Es dauert 2 Jahre bei einem Zinssatz von 5%, um von 100 auf den Betrag 110 zu sparen. Nach dieser Reit hat man 110.25"
-"Es dauert [jahre] Jahre bei einem Zinssatz von [zinsen]%, um von [startbetrag] auf den Betrag [zielbetrag] zu sparen. Nach dieser Zeit hat man [finalbetrag]."

Zeit:

- Benutzer nach Anzahl von Jahren fragen (int)
- Mit geeigneter Schleife berechnen wie viel in dieser Zeit gespart wurde
- Ausgabe in Form von: "Bei einem Zinssatz von 5% und einem Startbetrag von 100 hat man nach 2 Jahren 110.25 gespart."
- "Bei einem Zinssatz von [zinsen]% und einem Startbetrag von [startbetrag] hat man nach [jahre] Jahren [finalbetrag] gespart."

Beispiellauf des Programmes:

```bash
Bitte geben Sie den Startbetrag ein.
100
Bitte geben Sie den Zinssatz als Prozentwert ein.
5
Bitte waehlen Sie aus:
Ziel: Berechnet die Zeit, bis ein gegebener Betrag angespart wurde.
Zeit: Berechnet den Betrag, der nach einer gegebenen Zeit angespart 
wurde. Ziel
Bitte geben Sie den Zielbetrag ein.
110
Es dauert 2 Jahre bei einem Zinssatz von 5%, um von 100 auf den Betrag 110 zu sparen. Nach dieser Zeit hat man 110.25.
```

Todo:

-[ ] Variablen deklarieren
  -[ ] startbetrag (double)
  -[ ] zinsen (double)
  -[ ] zielbetrag (double)
  -[ ] finalbetrag (double)
  -[ ] jahre (int)
  -[ ] wahl (String)
-[ ] 'UI' schreiben
  -[ ] Nach Startbetrag fragen
  -[ ] Nach Zinsen fragen
  -[ ] Ziel oder Zeit wählen
-[ ] Ziel-Funktion schreiben
  -[ ] while-loop mit zinsberechnung bis finalbetrag über zielbetrag
-[ ] Zeit-Funktion schreiben
  -[ ] for-loop mit jahren als end bedingung


