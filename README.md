# TAED2 - TP2

Este proyecto implementa diferentes métodos de manejo de colisiones en tablas hash utilizando Java. La función hash utilizada es H(x) = X mod 10.

## Funcionalidades

1. Función Hash
   Implementación de la función hash H(x) = X mod 10 para determinar el índice de almacenamiento en la tabla.

2. Métodos de Manejo de Colisiones
   El proyecto incluye tres diferentes estrategias para manejar colisiones:

   a. Sondeo Lineal
   Búsqueda secuencial de la siguiente posición disponible

   Implementado en la clase TablaExploracionLineal

   b. Sondeo Cuadrático
   Búsqueda de posiciones utilizando incrementos cuadráticos

   Implementado en la clase TablaExploracionCuadratica

   c. Hashing Abierto
   Utilización de listas enlazadas para manejar colisiones

   Implementado en la clase TablaHashAbierta

3. Operaciones Principales
   - Inserción de elementos
   - Búsqueda de elementos
   - Eliminación de elementos

## Estructura del Proyecto

Cada método de manejo de colisiones está implementado en su propia clase

Interface común para mantener consistencia entre implementaciones

Programa principal que permite elegir el método de manejo de colisiones deseado

## Uso

Para utilizar el programa:

1. Compilar los archivos Java
2. Ejecutar el programa principal
3. Seleccionar el método de manejo de colisiones deseado
4. Realizar operaciones de inserción, búsqueda y eliminación
