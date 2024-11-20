package Builder;

public class Grafico {
    private String tipo;
    private String datos;

    public Grafico(String tipo, String datos) {
        this.tipo = tipo;
        this.datos = datos;
    }

    @Override
    public String toString() {
        return "Grafico{" +
                "tipo='" + tipo + '\'' +
                ", datos='" + datos + '\'' +
                '}';
    }
}
