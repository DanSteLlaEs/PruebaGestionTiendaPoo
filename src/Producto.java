public class Producto {

        private int id;
        private String nombre;
        private double precio;

        public Producto(int id, String nombre, double precio) throws PrecioNegativoException {
            if (precio < 0) {
                throw new PrecioNegativoException("Error: El precio del producto '" + nombre + "' no puede ser negativo (" + precio + ").");
            }
            this.id = id;
            this.nombre = nombre;
            this.precio = precio;
        }

        public int getId() { return id; }
        public void setId(int id) { this.id = id; }

        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }

        public double getPrecio() { return precio; }

        public void setPrecio(double precio) throws PrecioNegativoException {
            if (precio < 0) {
                throw new PrecioNegativoException("Error: No se puede asignar un precio negativo.");
            }
            this.precio = precio;
        }
    }

