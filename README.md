Sistema de Gestión para Cooperativa Agro-Tecnológica
Descripción
Sistema de gestión para fincas con sensores, estaciones meteorológicas y drones. Permite conectar dispositivos de distintos fabricantes mediante contratos estandarizados y agregar nuevas capacidades sin modificar el código existente.

Características
Gestión de equipos diversos (drones, estaciones meteorológicas, sensores)

Contratos estandarizados: Medible, Accionable, Registrable

Lista polimórfica para todos los dispositivos

Carga inicial con 12 equipos de ejemplo

Interfaz de consola interactiva

Requisitos
Java 8 o superior

Cualquier sistema operativo con terminal/consola

Uso del Programa
Menú Principal
Al ejecutar el programa, se mostrará el siguiente menú:

Listar todos los equipos - Muestra todos los dispositivos en el catálogo

Buscar equipo por ID - Busca un dispositivo por su identificador único

Buscar equipo por nombre - Busca dispositivos por nombre o parte del nombre

Ordenar equipos por consumo eléctrico - Muestra equipos ordenados por consumo energético

Añadir nuevo equipo - Permite agregar nuevos dispositivos al sistema

Salir - Termina la aplicación

Tipos de Equipos Disponibles
Drones:

Capacidades: Accionable, Registrable

Ejecutan acciones como riego, fumigación, captura de imágenes

Estaciones Meteorológicas:

Capacidades: Medible, Registrable

Miden parámetros como temperatura, humedad, viento, presión

Sensores:

Capacidades: Medible

Miden parámetros específicos como humedad del suelo, temperatura, pH

Funcionalidades de Búsqueda
Búsqueda por ID: Ingrese el número identificador del equipo

Búsqueda por nombre: Puede buscar por nombre completo o parcial

Todos los resultados de búsqueda incluyen equipos de la carga inicial y los añadidos por el usuario

Añadir Nuevos Equipos
Al seleccionar "Añadir nuevo equipo", el sistema guiará al usuario através de:

Selección del tipo de equipo (Dron, Estación, Sensor)

Ingreso de ID único, nombre y consumo eléctrico

Ingreso de datos específicos según el tipo:

Drones: Tipo de acción

Estaciones: Parámetros a medir

Sensores: Tipo de medición

Los equipos añadidos estarán inmediatamente disponibles en todas las funcionalidades del sistema.

Notas Técnicas
El sistema utiliza el patrón MVC (Modelo-Vista-Controlador)

Implementa principios de diseño orientado a objetos

Usa una lista polimórfica para gestionar todos los dispositivos

Soporta la adición de nuevos tipos de equipos sin modificar el código existente

Los dispositivos sin ciertas capacidades no causan fallos en el sistema

Extensibilidad
El sistema está diseñado para ser extendido fácilmente. Para agregar nuevos tipos de equipos:

Crear una nueva clase que extienda Equipos

Implementar las interfaces relevantes (Medible, Accionable, Registrable)

El nuevo equipo estará automáticamente disponible en todas las funcionalidades del sistema


Desarrollado como ejercicio académico para demostrar polimorfismo con interfaces en Java (README creado con AI)
