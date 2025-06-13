# Pizzería Java App

Sistema de gestión de productos para una pizzería, desarrollado en Java utilizando Programación Orientada a Objetos (OOP). Permite administrar un menú de pizzas y bebidas, simular pedidos y mostrar totales mediante un menú interactivo por consola.


## 📖 Descripción del Proyecto

Este proyecto Permite gestionar un menú de productos (pizzas y bebidas), realizar pedidos y mostrar un total, todo a través de una interfaz de línea de comandos.

Incluye lógica de negocio, herencia y un menú interactivo para el usuario. Cada clase está comentada y documentada con claridad para facilitar la comprensión del flujo del programa.



# Tecnologías Utilizadas

- Java 8+
- Programación Orientada a Objetos (OOP)
- Consola (CLI)



# Estructura del Proyecto

```
Final/
└── src/
    ├── Main.java
    ├── Producto.java
    ├── Pizza.java
    ├── Bebida.java
    └── Pizzeria.java
```

# Diagrama UML
![alt text](../OneDrive/Imágenes/Escritorio/Final/UML.jpg)

# Clases Principales

- **`Producto.java`**\
  Clase abstracta que representa un producto genérico de la pizzería. Contiene atributos comunes como nombre y precio.\
  *"Se establecen métodos abstractos para forzar la implementación específica en las subclases."*

- **`Pizza.java`**\
  Subclase de `Producto` que representa una pizza. Incluye atributos específicos como tamaño y lista de ingredientes.\
   *"En el constructor, se inicializa el nombre concatenando los ingredientes y tamaño para facilitar la lectura del menú."*

- **`Bebida.java`**\
  Subclase de `Producto` que representa una bebida. Puede incluir atributos como tipo (refresco, jugo, etc.) y tamaño.\
  *"Se añade una validación para asegurar que el tipo de bebida no esté vacío, mejorando la robustez del sistema."*

- **`Pizzeria.java`**\
  Clase principal que gestiona el inventario y los pedidos.\
   *"Se utiliza una lista de tipo Producto para permitir polimorfismo entre pizzas y bebidas al momento de mostrar el menú o calcular el total."*

- **`Main.java`**\
  Punto de entrada del programa. Contiene el menú interactivo y la simulación de funcionamiento.\
   *"Se aplica estructura **`while(true)`** con **`switch`** para permitir navegación continua hasta que el usuario decida salir. También se emplean mensajes de consola para una experiencia más amena."*



# Funcionalidades

- Añadir productos al menú (pizzas y bebidas).
- Mostrar el menú de productos disponibles.
- Calcular el total de un pedido.
- Menú interactivo con validaciones y mensajes dinámicos.
- Uso de herencia, abstracción y polimorfismo.



# Roles del Proyecto

Este proyecto fue desarrollado en equipo, y cada integrante asumió un rol clave en el desarrollo. A continuación se detallan sus responsabilidades:

## Estefany – Documentadora

Encargada de toda la documentación del proyecto. Su trabajo incluye:

- Redactar el `README.md` y describir las funcionalidades del sistema.
- Explicar las clases, métodos y estructura general del código.
- Garantizar que el proyecto sea comprensible y presentable para cualquier lector externo.



## Sofía – Diseñadora de Herencias

Responsable de la arquitectura de clases usando herencia. Se encargó de:

- Diseñar la clase abstracta `Producto` y las subclases `Pizza` y `Bebida`.
- Aplicar principios de programación orientada a objetos como herencia, abstracción y polimorfismo.
- Estructurar el sistema de forma clara y extensible.


## Mauricio – Lógica de Código

Encargado de implementar la funcionalidad del sistema. Su trabajo incluyó:

- Escribir la clase `Pizzeria` y sus métodos para gestionar productos y pedidos.
- Controlar el flujo del programa desde `Main.java`.
- Asegurar que el sistema funcione correctamente, desde agregar productos hasta calcular totales.


## Juan – Encargado de Menú e Integración de Módulos

Encargado de desarrollar el flujo interactivo del sistema por consola. Su trabajo incluyó:

- Implementar el menú principal utilizando estructuras de control como `while` y `switch`.
- Integrar métodos desarrollados por otros miembros, como `validarCodigo` y `calcularPrecioTotal`.
- Mejorar la experiencia de usuario con mensajes claros y detalles humorísticos (como facturas falsas).
- Entregar una experiencia fluida y funcional, incluyendo un GIF demostrativo.


