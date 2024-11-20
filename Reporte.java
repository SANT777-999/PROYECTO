package Builder;

import java.util.List;

public class Reporte {
    private String titulo;
    private String fecha;
    private String autor;
    private String tipo;
    private String contenido;
    private List<Grafico> graficos;

    public Reporte(String titulo, String fecha, String autor, String tipo, String contenido, List<Grafico> graficos) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.autor = autor;
        this.tipo = tipo;
        this.contenido = contenido;
        this.graficos = graficos;
    }

    @Override
    public String toString() {
        return "Reporte{" +
                "titulo='" + titulo + '\'' +
                ", fecha='" + fecha + '\'' +
                ", autor='" + autor + '\'' +
                ", tipo='" + tipo + '\'' +
                ", contenido='" + contenido + '\'' +
                ", graficos=" + graficos +
                '}';
    }
}