// Archivo: Pedido.java
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    // Lista de productos (Uso de colecciones)
    private List<Producto> listaProductos;

    // Constructor
    public Pedido() {
        this.listaProductos = new ArrayList<>();
    }

    // Método para agregar productos
    public void agregarProducto(Producto producto) {
        if (producto != null) {
            listaProductos.add(producto);
            System.out.println("Producto añadido: " + producto.getNombre());
        }
    }

    // Método para calcular el total bruto (sin descuento)
    public double calcularTotal() {
        double total = 0;
        for (Producto p : listaProductos) {
            total += p.getPrecio(); // Sumamos el precio de cada producto
        }
        return total;
    }

    // Método para aplicar el descuento del 10% si supera un umbral (ejemplo: 100)
    public double calcularTotalConDescuento() {
        double total = calcularTotal();
        double umbralDescuento = 100.0; //

        if (total > umbralDescuento) {
            return total * 0.90; //
        }
        return total; //
    }
}
