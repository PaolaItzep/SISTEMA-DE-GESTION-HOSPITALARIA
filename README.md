# 🏥 Sistema de Gestión Hospitalaria

Este proyecto es un **sistema de gestión hospitalaria** desarrollado en **Java**, diseñado para registrar médicos, pacientes y citas, así como gestionar la nómina de los trabajadores del hospital. Utiliza **Programación Orientada a Objetos (POO)**, herencia y polimorfismo para organizar las clases de manera eficiente.  

## 📂 Estructura del proyecto

| Archivo                 | Descripción                                   |
| ----------------------- | --------------------------------------------- |
| `TrabajadorMedico.java` | Clase abstracta base para los médicos        |
| `DoctorGeneral.java`    | Subclase de `TrabajadorMedico`               |
| `Cirujano.java`         | Subclase de `TrabajadorMedico`               |
| `Paciente.java`         | Clase que representa a un paciente           |
| `Cita.java`             | Clase que representa una cita médica         |
| `HospitalManager.java`  | Controlador que maneja médicos, pacientes y citas |
| `MainHospital.java`     | Clase principal que contiene el menú y ejecución |

## ⚙ Funcionalidades

1. Contratar médicos (`DoctorGeneral` y `Cirujano`).  
2. Registrar pacientes.  
3. Crear citas médicas con validación de conflictos.  
4. Listar citas.  
5. Mostrar nómina de médicos calculada según su tipo.

## 💻 Requisitos

- **Java JDK 11 o superior**  
- IDE recomendado: IntelliJ IDEA, Eclipse o NetBeans (opcional)  
- Terminal o consola para ejecutar el programa  

