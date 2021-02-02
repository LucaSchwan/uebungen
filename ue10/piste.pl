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

tourZiel(cons(tal, nil)).
tourZiel(cons(_,YS)):- tourZiel(YS).

tourZusammen(cons(X,cons(Y,YS))):- endetIn(X,Y), tourZusammen(cons(Y,YS)).
tourZusammen(cons(tal,nil)).
tourZusammen(cons(tal,cons(Y,YS))):- start(Y), tourZusammen(cons(Y,YS)).

partTour(P,P):- tour(P,P).
partTour(cons(tal, XS), cons(tal,YS)):- tourGleich(XS,YS).
partTour(cons(X, XS), cons(_,YS)):- partTour(cons(X,XS), YS).

tour(cons(Y,YS),cons(X,XS)):- Y==tal,X==tal, tourZiel(cons(Y,YS)),tourZiel(cons(X,XS)),tourZusammen(cons(Y,YS)),tourZusammen(cons(X,XS)).

tourGleich(cons(tal,nil), cons(tal, _)).
tourGleich(cons(X,XS),cons(X,YS)):- tourGleich(XS,YS).

convert(cons(X,nil),[Y]):- X==Y.
convert(cons(X,XS),[Y,YS]):- X==Y, convert(XS,[YS]).