package Builder;


public interface ReporteBuilder {
    ReporteBuilder setTitulo(String titulo);
    ReporteBuilder setFecha(String fecha);
    ReporteBuilder setAutor(String autor);
    ReporteBuilder setTipo(String tipo);
    ReporteBuilder setContenido(String contenido);
    ReporteBuilder agregarGrafico(String tipo, String datos);
    Reporte build();
}