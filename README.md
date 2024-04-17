<h1 align="center">Pruebas Unitarias</h1>
<p>Las pruebas unitarias en Java son pruebas automatizadas diseñadas para evaluar el comportamiento de unidades individuales de código, como métodos, clases o funciones, de forma aislada. El objetivo principal de las pruebas unitarias es verificar que cada unidad de código funcione correctamente según lo esperado y produzca los resultados correctos ante diferentes condiciones y entradas.</p>
<p>Las pruebas unitarias se centran en aspectos específicos del código, probando casos de uso particulares y detectando posibles errores en el funcionamiento de la unidad de código bajo prueba. Estas pruebas son escritas por los desarrolladores para validar el comportamiento de su propio código durante el proceso de desarrollo.</p>
<p>Las pruebas unitarias son una práctica fundamental en el desarrollo de software porque:</p>

-  Proporcionan una forma de verificar que el código funciona como se espera.
-  Permiten detectar errores de forma temprana, facilitando su corrección antes de que se propaguen a otras partes del sistema.
-  Ayudan a mantener la integridad del código a lo largo del tiempo, permitiendo realizar cambios con confianza al tener un conjunto de pruebas que validan el comportamiento esperado.
-  Mejoran la calidad del software al proporcionar una forma sistemática de validar su funcionamiento.

<h1 align="center">JUnit 5</h1>
<p>JUnit 5 es la última versión de la popular biblioteca de pruebas unitarias para Java, JUnit. Se utiliza para escribir y ejecutar pruebas unitarias en aplicaciones Java.</p>
<p>Aquí hay algunos aspectos importantes sobre JUnit 5 y para qué se usa:</p>

-  <b>Estructura modular</b>: JUnit 5 está diseñado con una arquitectura modular que permite a los usuarios elegir y utilizar solo las partes específicas que necesitan. Esto proporciona una mayor flexibilidad y facilita la integración con otros marcos y herramientas de desarrollo.
-  <b>Extensiones</b>: JUnit 5 introduce el concepto de extensiones, que son interfaces y anotaciones que permiten ampliar y personalizar el comportamiento de las pruebas. Las extensiones pueden usarse para agregar funcionalidades adicionales, como manejo de recursos, inyección de dependencias, preparación y limpieza de datos, entre otros.
-  <b>Soporte para anotaciones de Java 8</b>: JUnit 5 aprovecha las características introducidas en Java 8, como las anotaciones de tipo repetido y las anotaciones de parámetros. Esto facilita la escritura de pruebas más expresivas y concisas.
-  <b>Arquitectura de lanzamiento</b>: JUnit 5 proporciona una arquitectura de lanzamiento que permite a los usuarios migrar de JUnit 4 a JUnit 5 de manera gradual. Esto significa que es posible ejecutar pruebas escritas con JUnit 4 junto con pruebas escritas con JUnit 5 en la misma suite de pruebas.
-  <b>Soporte para nuevos estilos de pruebas</b>: JUnit 5 introduce nuevos estilos de pruebas, como pruebas basadas en lambdas y pruebas parametrizadas mejoradas. Esto permite una mayor flexibilidad en la escritura de pruebas y facilita la creación de casos de prueba más complejos y variados.

<h1 align="center">Maven</h1>
<p>Maven es una herramienta de gestión de proyectos de código abierto desarrollada por la Apache Software Foundation. Se utiliza principalmente en proyectos Java para automatizar el proceso de construcción, gestión de dependencias y generación de informes de software. Maven utiliza un archivo XML llamado "pom.xml" (Project Object Model) para describir el proyecto y sus dependencias, así como para definir cómo se debe construir el proyecto.</p>
<p>Algunas de las funciones principales de Maven son:</p>
                                                       
-  <b>Gestión de dependencias</b>: Maven maneja automáticamente las dependencias del proyecto, descargando las bibliotecas necesarias desde repositorios remotos y asegurando que las versiones correctas sean utilizadas en el proyecto.
-  <b>Construcción del proyecto</b>: Maven puede compilar el código fuente, ejecutar pruebas, empaquetar el proyecto en diferentes formatos (como JAR, WAR o EAR), y generar documentación automáticamente.
-  <b>Ciclo de vida del proyecto</b>: Maven define un conjunto de fases y metas que constituyen el ciclo de vida del proyecto, desde la compilación hasta la instalación y despliegue. Esto permite ejecutar fácilmente tareas comunes de construcción del proyecto con un simple comando.
-  <b>Gestión de plugins</b>: Maven admite plugins que pueden extender su funcionalidad para realizar tareas específicas en el proceso de construcción del proyecto, como generar informes, ejecutar pruebas de integración, o desplegar artefactos en servidores remotos.

<h1 align="center">@Test</h1>
<p>En Java, cuando un método tiene la anotación <b>@Test</b>, esto indica que el método es una prueba unitaria y que será ejecutado por un framework de pruebas unitarias como JUnit o TestNG.</p>

La anotación `@Test` se utiliza para marcar un método como una prueba, lo que significa que este método contiene el código que verifica el comportamiento de una unidad específica de código bajo ciertas condiciones
```java
import org.junit.Test;

public class MiClaseTest {

    @Test
    public void testMetodo() {
        // Código de prueba aquí
    }
}
```
Durante la ejecución de la suite de pruebas, el framework invocará todos los métodos marcados con `@Test` y verificará si el comportamiento observado coincide con el comportamiento esperado definido dentro de esos métodos.

