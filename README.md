# FormacionJava - Ejercicios de Programación en Java

Este proyecto contiene una serie de ejercicios prácticos en Java, enfocados en la Programación Orientada a Objetos (POO). Cada ejercicio se encuentra organizado en su propio paquete dentro del proyecto.

## 📂 Estructura del Proyecto
El proyecto está dividido en los siguientes paquetes:

- `es.accenture.ejercicioEmpleados` → Gestión de empleados y cálculo de sueldos.
- `es.accenture.ejercicioPersona` → Representación de una persona con atributos básicos y cálculo del IMC.
- `es.accenture.ejercicioFilmoteca` → Gestión de películas y series con sistema de alquiler.
- `es.accenture.ejercicioLibros` → Gestión de libros con búsqueda por autor y comparación de páginas.

---

## 🚀 Ejercicios y Explicación

### **1️⃣ Gestión de Empleados** (`es.accenture.ejercicioEmpleados`)
- Se implementa una clase `Empleado` con atributos como **nombre, sueldo base, horas extra, estado civil e hijos**.
- Métodos destacados:
    - `calcularImporteHorasExtras()`: Calcula el total ganado por horas extra.
    - `calcularSueldoBruto()`: Calcula el sueldo base más horas extra.
    - `calcularRetencionIrpf()`: Aplica retención de IRPF considerando estado civil e hijos.
    - `calcularSueldo()`: Devuelve el sueldo final tras retenciones.
- Clase `SalariosEmpleados` para probar la funcionalidad.

### **2️⃣ Clase Persona y Cálculo de IMC** (`es.accenture.ejercicioPersona`)
- Se implementa una clase `Persona` con atributos como **nombre, sexo, edad, peso y altura**.
- Métodos destacados:
    - `esMayorDeEdad()`: Verifica si la persona es mayor de 18 años.
    - `calcularIMC()`: Calcula el Índice de Masa Corporal e indica si está en su peso ideal.
    - `toString()`: Muestra los datos personales, ocultando DNI, peso y altura si es menor de edad.
- Clase `PersonaApp` para solicitar los datos de la persona y calcular su IMC.

### **3️⃣ Gestión de Series y Películas** (`es.accenture.ejercicioFilmoteca`)
- Clases `Serie` y `Pelicula` con atributos como **título, género, creador/director y disponibilidad**.
- Métodos destacados:
    - `entregar()`: Marca la serie/película como alquilada.
    - `devolver()`: Marca la serie/película como disponible.
- Clase `Alquiler` para gestionar un catálogo de series y películas.

### **4️⃣ Gestión de Libros** (`es.accenture.ejercicioLibros`)
- Clase `Libro` con atributos como **título, ISBN, autor y número de páginas**.
- Métodos destacados:
    - `toString()`: Muestra los detalles del libro.
    - Comparación de libros para encontrar el que tiene más páginas.
    - Filtrado de libros por autor.
- Clase `LibroApp` para gestionar una biblioteca de libros.

---

## 🛠️ Instalación y Uso
1. Clona este repositorio:
   ```bash
   git clone https://github.com/tu-usuario/FormacionJava.git
   cd FormacionJava
   ```
2. Importa el proyecto en tu IDE favorito (Eclipse, IntelliJ, NetBeans).
3. Ejecuta las clases `main` de cada paquete para probar la funcionalidad.

---

## 📌 Notas
- Código optimizado siguiendo principios de POO.
- Métodos organizados para una fácil lectura y mantenimiento.
- Se pueden agregar más funciones para mejorar la gestión de los datos.

---

## 📝 Licencia
Este proyecto es de código abierto y puede ser utilizado con fines educativos.
🚀📚
---


