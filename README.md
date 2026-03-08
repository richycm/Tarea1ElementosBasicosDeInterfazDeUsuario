# ElementosUIApp - Guía Interactiva de Interfaz de Usuario

## Descripción del Proyecto
Esta aplicación Android ha sido desarrollada como parte de la **Tarea 1 de Elementos Básicos de Interfaz de Usuario**. El objetivo principal es demostrar el uso profesional de **Activities y Fragments** para explicar y ejemplificar diferentes componentes de la interfaz de usuario de Android de manera interactiva y educativa.

---

## 1. Estructura de la Aplicación
La app utiliza una arquitectura de **Actividad Única (Single Activity)** con un contenedor dinámico para intercambiar entre **5 Fragments**, cada uno especializado en una categoría de UI:

1.  **Fragment 1: TextFields (EditText)**
    *   **Funcionalidad:** Permite la entrada de texto mediante el teclado.
    *   **Interacción:** El usuario ingresa su nombre y recibe un saludo personalizado dinámico al presionar un botón.
    *   **Explicación:** Los campos de texto son esenciales para capturar información del usuario en formularios y búsquedas.

2.  **Fragment 2: Botones (Button, ImageButton, FAB)**
    *   **Funcionalidad:** Demuestra diferentes tipos de disparadores de acciones.
    *   **Interacción:** Al presionar un botón normal, un `ImageButton` o un `FloatingActionButton`, se actualiza una tarjeta informativa con la descripción técnica de cada uno.
    *   **Explicación:** Los botones permiten al usuario realizar acciones con un solo toque, variando según su jerarquía visual.

3.  **Fragment 3: Elementos de Selección (CheckBox, RadioButton, Switch)**
    *   **Funcionalidad:** Manejo de estados de selección única, múltiple y binaria.
    *   **Interacción:** Un panel de resumen muestra las elecciones del usuario en tiempo real. 
    *   **Conexión Especial:** Incluye un **Switch de Modo Oscuro** que cambia el tema visual de toda la aplicación.

4.  **Fragment 4: Listas (ListView)**
    *   **Funcionalidad:** Visualización de colecciones de datos mediante un adaptador.
    *   **Interacción:** El usuario puede navegar por un catálogo de componentes; al seleccionar uno, se despliega su definición detallada en la parte inferior.
    *   **Explicación:** Las listas son fundamentales para manejar grandes volúmenes de información de manera eficiente.

5.  **Fragment 5: Elementos de Información (TextView, ImageView, ProgressBar)**
    *   **Funcionalidad:** Muestra datos estáticos, recursos gráficos y estados de carga.
    *   **Interacción:** Presenta barras de progreso (lineales y circulares) y visualización de iconos del sistema.
    *   **Explicación:** Estos elementos informan al usuario sobre el estado de la app y presentan el contenido visual principal.

---

## 2. Navegación
La navegación se gestiona mediante un **TabLayout** posicionado en la parte superior de la `MainActivity`. Este menú permite cambiar instantáneamente entre los 5 fragmentos, manteniendo una experiencia fluida y organizada.

---

## 3. Requisitos Técnicos Cumplidos
*   **Conexión entre Fragments:** Implementada mediante el control de **Modo Oscuro** global. Un cambio en el `SeleccionFragment` altera la apariencia de todos los demás fragmentos, demostrando persistencia y comunicación de estado.
*   **Diseño Limpio y Moderno:** Uso de `MaterialCardView`, espaciados consistentes y estilos de Material Design 3.
*   **Adaptabilidad:** Los layouts utilizan `ScrollView` para asegurar que el contenido sea accesible en pantallas de diversos tamaños.
*   **Idioma:** Toda la interfaz y las explicaciones técnicas están redactadas íntegramente en **español**.
*   **Persistencia de Estado:** La aplicación recuerda la pestaña activa incluso tras cambios de configuración (como activar el modo oscuro o rotar la pantalla).

---

## 4. Instrucciones de Uso
1.  Al abrir la app, utiliza las **pestañas superiores** para navegar entre las secciones.
2.  En la sección **"Texto"**, prueba a escribir tu nombre y presionar el botón.
3.  En la sección **"Selección"**, activa el interruptor de **Modo Oscuro** para cambiar el estilo visual de toda la app.
4.  En la sección **"Listas"**, toca cualquier elemento para leer su explicación técnica.
5.  Explora los botones e indicadores de progreso para ver la respuesta visual de la interfaz.

---

**Fecha de Entrega:** Viernes 06 de marzo de 2026.
**Entregables:** Código fuente en GitHub, capturas de pantalla de funcionamiento y este archivo README.
