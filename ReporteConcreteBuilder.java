package Builder;

import java.util.ArrayList;
import java.util.List;

public class ReporteConcreteBuilder implements ReporteBuilder {
    protected String titulo;
    protected String fecha;
    protected String autor;
    protected String tipo;
    protected String contenido;
    protected List<Grafico> graficos = new ArrayList<>();

    @Override
    public ReporteConcreteBuilder setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    @Override
    public ReporteConcreteBuilder setFecha(String fecha) {
        this.fecha = fecha;
        return this;
    }

    @Override
    public ReporteConcreteBuilder setAutor(String autor) {
        this.autor = autor;
        return this;
    }

    @Override
    public ReporteConcreteBuilder setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    @Override
    public ReporteConcreteBuilder setContenido(String contenido) {
        this.contenido = contenido;
        return this;
    }

    @Override
    public ReporteConcreteBuilder agregarGrafico(String tipo, String datos) {
        this.graficos.add(new Grafico(tipo, datos));
        return this;
    }

    @Override
    public Reporte build() {
        Reporte reporte = new Reporte(titulo, fecha, autor, tipo, contenido, graficos);
        reset();
        return reporte;
    }

    protected void reset() {
        titulo = null;
        fecha = null;
        autor = null;
        tipo = null;
        contenido = null;
        graficos = new ArrayList<>();
    }
}

