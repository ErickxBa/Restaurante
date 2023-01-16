public abstract class Almuerzo {
    private final double precioAlmuerzo;
    private final String nombre;
    private final boolean Descuento;
    private final boolean almumerzocompleto;

    public Almuerzo(String nombre, double precioNormal, boolean esPosibleDescuento, boolean completo) {
        this.precioAlmuerzo = precioNormal;
        this.Descuento = esPosibleDescuento;
        this.almumerzocompleto = completo;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    public double obtenerCobro(Cliente cliente) {
        double cobro = descontarSopa(getPrecioAlmuerzo());
        if (!permiteDescuento()) {
            return cobro;
        }
        return cobro * obtenerDescuento(cliente);
    }

    public double getPrecioAlmuerzo() {
        return this.precioAlmuerzo;
    }

    public boolean permiteDescuento() {
        return this.Descuento;
    }

    public boolean esCompleto() {
        return this.almumerzocompleto;
    }

    public double descontarSopa(double precioTotal) {
        return esCompleto() ? precioTotal : precioTotal - 0.75;
    }

    public abstract double obtenerDescuento(Cliente cliente);
}