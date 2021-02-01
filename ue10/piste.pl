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

treffpisten(X,Y,T):- erreichbar(X,T), erreichbar(Y,T), T\=(tal).

anfaengerGeeignet(X):- blau(X), endetIn(X, tal).
anfaengerGeeignet(X):- blau(X), endetIn(X, Y), anfaengerGeeignet(Y).

%Nr 9
userDefindList(nil).
userDefindList(cons(_, Restliste)):- userDefindList(Restliste).


pathOfLength(cons(_,nil), 0).
pathOfLength(cons(_,Y),s(Z)):- pathOfLength(Y,Z).

%add(X, 0, X).
%add(X, s(Y),s(Z)):- add(X,Y,Z).

%append((nil), YS, YS).
%append(cons(X, XS), YS, cons(X, ZS)):- append(XS,YS,ZS).

tourOfLength(cons(X,YS),L):- X==tal, pathOfLength(cons(X,YS),L), tourZiel(cons(X,YS)), tourZusammen(cons(X,YS)).

tourZiel(cons(_,YS)):- YS==tal.
tourZiel(cons(_,YS)):- tourZiel(YS).

tourZusammen(cons(X,cons(Y,YS))):- endetIn(X,Y), tourZusammen(cons(Y,YS)).
tourZusammen(cons(tal,nil)).
tourZusammen(cons(tal,cons(Y,YS))):- start(Y), tourZusammen(cons(Y,YS)).

partTour(P,P).
partTour(P,T):- partVorne(P,T).
partTour(P,T):- partHinten(P,T).

partVorne(P,T):-

partHinten(P,T):-
