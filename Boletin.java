package Builder;

import java.util.List;

public class Boletin extends Reporte {
    public Boletin(String titulo, String fecha, String autor, String tipo, String contenido, List<Grafico> graficos) {
        super(titulo, fecha, autor, tipo, contenido, graficos);
    }

    @Override
    public String toString() {
        return "Boletin{" +
                "titulo='" + super.toString() + '\'' +
                '}';
    }
}