<p align="center">
  <img width="220" src="https://github.com/user-attachments/assets/9f09e6a1-45d3-4025-8081-c64e6ad5b44e">
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <img width="140" src="https://github.com/user-attachments/assets/79161b91-c36f-4462-ae72-6175fa87abe8">
</p>

<h2 align="center">🏛️ INSTITUTO POLITÉCNICO NACIONAL</h2>
<h3 align="center">💻 ESCUELA SUPERIOR DE CÓMPUTO</h3>
<p align="center"><b>Ingeniería en Sistemas Computacionales</b></p>

---

<p align="center">

**👨‍🏫 Profesor:**  
Gabriel Hurtado Avilés  

**👨‍🎓 Alumno:**  
Ricardo Carmona Martínez  

**👥 Grupo:**  
7CV4  

**📅 Fecha de entrega:**  
06 de marzo de 2026  

</p>

---

<h1 align="center">📱 ElementosUIApp</h1>
<h3 align="center">Guía Interactiva de Componentes de Interfaz de Usuario</h3>

---
# 📖 Descripción del Proyecto

**ElementosUIApp** es una aplicación desarrollada en **Android Studio** como parte de la **Tarea 1: Elementos Básicos de Interfaz de Usuario**.

El objetivo del proyecto es demostrar el uso de **Activities y Fragments** para explicar distintos **elementos de interfaz de usuario de Android**, permitiendo que el usuario interactúe con ellos y observe su funcionamiento dentro de una aplicación móvil.

La aplicación funciona como una **guía interactiva**, donde cada sección presenta ejemplos funcionales de distintos componentes de interfaz junto con una explicación breve de su uso.

---

# 🧱 Estructura de la Aplicación

La aplicación utiliza una arquitectura de **Actividad Única (Single Activity)** con un contenedor dinámico que permite cambiar entre **5 Fragments**, cada uno dedicado a explicar una categoría de elementos de interfaz.

Cada fragment contiene:

- Título descriptivo
- Ejemplo visual del componente
- Explicación breve
- Demostración interactiva

---

# 🧩 Fragments Implementados

## 🔤 Fragment 1: TextFields (EditText)

**Funcionalidad**

Permite la entrada de texto mediante el teclado utilizando el componente `EditText`.

**Interacción**

El usuario puede escribir su nombre y al presionar un botón recibe un **saludo personalizado dinámico**.

**Explicación**

Los campos de texto permiten capturar información del usuario y son ampliamente utilizados en **formularios, registros y sistemas de búsqueda**.

---

## 🔘 Fragment 2: Botones  
(Button, ImageButton, FloatingActionButton)

**Funcionalidad**

Demuestra diferentes tipos de botones utilizados para ejecutar acciones dentro de una aplicación.

**Interacción**

Al presionar:

- `Button`
- `ImageButton`
- `FloatingActionButton`

se actualiza una **tarjeta informativa** mostrando la descripción técnica del componente.

**Explicación**

Los botones permiten al usuario **realizar acciones dentro de la aplicación con un solo toque**, variando según su jerarquía visual.

---

## ☑️ Fragment 3: Elementos de Selección  
(CheckBox, RadioButton, Switch)

**Funcionalidad**

Permite manejar diferentes tipos de selección:

- Selección múltiple (`CheckBox`)
- Selección única (`RadioButton`)
- Estado binario (`Switch`)

**Interacción**

Un panel de resumen muestra **las elecciones del usuario en tiempo real**.

**Conexión especial**

Incluye un **Switch de Modo Oscuro**, el cual cambia el tema visual de toda la aplicación.

Esto demuestra **comunicación entre fragments y persistencia del estado de la interfaz**.

---

## 📋 Fragment 4: Listas (ListView)

**Funcionalidad**

Permite visualizar colecciones de datos mediante un **adaptador en ListView**.

**Interacción**

El usuario puede navegar por un catálogo de componentes y al seleccionar uno se muestra su **descripción técnica**.

**Explicación**

Las listas permiten manejar **grandes volúmenes de información de forma organizada y eficiente** dentro de aplicaciones móviles.

