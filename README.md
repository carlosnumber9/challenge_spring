# Challenge: Servicio de clasificación de juego de cartas

Este proyecto contiene un esqueleto básico para un API que gestiona una
colección de cartas de un hipotético juego de rol.
Las cartas tienen una serie de atributos, los cuales tienen a su vez una
puntuación. El objetivo de este servicio es calcular la puntuación total de cada
carta y permitir visualizar las cartas filtrando por dicha puntuación.

### Definición de requisitos
Necesitamos 3 endpoints:
* El primer endpoint debe realizar el cálculo de la puntuación de cada carta en
  base a las reglas descritas a continuación. Cada carta tiene una serie de
  propiedades, cuyos valores aportarán una puntuación en base a la relevancia
  del mismo.
    * Rareza:
        * Común: 2 puntos
        * Rara: 4 puntos
        * Muy rara: 6 puntos
        * Edición limitada: 9 puntos
    * Categoría:
        * Maná: 1 punto
        * Monstruo: 2 puntos
        * Mejora: 3 puntos
        * Maldición: 4 puntos
    * Coste de maná:
        * Entre 1 y 2: 4 puntos
        * Entre 3 y 4: 3 puntos
        * Entre 5 y 6: 2 puntos
    * Poder de ataque:
        * Entre 1 y 4: 1 punto
        * Entre 5 y 8: 3 puntos
        * Mas de 9: 6 puntos
* En segundo endpoint me devolverá un mazo con las 5 mejores cartas. Entre ellas
  debe haber al menos una carta de maná.
* El ultimo endpoint debe admitir dos parámetros: la puntuación máxima y la
  mínima. Se devolverán las cartas que cumplan con ese criterio. Deberá
  recibirse al menos uno de los dos criterios.

### Consideraciones
- No se evaluará ni una interfaz gráfica ni el acceso a un repositorio.
- El proyecto debe ser ejecutable utilizando Maven 3.3.6 y Java 8.
- Se valorará positivamente el código limpio.
- El esqueleto proporcionado se puede modificar todo lo necesario para adecuarse
  a la tarea requerida.
