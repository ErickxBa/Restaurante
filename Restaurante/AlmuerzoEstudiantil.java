public class AlmuerzoEstudiantil extends Almuerzo {

    public AlmuerzoEstudiantil(boolean completo) {
        super("Almuerzo estudiantil",2.75, true, completo);
    }

    @Override
    public double obtenerDescuento(Cliente cliente) {
        return cliente instanceof Estudiante ? 0.7 : 1;
    }
}
