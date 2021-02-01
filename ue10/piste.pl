%Blaue Pisten
blau(vorkogel).
blau(sonnalm).
blau(arbiskoge).
blau(plattenalm).
blau(wiesenalm).
%Rote Pisten
rot(isskogel).
%Schwarze Pisten
schwarz(teufeltal).

%Start Pisten
start(sonnalm).
start(teufeltal).

%Pisten Ende
endetIn(vorkogel, isskogel).
endetIn(sonnalm, vorkogel).
endetIn(sonnalm, arbiskoge).
endetIn(arbiskoge, plattenalm).
endetIn(teufeltal, wiesenalm).
endetIn(plattenalm, wiesenalm).
endetIn(wiesenalm, tal).
endetIn(isskogel, tal).

%b) endetIn(X,wiesenalm).

%Kontrolliert ob Pisten am gleichen Punkt starten
gleicherStartpunkt(X,Y):- start(X), start(Y).
gleicherStartpunkt(X,Y):- endetIn(Z,X), endetIn(Z,Y).

erreichbar(X,Y) :- endetIn(X,Y).
erreichbar(X,Y) :- endetIn(X,Z), erreichbar(Z,Y).

moeglicheSchlusspiste(X,S):- erreichbar(X,S), endetIn(S,tal).

