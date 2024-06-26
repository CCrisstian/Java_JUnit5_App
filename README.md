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

<h2>JUnit Jupiter</h2>
<p>JUnit Jupiter es el nombre del subproyecto que se introdujo con JUnit 5, que es la última versión importante del popular framework de pruebas unitarias para Java, JUnit. Algunas de las ventajas de utilizar JUnit Jupiter en Java:</p>

-  <b>Modelo de programación moderno</b>: JUnit Jupiter ofrece un modelo de programación moderno y más flexible en comparación con JUnit 4. Introduce nuevas características como extensiones, anotaciones de parámetros, y métodos de aserción mejorados que facilitan la escritura y mantenimiento de pruebas unitarias.
-  <b>Anotaciones mejoradas</b>: JUnit Jupiter presenta un conjunto ampliado de anotaciones que permiten una mayor personalización y flexibilidad en las pruebas. Además de `@Test`, incluye anotaciones como `@BeforeEach`, `@AfterEach`, `@BeforeAll`, y `@AfterAll`, que permiten configurar el estado antes y después de las pruebas de manera más precisa.
-  <b>Extensiones</b>: JUnit Jupiter introduce el concepto de extensiones, que permiten extender y personalizar el comportamiento del framework de pruebas. Esto facilita la integración con otros frameworks y bibliotecas, así como la creación de funcionalidades adicionales para las pruebas unitarias.
-  <b>Arquitectura más modular</b>: JUnit Jupiter está diseñado con una arquitectura más modular que permite a los usuarios elegir y utilizar solo las partes específicas que necesitan. Esto proporciona una mayor flexibilidad y facilita la integración con otros frameworks y herramientas de desarrollo.
-  <b>Soporte para nuevos estilos de pruebas</b>: JUnit Jupiter introduce nuevos estilos de pruebas, como pruebas parametrizadas y pruebas basadas en lambdas, que permiten escribir pruebas más expresivas y concisas.
-  <b>Compatibilidad con Java 8 y versiones posteriores</b>: JUnit Jupiter está diseñado para ser compatible con Java 8 y versiones posteriores del lenguaje, lo que permite aprovechar las características introducidas en estas versiones, como expresiones lambda y streams.

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

<h1 align="center">Api stream</h1>
<p>El <b>API Stream</b> en Java proporciona una forma declarativa y funcional de procesar colecciones de datos de manera eficiente. Introducido en Java 8 como parte del paquete <b>java.util.stream</b>, el <b>Stream API</b> permite realizar operaciones sobre secuencias de elementos de forma parecida a como se trabaja con las colecciones, pero con la ventaja de que es posible realizar operaciones de forma paralela y diferida (lazy), lo que puede conducir a una mayor eficiencia en el uso de recursos y a un código más conciso y legible.</p>

Algunas características y conceptos clave del API `Stream` en Java:
-  <b>Flujo (Stream)</b>: Un flujo (Stream) representa una secuencia de elementos que pueden ser procesados de manera secuencial o paralela. Los flujos no almacenan datos, sino que operan sobre una fuente de datos subyacente, como una colección, matriz o un generador de elementos.
-  <b>Operaciones intermedias</b>: Las operaciones intermedias se aplican a un flujo y devuelven otro flujo. Estas operaciones no producen un resultado final hasta que se desencadena una operación terminal. Algunas operaciones intermedias comunes incluyen `filter`, `map`, `sorted`, `distinct`, entre otras.
-  <b>Operaciones terminales</b>: Las operaciones terminales consumen un flujo y producen un resultado final. Una vez que se realiza una operación terminal, el flujo se consume y no se puede reutilizar. Algunas operaciones terminales comunes incluyen `forEach`, `collect`, `reduce`, `count`, `min`, `max`, entre otras.
-  <b>Operaciones de reducción</b>: Las operaciones de reducción, como `reduce`, `collect` y `sum`, permiten combinar los elementos de un flujo en un solo resultado.
-  <b>Operaciones de procesamiento paralelo</b>: El API `Stream` permite realizar operaciones de procesamiento paralelo de forma transparente mediante el uso de hilos. Esto puede mejorar significativamente el rendimiento en hardware multinúcleo y grandes conjuntos de datos.
-  <b>Programación funcional</b>: El API `Stream` fomenta un estilo de programación funcional, lo que significa que las operaciones se expresan como funciones que se aplican a los elementos del flujo. Esto promueve la escritura de código más conciso, legible y mantenible.

