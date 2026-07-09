public class Main {
    public static void main(String[] args) {
        System.out.println("--- SIMULACIÓN DE TIENDA ---\n");

        // Bloque try-catch para manejar posibles errores de precio
        try {
            // 3.a. Crear varios productos válidos
            Producto p1 = new Producto(1, "silla gamer", 800.0);
            Producto p2 = new Producto(2, "computadora", 150.0);
            Producto p3 = new Producto(3, "camiseta", 25.0);

            // 3.b. Crear un pedido
            Pedido miPedido = new Pedido();

            // 3.c. Agregar productos al pedido
            miPedido.agregarProducto(p1);
            miPedido.agregarProducto(p2);
            miPedido.agregarProducto(p3);

            System.out.println("\n--- RESULTADOS DEL PEDIDO ---");
            // 3.d. Imprimir el total antes y después del descuento
            double totalAntes = miPedido.calcularTotal();
            double totalDespues = miPedido.calcularTotalConDescuento();

            System.out.printf("Total antes del descuento: $%.2f\n", totalAntes);

            if (totalAntes != totalDespues) {
                System.out.println("¡Se ha aplicado un 10% de descuento por superar los $100!");
            } else {
                System.out.println("No aplica descuento (monto menor o igual al umbral).");
            }
            System.out.printf("Total final a pagar: $%.2f\n", totalDespues);

            System.out.println("\n--- PRUEBA DE VALIDACIÓN DE EXCEPCIONES ---");
            // Intentamos crear un producto con precio negativo para probar la validación (1.a y 1.b)
            Producto pInvalido = new Producto(4, "Audífonos pirata", -100.5);
            miPedido.agregarProducto(pInvalido); // Esta línea no llegará a ejecutarse

        } catch (PrecioNegativoException e) {
            // Captura el error y evita que el programa se caiga abruptamente
            System.out.println("Exception atrapada con éxito -> " + e.getMessage());
        }

        System.out.println("\nEl programa finalizó correctamente gracias al manejo de excepciones.");

    }

}