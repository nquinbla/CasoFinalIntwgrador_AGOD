# Caso Final Integrador: Sistema Interactivo de Análisis Genómico y Organización de Datos
Caso Final Integrador: Sistema Interactivo de Análisis Genómico y Organización de Datos de Nerea Quintanilla Blanco, los respectivos ejercicios se sitúan tras su explicación en corchetes.
LINK: (https://github.com/nquinbla/CasoFinalIntwgrador_AGOD.git)

## DESCRIPCIÓN
El proyecto consiste en el desarrollo de un sistema de software, el cuál integra funciones de recursividad y algoritmos de ordenación para el análisis de secuencias de ADN, la manipulación de datos y la organización de información científica. Al compilar, la venta principal se abre mostrando los diversos botones principales explicados en cada módulo en el siguiente apartado, además de un título y dos subtítulos con un fondo azul semi-transparente acompañado de decoraciones azules y cadenas de adn junto al logo de la universidad. Cada botón contiene una función diferente ,de entre los ocho botones, e implementan conceptos de recursividad, búsqueda y ordenamiento creando así una herramienta útil en el campo de biología computacional.

## MÓDULO
 ### 1. Análisis Genómico (Ejercicios 7 y 8)
  * Conteo de Genes: Desarrollar una función recursiva que identifique y cuente las secuencias de genes en una cadena de ADN, utilizando la marca "ATG" para el inicio de genes -> [ConteoGenes] & [ConteoGenesGUI]
  * Cálculo de Combinaciones Genéticas: Implementar un algoritmo recursivo para calcular combinaciones genéticas basadas en un modelo simplificado, ayudando a los investigadores a predecir patrones genéticos -> [CálculoCombGen] & [CálculoComGenGUI]
* EJEMPLO A USAR -> "ATGCGATAATGCTTAAATGTTTAA", donde esta cadena contiene dos genes: "ATGCGATAATGC" y "ATGTTT". 

 ### 2. Herramientas de Análisis Numérico (Ejercicios 1,2,3,4 y 5)
  * Sumatoria y Listado de Números: Crear funciones recursivas para calcular la suma de números naturales y listar números en un rango dado, que podrían ser utilizadas en el cálculo de estadísticas genéticas o demográficas -> [SumatoriaYListadoNum] & [SumatoriaYListadoNumGUI]
  * Cálculo de Potencias y Máximos: Implementar funciones para calcular potencias mediante multiplicaciones sucesivas y encontrar el valor máximo en un conjunto de datos numéricos, útiles en análisis de datos y modelado estadístico -> [CálculoPotenciasYMáx] & [CálculoPotenciasYMáxGUI]
  * EJEMPLO A USAR -> "3", donde debe salir 8, ya que hay 8 combinaciones genéticas posibles para 3 genes

 ### 3. Gestión de Información Científica (Ejercicio 9,10,11 y 12)
  * Organización de Documentos: Desarrollar un programa que ordene alfabéticamente las líneas de un archivo de texto, ayudando a los investigadores a organizar sus notas y publicaciones -> [OrganizaciónDoc] & [OrganizaciónDocGUI]
  * Búsqueda Eficiente en Textos: Implementar un sistema de búsqueda de palabras en archivos de texto, primero de forma lineal y luego optimizándolo a búsqueda binaria, para mejorar la eficiencia en la localización de información -> [BúsquedaTextos] & [BúsquedaTextosGUI] 
  * Gestión de Fechas: Crear un programa que permita a los usuarios introducir y listar fechas de manera ordenada, facilitando la organización cronológica de experimentos y resultados -> [GestiónFechas] & [GestiónFechasGUI]

 ### 4. Optimización de Procesos (Ejercicio 13)
  * Mejora de Algoritmos: Tomar el algoritmo de quicksort y optimizarlo según las indicaciones dadas, demostrando la capacidad de mejorar y adaptar algoritmos existentes para una mayor eficiencia y eficacia. -> [MejoraAlgoritmos] & [MejoraAlgoritmosGUI]

### 5. Decoración
  * Decoración del panel: una clase la cuál hemos decorado  con dos imagenes metidas en src/main/resources, el fondo con lineas azules y rellenos del mismo color y un fondo azul claro -> [DecoPanel]

## ENTREGABLES
* Software de Análisis Genómico y Organización de Datos: Un programa interactivo que integre todas las funcionalidades mencionadas con una interfaz de usuario que facilite su uso por parte de los investigadores.
* Documento de Diseño y Especificaciones: Un informe detallado que incluya la descripción de cada función y algoritmo, ejemplos de uso y casos de prueba, y explicaciones de cómo cada herramienta contribuye al proceso de investigación.

## EVALUACIÓN
Este proyecto final integrador desafía a los estudiantes a combinar habilidades técnicas con creatividad para desarrollar una herramienta útil y atractiva que podría tener aplicaciones reales en el mundo de la escritura y el periodismo.

- Funcionalidad y Correctitud: ¿Cumple la aplicación con todas las funcionalidades requeridas y produce los resultados esperados?
- Calidad de la Interfaz de Usuario: ¿Es la interfaz intuitiva, estéticamente agradable y fácil de navegar?
- Eficiencia del Código: ¿Es el código bien estructurado, eficiente y fácil de entender?
- Innovación y Utilidad: ¿Cómo de innovador es el proyecto y cuánto mejora la experiencia de los usuarios?
- Documentación y Presentación: ¿Está bien documentado y presentado el diseño, la implementación y el uso de la aplicación?

Objetivo: Evaluar la capacidad de los estudiantes para aplicar habilidades de programación, diseño de interfaces de usuario, y lógica de software en el desarrollo de un sistema de gestión de publicaciones interactivo y eficiente.


## CRITERIOS DE EVALUACIÓN + RÚBRICA
### Funcionalidad y Correctitud (25%)
- Excelente (100%): Todas las funcionalidades implementadas funcionan correctamente y manejan casos extremos y errores de manera eficaz. Cumple con todos los requisitos y especificaciones.
- Bueno (75%): La mayoría de las funcionalidades funcionan correctamente, con errores menores que no afectan la funcionalidad general.
- Adecuado (50%): Las funcionalidades básicas están presentes y funcionan, pero hay errores notables o problemas en casos extremos.
- Insuficiente (25%): Varios componentes no funcionan correctamente, afectando la usabilidad y la efectividad del sistema.

### Calidad de la Interfaz de Usuario (20%)
- Excelente (100%): La interfaz es intuitiva, estéticamente agradable, y facilita una navegación fluida y una experiencia de usuario positiva.
- Bueno (75%): La interfaz es funcional y generalmente fácil de usar, pero con algunas áreas que podrían mejorarse para una mejor experiencia.
- Adecuado (50%): La interfaz cumple con los requisitos básicos, pero carece de refinamiento y claridad en algunos aspectos.
- Insuficiente (25%): La interfaz es confusa, difícil de navegar, o visualmente poco atractiva.

### Eficiencia del Código (20%)
- Excelente (100%): Código bien estructurado, eficiente, y optimizado, fácil de entender y mantener.
- Bueno (75%): Código generalmente bien organizado y funcional con pequeñas áreas que podrían ser optimizadas.
- Adecuado (50%): Código funcional pero con espacio evidente para mejorar en términos de estructura, eficiencia y claridad.
- Insuficiente (25%): Código desordenado, ineficiente y difícil de entender o mantener.

### Innovación y Utilidad (20%)
- Excelente (100%): El proyecto demuestra un alto nivel de innovación y aporta significativamente a mejorar la gestión y publicación de contenidos.
- Bueno (75%): El proyecto presenta características innovadoras y útiles que aportan valor al sistema.
- Adecuado (50%): El proyecto tiene algunos elementos innovadores, pero en su mayoría sigue enfoques convencionales.
- Insuficiente (25%): Poca innovación o elementos que realmente mejoren la experiencia del usuario o la eficiencia del sistema.

### Documentación y Presentación (15%)
- Excelente (100%): Documentación y presentación excepcionales, incluyendo detalles completos, claros y bien organizados del sistema.
- Bueno (75%): Documentación y presentación bien realizadas con algunas áreas menores que podrían mejorarse.
- Adecuado (50%): Documentación y presentación básicas que cubren los requisitos pero carecen de detalles y claridad.
- Insuficiente (25%): Documentación y presentación pobres, faltan detalles importantes, y es difícil entender el sistema.

Total de Puntos Posibles: 100

Escala de Calificación:
* 90-100: Sobresaliente
* 80-89: Muy Bueno
* 70-79: Bueno
* 60-69: Adecuado
* 0-59: Insuficiente

#### Comentarios Adicionales:
* Se espera que los proyectos sean entregados en la fecha y hora acordadas. Las entregas tardías pueden afectar la calificación.
* Se alienta a los estudiantes a buscar retroalimentación y realizar revisiones durante el desarrollo para asegurar la calidad y funcionalidad del sistema.
* El trabajo debe ser original y propio del equipo. El plagio resultará en una calificación de cero.

Esta rúbrica está diseñada para proporcionar una evaluación detallada y justa del proyecto final integrador, considerando varios aspectos críticos en el desarrollo de software y diseño de interfaces de usuario.