<h1 align="center">assertAll</h1>
<p>assertAll es un método proporcionado por el framework de pruebas unitarias JUnit para Java que se utiliza para ejecutar varias afirmaciones y agrupar sus resultados en un solo informe de error. Esta función es útil cuando se quiere verificar múltiples condiciones en una sola prueba y obtener información detallada sobre todas las afirmaciones que fallaron, en lugar de detenerse en la primera falla como lo haría un simple assert.</p>

La sintaxis básica del método `assertAll` es la siguiente:
```java
assertAll(String mensaje, Executable... ejecutables)
```
-  <b>mensaje</b>: Un mensaje opcional que se mostrará si alguna de las afirmaciones falla. Puede ser útil para proporcionar información adicional sobre la prueba que se está ejecutando.
-  <b>ejecutables</b>: Una serie de ejecutables (métodos sin argumentos que lanzan excepciones) que contienen las afirmaciones que se desean verificar.

```java
@Test
void testCalculadora() {
    Calculadora calculadora = new Calculadora();
    assertAll("Verificación de operaciones",
                () -> assertEquals(4, calculadora.sumar(2, 2)),
                () -> assertEquals(2, calculadora.restar(4, 2)),
                () -> assertEquals(6, calculadora.multiplicar(2, 3))
    );
}
```
<h1 align="center">@DisplayName y @Disabled</h1>
<h3>@DisplayName</h3>
<p>La anotación @DisplayName se utiliza para proporcionar un nombre personalizado a una prueba o a un conjunto de pruebas. Esto es útil para hacer que los nombres de las pruebas sean más descriptivos y legibles, lo que facilita la comprensión de lo que se está probando.</p>

```java
@Test
@DisplayName("Prueba para verificar la suma de dos números positivos")
void testSuma() {
    // Código de la prueba
}
```
<h3>@Disabled</h3>
<p>La anotación @Disabled se utiliza para deshabilitar una prueba o un conjunto de pruebas. Esto significa que la prueba no se ejecutará cuando se ejecute el conjunto de pruebas, pero seguirá estando presente en el código y se podrá habilitar fácilmente en el futuro si es necesario.</p>

```java
@Test
@Disabled("Esta prueba está deshabilitada temporalmente debido a un problema conocido")
void testFuncionalidad() {
    // Código de la prueba
}
```

<h1 align="center">Cliclo de vida</h1>
<p>El ciclo de vida de una clase de prueba en Java, que utiliza JUnit 5, sigue un proceso específico que se ejecuta antes y después de cada prueba y también antes y después de todas las pruebas en la clase.</p>

 Aquí está el ciclo de vida típico de una clase de prueba, incluyendo las anotaciones `@BeforeAll`, `@BeforeEach`, `@AfterEach` y `@AfterAll`:
<p align="center"><img width="438" alt="image" src="https://github.com/CCrisstian/Java_JUnit5_App/assets/111469216/913805af-ed93-4f3d-9720-684584f41d2f"></p>

-  `@BeforeAll`: Esta anotación se utiliza para marcar un método que debe ejecutarse una vez antes de que se inicien todas las pruebas en la clase. El método debe ser estático y no debe tener parámetros.
-  `@BeforeEach`: Esta anotación se utiliza para marcar un método que debe ejecutarse antes de cada prueba en la clase. El método no debe ser estático y no debe tener parámetros. Es útil para configurar el estado necesario antes de cada prueba.
-  Prueba (sin anotación): Estos son los métodos que contienen las pruebas reales. No se utilizan anotaciones específicas para marcar estas pruebas.
-  `@AfterEach`: Esta anotación se utiliza para marcar un método que debe ejecutarse después de cada prueba en la clase. El método no debe ser estático y no debe tener parámetros. Se utiliza para realizar la limpieza necesaria después de cada prueba.
-  `@AfterAll`: Esta anotación se utiliza para marcar un método que debe ejecutarse una vez después de que se hayan completado todas las pruebas en la clase. El método debe ser estático y no debe tener parámetros. Se utiliza para realizar la limpieza final después de todas las pruebas.

