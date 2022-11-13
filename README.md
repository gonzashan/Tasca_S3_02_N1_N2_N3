# Tasca S3.02: Patterns 2

#### Nivell 1
## Observer

Dissenya un sistema en el qual un Agent de Borsa (Observable) notifica a diverses agències de Borsa (Observers) canvis quan la Borsa puja o baixa.

- És necessari que l'objecte Observable mantingui referències als Observers.

https://github.com/gonzashan/Tasca_S3_02_N1_N2_N3/tree/main/src/main/java/exercici1nivell1


#### Nivell 2
## Callback
Simula una passarel·la de pagament que rebi un objecte encapsulador del mètode de pagament a efectuar: targeta de crèdit, Paypal o deute en compte bancari.

- La passarel·la invocarà el pagament sense conèixer la forma i retornant el control a la classe d'origen.
- La classe que invoca la passarel·la de pagament serà una botiga de sabates.

https://github.com/gonzashan/Tasca_S3_02_N1_N2_N3/tree/main/src/main/java/exercici1nivell2


#### Nivell 3
## Dependency Injection

Dissenya una classe que mostri en pantalla el preu de diversos articles. Ja que haurà de mostrar-los també en diversos tipus de moneda.

# Important

Assegura't d'afegir-li com a Injecció de Dependència una classe Convertidor de Moneda que efectuï la correcció del preu en funció del canvi de divisa.

https://github.com/gonzashan/Tasca_S3_02_N1_N2_N3/tree/main/src/main/java/exercici1nivell3
