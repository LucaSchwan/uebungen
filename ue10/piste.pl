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