<h1 align="center">@EnabledOnOs, @EnabledOnJre y @EnabledIfSystemProperty</h1>
<p>Las anotaciones @EnabledOnOs, @EnabledOnJre, @EnabledIfSystemProperty y similares en JUnit 5 son anotaciones de condición que se utilizan para habilitar o deshabilitar pruebas basadas en ciertas condiciones específicas del entorno de ejecución. Esto permite ejecutar pruebas solo en entornos específicos o bajo ciertas condiciones, lo que puede ser útil para probar funcionalidades que dependen del sistema operativo, la versión de Java u otras propiedades del sistema.</p>

-  `@EnabledOnOs`: Esta anotación se utiliza para habilitar una prueba solo en ciertos sistemas operativos. Se puede especificar uno o varios sistemas operativos como parámetro.
```java
@Test
@EnabledOnOs({ OS.WINDOWS, OS.MAC })
void testOnWindowsAndMac() {
    // Esta prueba se ejecutará solo en Windows y macOS
}
```

-  `@EnabledOnJre`: Esta anotación se utiliza para habilitar una prueba solo en ciertas versiones de la máquina virtual de Java (JVM). Se puede especificar una o varias versiones de JRE como parámetro.
```java
@Test
@EnabledOnJre(JRE.JAVA_8)
void testOnJava8() {
    // Esta prueba se ejecutará solo en Java 8
}
```

-  `@EnabledIfSystemProperty`: Esta anotación se utiliza para habilitar una prueba basada en el valor de una propiedad del sistema. Se puede especificar el nombre de la propiedad y su valor esperado como parámetros.
```java
@Test
@EnabledIfSystemProperty(named = "environment", matches = "development")
void testInDevelopmentEnvironment() {
    // Esta prueba se ejecutará solo si la propiedad del sistema 'environment' tiene el valor 'development'
}
```

-  `@EnabledIfEnvironmentVariable`: Similar a `@EnabledIfSystemProperty`, pero se basa en variables de entorno en lugar de propiedades del sistema.
```java
@Test
@EnabledIfEnvironmentVariable(named = "ENVIRONMENT", matches = "dev")
void testInDevelopmentEnvironment() {
    // Esta prueba se ejecutará solo si la variable de entorno 'ENVIRONMENT' tiene el valor 'dev'
}
```

<h1 align="center">Assumptions</h1>
<p>"Assumptions" (suposiciones) es un conjunto de métodos proporcionados por el framework de pruebas unitarias JUnit que se utilizan para establecer suposiciones sobre el entorno de ejecución de las pruebas. A diferencia de las aserciones (assertions), que verifican el comportamiento esperado de una prueba, las suposiciones permiten definir condiciones que deben ser verdaderas para que una prueba se ejecute.</p>
<p>Las suposiciones son útiles cuando se tienen pruebas que dependen de ciertas condiciones del entorno, como la disponibilidad de recursos específicos o la configuración del sistema. Si una suposición falla, la prueba se marcará como "omitida" en lugar de fallar. Esto significa que no se considerará un fallo, pero tampoco se considerará una prueba exitosa.</p>

<h2>"assume" y "assuming"</h2>

`assume`: El método `assume` es una forma más expresiva de realizar suposiciones en JUnit 5. Permite definir una condición utilizando una expresión lambda que será evaluada como verdadera o falsa. Si la condición es falsa, la prueba se marcará como "omitida". Este método proporciona una forma más flexible de definir suposiciones en comparación con `assumeTrue()`.

```java
import static org.junit.jupiter.api.Assumptions.assume;
import org.junit.jupiter.api.Test;

public class MiClaseTest {
    @Test
    void test() {
        // Suponemos que el sistema operativo es Windows
        assume(() -> System.getProperty("os.name").startsWith("Windows"));
        // El código de la prueba continúa aquí
        // Solo se ejecutará si la suposición es verdadera
    }
}
```

