package Builder;


public class BoletinBuilder extends ReporteConcreteBuilder {
    @Override
    public Boletin build() {
        Boletin boletin = new Boletin(titulo, fecha, autor, tipo, contenido, graficos);
        reset();
        return boletin;
    }
}