<h1 align="center">Api 'BigDecimal'</h1>
<p><b>BigDecimal</b> es una clase en Java que proporciona soporte para aritmética de precisión arbitraria. Esta clase se utiliza para trabajar con números decimales de precisión arbitraria, lo que significa que puede manejar números con una cantidad arbitraria de dígitos, lo que evita problemas de precisión que pueden surgir al trabajar con números de punto flotante.</p>

Algunas de las características y métodos importantes de la clase `BigDecimal`:
-  <b>Precisión arbitraria</b>: `BigDecimal` puede representar números decimales con una precisión arbitraria, lo que permite trabajar con números con una gran cantidad de dígitos.
-  <b>Constructor</b>: Puedes crear un objeto `BigDecimal` utilizando varios constructores, como pasar un valor numérico como cadena de caracteres, un valor de punto flotante o un valor entero.
```java
BigDecimal bigDecimal = new BigDecimal("123.456");
```
-  <b>ConstructorOperaciones aritméticas</b>: `BigDecimal` proporciona métodos para realizar operaciones aritméticas como suma, resta, multiplicación y división con precisión arbitraria. Estas operaciones se realizan a través de métodos como `add()`, `subtract()`, `multiply()` y `divide()`.
```java
BigDecimal resultado = bigDecimal1.add(bigDecimal2);
```
-  <b>Comparación</b>: `BigDecimal` también proporciona métodos para comparar valores, como `compareTo()`, `equals()` y `compareTo()`, que permiten comparar dos objetos `BigDecimal`.
```java
int comparacion = bigDecimal1.compareTo(bigDecimal2);
```
-  <b>Redondeo</b>: La clase `BigDecimal` también ofrece métodos para redondear valores según ciertos criterios, como `setScale()` y `round()`.
```java
BigDecimal redondeado = bigDecimal.setScale(2, RoundingMode.HALF_UP);
```
-  <b>Manejo de excepciones</b>: `BigDecimal` lanza una excepción `ArithmeticException` si ocurre un error aritmético durante las operaciones, como la división por cero.
```java
try {
    BigDecimal resultado = bigDecimal1.divide(bigDecimal2);
} catch (ArithmeticException e) {
    System.out.println("Error de división: " + e.getMessage());
}
```
<h2>Inmutabilidad  de 'BigDecimal'</h2>
<p>Una vez que se crea un objeto BigDecimal, su valor no puede cambiarse. Cualquier operación aritmética u otra manipulación de un objeto BigDecimal produce un nuevo objeto BigDecimal con el resultado de la operación, en lugar de modificar el objeto original.</p>
<p>Esta inmutabilidad es una característica importante de BigDecimal, ya que garantiza que los valores numéricos se mantengan consistentes y que las operaciones no alteren los objetos originales. Esto es particularmente útil en aplicaciones donde la precisión y la integridad de los datos son críticas, como en aplicaciones financieras o científicas.</p>

Ejemplo de la inmutabilidad de `BigDecimal`:
```java
BigDecimal original = new BigDecimal("10");
BigDecimal resultado = original.add(new BigDecimal("5")); // Se crea un nuevo objeto BigDecimal con el resultado de la suma

System.out.println("Original: " + original); // Imprime "Original: 10"
System.out.println("Resultado: " + resultado); // Imprime "Resultado: 15"
```

<h1 align="center">assertions</h1>
<p>En Java, los "assertions" (afirmaciones o aserciones) son declaraciones que verifican que una condición especificada es verdadera durante la ejecución del programa. Estas afirmaciones se utilizan para expresar suposiciones sobre el estado del programa en un punto dado y ayudan a identificar errores lógicos o condiciones inesperadas durante el desarrollo y la depuración del código.</p>

Los assertions se implementan utilizando la palabra clave `assert`.
```java
assert condition;
```
Donde `condition` es una expresión booleana que se espera que sea verdadera. Si la condición es verdadera, el programa continúa su ejecución normalmente. Sin embargo, si la condición es falsa, se lanza una excepción `AssertionError`, lo que indica que la aserción ha fallado. Por lo general, esto detiene la ejecución del programa, a menos que las aserciones estén desactivadas.

<p>Framework de pruebas unitarias JUnit:</p>

-  `assertTrue(boolean condition)`: Verifica que la condición dada sea verdadera.
```java
assertTrue(x > 0);
```
-  `assertTrue(boolean condition)`: Verifica que la condición dada sea falsa.
```java
assertFalse(x < 0);
```
-  `assertEquals(expected, actual)`: Verifica que los valores esperados y reales sean iguales.
```java
assertEquals(5, result);
```
-  `assertNotEquals(unexpected, actual)`: Verifica que los valores esperados y reales no sean iguales.
```java
assertNotEquals(null, object);
```
-  `assertNotNull(object)`: Verifica que el objeto dado no sea nulo.
```java
assertNotNull(object);
```
-  `assertNull(object)`: Verifica que el objeto dado sea nulo.
```java
assertNull(object);
```