`assuming`: El método `assuming` es similar a `assume`, pero proporciona una forma de realizar suposiciones condicionales basadas en otra suposición. Esto puede ser útil cuando se tienen varias suposiciones y se quiere establecer una condición adicional si una suposición anterior es verdadera.

```java
import static org.junit.jupiter.api.Assumptions.assumingThat;
import org.junit.jupiter.api.Test;

public class MiClaseTest {
    @Test
    void test() {
        // Suponemos que el sistema operativo es Windows
        assumingThat(System.getProperty("os.name").startsWith("Windows"), () -> {
            // El código de la prueba continúa aquí
            // Solo se ejecutará si la suposición es verdadera
        });
    }
}
```

<h1 align="center">@Nested y @RepeatedTest</h1>

`@Nested`: La anotación `@Nested` se utiliza para anidar clases de prueba dentro de otras clases de prueba. Esto permite organizar y estructurar las pruebas de una manera más clara y jerárquica, lo que facilita su mantenimiento y comprensión.

`@RepeatedTest`: La anotación `@RepeatedTest` se utiliza para repetir una prueba un número especificado de veces. Esto es útil para probar el comportamiento de una función bajo diferentes condiciones o para realizar pruebas de rendimiento.

Estas anotaciones proporcionan funcionalidades adicionales en JUnit 5 para facilitar la organización, modularidad y repetición de las pruebas unitarias, lo que contribuye a un código de prueba más claro y mantenible.

<h1 align="center">@ParameterizedTest</h1>
<p>@ParameterizedTest es una anotación de JUnit 5 que se utiliza para realizar pruebas parametrizadas. Las pruebas parametrizadas permiten ejecutar una misma prueba con diferentes conjuntos de datos de entrada. Esto es útil cuando se quiere probar el comportamiento de un método con múltiples valores de entrada para asegurarse de que funcione correctamente en diferentes situaciones.</p>

<h2>@ValueSource, @CsvSource, @CsvFileSource</h2>

`@ValueSource`: Esta anotación se utiliza para proporcionar una lista de valores simples como parámetros para la prueba. Se puede utilizar con tipos de datos simples como enteros, cadenas, booleanos, etc.

`@CsvSource`: Esta anotación se utiliza para proporcionar una lista de valores en formato CSV como parámetros para la prueba. Cada línea en el CSV representa un conjunto de parámetros para una ejecución de prueba.

`@CsvFileSource`: Esta anotación se utiliza para cargar los datos de un archivo CSV como parámetros para la prueba. El archivo CSV debe estar presente en el classpath del proyecto.

<h1 align="center">@Tag</h1>
<p>La anotación @Tag en JUnit 5 se utiliza para etiquetar las pruebas con una o más etiquetas (tags) descriptivas. Estas etiquetas permiten categorizar las pruebas de acuerdo a diferentes criterios, como el tipo de prueba, la funcionalidad que están probando, la prioridad, o cualquier otro criterio relevante para la organización y ejecución de las pruebas.</p>
<p>La anotación @Tag se puede aplicar a nivel de clase o de método de prueba. Cuando se aplica a nivel de clase, todas las pruebas dentro de esa clase estarán etiquetadas con la(s) etiqueta(s) especificada(s). Cuando se aplica a nivel de método de prueba, solo ese método de prueba en particular estará etiquetado.</p>
<p>Las etiquetas definidas con @Tag se pueden usar luego en la configuración de la ejecución de pruebas para incluir o excluir pruebas específicas según sus etiquetas, lo que permite una mayor flexibilidad en la ejecución y organización de las pruebas.</p>

<h1 align="center">'TestInfo' y 'TestReporter'</h1>
<p>"TestInfo" y "TestReporter" son interfaces proporcionadas por JUnit 5 para obtener información sobre las pruebas que se están ejecutando y para reportar información adicional durante la ejecución de las pruebas.</p>

