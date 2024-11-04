public class RecursoBiblioteca implements IHashable {
    public enum Tipo {
        AUDIO, VIDEO, IMAGEN, PAPER, REVISTA, OTRO
    }

    private Integer codigo;
    private String titulo;
    private Tipo tipo;

    public RecursoBiblioteca(Integer codigo, String titulo, Tipo tipo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.tipo = tipo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hash(int tableSize) {
        return this.codigo % 10;
    }

    @Override
    public String toString() {
        return "(" + codigo + ", " + titulo + ", " + tipo + ")";
    }
}
