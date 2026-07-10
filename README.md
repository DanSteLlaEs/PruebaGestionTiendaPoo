# Sistema de Gestión de Pedidos (GestionTienda)

Este es un sistema simple desarrollado en **Java** diseñado para gestionar el flujo de productos y pedidos dentro de una tienda. El proyecto fue construido aplicando los pilares de la Programación Orientada a Objetos (POO) y buenas prácticas de control de errores.

## 🛠️ Tecnologías Utilizadas
Lenguaje: Java (Versión 17).

IDE: IntelliJ IDEA

Control de Versiones: Git y GitHub.

## 🚀 Características y Requisitos Evaluados

El proyecto cumple con los siguientes requerimientos técnicos:

1. **Clases y Objetos (POO):** Modelado estructurado mediante las entidades `Producto` y `Pedido`.
2. **Encapsulamiento:** Atributos privados accesibles de forma segura únicamente mediante métodos públicos *Getters* y *Setters*.
3. **Colecciones (`ArrayList`):** Gestión dinámica de los productos agregados a un pedido sin depender de arrays con tamaño fijo.
4. **Lógica de Negocio y Control de Flujo:** 
   * Cálculo automático del total acumulado.
   * Aplicación de un **descuento del 10%** si el total del pedido supera el umbral de $100.
5. **Validaciones y Manejo de Excepciones:** 
   * Restricción para evitar el registro de productos con precios negativos.
   * Implementación de una excepción personalizada (`PrecioNegativoException`) capturada mediante un bloque estructurado `try-catch` para garantizar que el sistema no falle abruptamente.

## 📂 Estructura del Proyecto

El código fuente se encuentra organizado dentro del directorio `src` de la siguiente manera:

```text
src/
├── PrecioNegativoException.java  # Excepción personalizada para validar lógica de negocio.
├── Producto.java                 # Entidad que representa los artículos de la tienda.
├── Pedido.java                   # Clase que gestiona el carrito de compras y cálculos de totales.
└── Main.java                     # Punto de entrada de la aplicación y simulación del flujo.