`TestInfo`:
-  `String getDisplayName()`: Devuelve el nombre descriptivo de la prueba.
-  `Set<Tag> getTags()`: Devuelve las etiquetas asociadas a la prueba, si se han especificado usando `@Tag`.
-  `Optional<Class<?>> getTestClass()`: Devuelve la clase de prueba asociada a la prueba.
-  `Optional<Method> getTestMethod()`: Devuelve el método de prueba asociado a la prueba.
-  `Map<String, String> getTestAttributes()`: Devuelve los atributos adicionales asociados a la prueba.
  
`TestReporter`:
-  `void publishEntry(String key, String value)`: Publica una entrada en el reporte de la prueba con la clave y el valor especificados.
-  `void publishEntry(Map<String, String> entries)`: Publica varias entradas en el reporte de la prueba con los pares de clave-valor especificados en el mapa.
-  `void publishEntry(ReportEntry entry)`: Publica una entrada de reporte personalizada.
-  `void publishEntry(String message)`: Publica un mensaje en el reporte de la prueba.

<p>Estas interfaces son útiles para proporcionar información adicional o personalizada sobre las pruebas durante su ejecución, lo que puede ser útil para fines de registro, seguimiento o diagnóstico de problemas.</p>

<h1 align="center">@Timeout</h1>
<p>La anotación @Timeout en JUnit 5 se utiliza para especificar un límite de tiempo máximo para la ejecución de una prueba. Esto es útil cuando se quiere asegurar que una prueba no tome más tiempo del esperado para ejecutarse, lo que puede indicar problemas de rendimiento o bloqueos en el código.</p>
<p>La anotación @Timeout se puede aplicar a nivel de clase o de método de prueba. Cuando se aplica a nivel de clase, el límite de tiempo se aplica a todas las pruebas en la clase. Cuando se aplica a nivel de método de prueba, el límite de tiempo se aplica solo a ese método de prueba en particular.</p>
<p>El tiempo de espera se especifica utilizando un valor numérico entero junto con una unidad de tiempo, como segundos, minutos, milisegundos, etc.</p>
<p>Es importante tener en cuenta que el tiempo especificado en @Timeout se aplica al tiempo total de ejecución de la prueba, incluyendo cualquier espera, bloqueo o tiempo de procesamiento en el código de la prueba. Esto permite asegurar que la prueba no se quede bloqueada o se ejecute indefinidamente, lo que podría afectar la eficiencia y confiabilidad de las pruebas.</p>

<h1 align="center">Maven: Surefire </h1>
<p>El plugin Surefire es una herramienta que se utiliza en el ecosistema de Maven para la ejecución de pruebas unitarias en proyectos Java. Es un plugin muy popular y ampliamente utilizado en el desarrollo de software Java. Surefire es especialmente útil en proyectos Maven, ya que permite ejecutar pruebas automáticamente durante el proceso de compilación o cuando se realiza un ciclo de vida específico.</p>
<p>Algunas características clave y cómo se usa el plugin Surefire en Maven:</p>

-  <b>Ejecución de pruebas automáticas</b>: El plugin Surefire permite ejecutar pruebas unitarias automáticamente durante el proceso de compilación de Maven. Cuando se ejecuta el comando `mvn test`, Surefire buscará y ejecutará todas las clases de prueba en el proyecto.
-  <b>Formatos de reporte</b>: Surefire genera informes de ejecución de pruebas en varios formatos, incluyendo formatos de texto, XML y HTML. Estos informes proporcionan detalles sobre las pruebas que se ejecutaron, los resultados y cualquier error o fallo encontrado durante la ejecución.
-  <b>Configuración flexible</b>: Surefire se puede configurar fácilmente en el archivo `pom.xml` del proyecto Maven para personalizar su comportamiento. Esto incluye especificar la ubicación de las clases de prueba, los directorios de salida para los informes de prueba, los patrones de inclusión y exclusión para las pruebas, entre otros ajustes.
-  <b>Integración con CI/CD</b>: Surefire es compatible con plataformas de integración continua (CI) como Jenkins, Travis CI y CircleCI, lo que permite ejecutar automáticamente las pruebas en cada confirmación de código o en un horario programado. Los informes de prueba generados por Surefire se pueden integrar con estas plataformas para proporcionar retroalimentación rápida sobre la calidad del código.
