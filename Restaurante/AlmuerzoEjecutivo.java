public class AlmuerzoEjecutivo extends Almuerzo {
    public AlmuerzoEjecutivo(boolean completo) {
        super("Almuerzo ejecutivo", 3.75, false, completo);
    }
    @Override
    public double obtenerDescuento(Cliente cliente) {
        return 1;
    }
}