---

## 📊 Fragment 5: Elementos de Información  
(TextView, ImageView, ProgressBar)

**Funcionalidad**

Muestra componentes utilizados para presentar información al usuario.

**Elementos incluidos**

- `TextView`
- `ImageView`
- `ProgressBar`

**Interacción**

Se presentan **barras de progreso lineales y circulares**, además de iconos visuales.

**Explicación**

Estos elementos permiten comunicar al usuario **información visual y estados de carga dentro de una aplicación**.

---

# 🧭 Sistema de Navegación

La navegación dentro de la aplicación se gestiona mediante un **TabLayout** ubicado en la parte superior de la **MainActivity**.

Este menú permite cambiar instantáneamente entre los **5 fragments**, manteniendo una experiencia fluida y organizada.

---

# ⚙️ Requisitos Técnicos Cumplidos

✔ **Conexión entre Fragments**  
El modo oscuro modifica la apariencia de toda la aplicación desde el `SeleccionFragment`.

✔ **Diseño limpio y moderno**  
Uso de **MaterialCardView**, espaciados consistentes y principios de **Material Design 3**.

✔ **Adaptabilidad**  
Los layouts utilizan `ScrollView` para asegurar compatibilidad con diferentes tamaños de pantalla.

✔ **Idioma**  
Toda la interfaz y explicaciones se encuentran en **español**.

✔ **Persistencia de estado**  
La aplicación mantiene la pestaña activa incluso tras cambios de configuración como rotación de pantalla.

---

# 🚀 Instrucciones de Uso

1. Abrir la aplicación en el dispositivo o emulador.
2. Utilizar las **pestañas superiores** para navegar entre los fragments.
3. En **Texto**, escribir un nombre y presionar el botón.
4. En **Selección**, activar el **Modo Oscuro**.
5. En **Listas**, seleccionar elementos para visualizar su explicación.
6. Explorar los distintos botones y barras de progreso.

---

# ▶️ Cómo Ejecutar la Aplicación

## 📥 Descargar el Proyecto

1. Ingresar al repositorio del proyecto en **GitHub**.
2. Hacer clic en el botón **Code**.
3. Seleccionar **Download ZIP**.
4. Descomprimir el archivo descargado.

---

## 🛠️ Ejecutar en Android Studio

1. Abrir **Android Studio**.
2. Seleccionar **Open Project**.
3. Buscar la carpeta donde se encuentra el proyecto.
4. Esperar a que **Gradle sincronice las dependencias**.
5. Iniciar un **emulador desde el Device Manager** o conectar un dispositivo físico con depuración USB habilitada.
6. Presionar el botón **Run ▶** o utilizar el atajo:
Shift + F10

La aplicación se compilará e instalará automáticamente en el dispositivo seleccionado.

---

# 📸 Capturas de Funcionamiento

<p align="center">

<img width="30%" src="https://github.com/user-attachments/assets/d28f1c9a-120c-4aaf-a875-48fc1498f3d5">
<img width="30%" src="https://github.com/user-attachments/assets/3ab22e29-a538-473b-bc52-a68f9523b68e">
<img width="30%" src="https://github.com/user-attachments/assets/b6b5a579-382d-4afc-b98c-d233c838ab08">

<br>

<img width="30%" src="https://github.com/user-attachments/assets/ebb6216d-c288-4e02-9321-e10aa796e8de">
<img width="30%" src="https://github.com/user-attachments/assets/646aa980-988b-499f-b439-ed4e18f851c8">
<img width="30%" src="https://github.com/user-attachments/assets/8b83bfe6-b004-458c-a64c-dfd750f4200f">

</p>

---

# 📂 Entregables

✔ Código fuente completo del proyecto en **GitHub**  
✔ Capturas de funcionamiento de cada fragment  
✔ Archivo **README** con descripción e instrucciones de uso

---

# 🧑‍💻 Autor

**Ricardo Carmona Martínez**  
Estudiante de Ingeniería en Sistemas Computacionales  
Escuela Superior de Cómputo — IPN
