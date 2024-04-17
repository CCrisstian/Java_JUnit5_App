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
