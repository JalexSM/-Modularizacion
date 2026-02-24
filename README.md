##  Menú Principal  

Para el menú principal se utilizó una estructura de control **while** combinada con **switch**.

Se eligió **while** porque el programa debe mantenerse en ejecución hasta que el usuario seleccione la opción 11 (Salir). Esto permite que el sistema sea interactivo y continuo.

Se utilizó **switch** para evaluar la opción seleccionada porque se comparan valores exactos (1 al 11). Esta estructura es más organizada y legible que múltiples if-else cuando se manejan opciones fijas y definidas.

Además, se implementó un bloque **try-catch** para evitar que el programa se detenga si el usuario ingresa un dato inválido.



##  Calculadora Básica  

Para la selección de operaciones se utilizó **switch**, ya que se comparan valores exactos (1: suma, 2: resta, etc.).

Para evitar errores:
- Se creó el método `leerNumero()` para validar entradas numéricas.
- Se agregó validación para evitar división entre cero.

Se modularizó el código creando métodos separados:
- `suma()`
- `resta()`
- `multiplicacion()`
- `division()`

Esto mejora la organización y reutilización del código.



##  Validación de Contraseña  

Se utilizó la estructura **do-while** junto con **if**.

Se eligió **do-while** porque el programa debe solicitar la contraseña al menos una vez y repetir hasta que sea correcta.

Se utilizó el método `.equals()` para comparar cadenas, ya que en Java los Strings no se comparan con `==`.



##  Números Primos  

Se utilizó:
- Un método booleano `esPrimo()`
- Un ciclo **for** para verificar divisibilidad
- La función `Math.sqrt()` para optimizar el proceso

Se eligió esta lógica porque reduce la cantidad de iteraciones y hace el algoritmo más eficiente.



##  Suma de Números Pares  

Se utilizó un ciclo **while** que se ejecuta hasta que el usuario ingrese 0.

Se empleó el operador módulo `%` para determinar si un número es par.

Se agregó validación con try-catch para evitar errores de entrada.



##  Conversión de Temperatura  

Se utilizó **switch** para seleccionar el tipo de conversión (Celsius ↔ Fahrenheit).

Se crearon métodos independientes:
- `celsiusAFahrenheit()`
- `fahrenheitACelsius()`

Esto mejora la claridad y permite reutilizar las fórmulas.



##  Contador de Vocales  

Se utilizó:
- Un ciclo **for** para recorrer la cadena.
- `toLowerCase()` para evitar problemas con mayúsculas.
- Condicional **if** con operadores lógicos `||`.

Se eligió esta estructura porque permite evaluar múltiples condiciones dentro del recorrido del texto.



## Cálculo de Factorial  

Se utilizó un ciclo **for** acumulativo.

Se eligió estructura iterativa en lugar de recursiva para mantener el código más sencillo y fácil de comprender.

Se agregó validación para evitar números negativos.



##  Juego de Adivinanza  

Se utilizó:
- `Math.random()` para generar el número aleatorio.
- Ciclo **do-while** para repetir hasta acertar.
- Estructura **if-else** para comparar intentos.

Se eligió esta combinación porque el juego necesita repetirse hasta que se cumpla la condición correcta.



##  Paso por Referencia  

Se creó una clase estática interna llamada `Contenedor`.

En Java, los tipos primitivos no se pasan por referencia directamente, por lo que se encapsularon dentro de un objeto.

Se utilizó un método `intercambiar()` para demostrar el intercambio de valores.

Esto permite simular el paso por referencia y comprender mejor el manejo de objetos en memoria.



##  Tabla de Multiplicar  

Se utilizó un ciclo **for** para generar la tabla del 1 al 10.

Se creó un método independiente `tabla()` para separar la lógica y mantener la modularización del programa.

#  Conclusión Técnica  

El programa fue desarrollado aplicando:

- Estructuras de control: `if-else`, `switch`, `while`, `do-while`, `for`
- Manejo de excepciones con `try-catch`
- Modularización mediante métodos
- Validación de datos de entrada
- Uso de clases internas para simulación de referencia

El diseño modular mejora la organización, reutilización y mantenimiento del código, cumpliendo con los principios básicos de programación estructurada en Java.
