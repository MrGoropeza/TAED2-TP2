public class EntradaHash {

    private IHashable elemento;
    private boolean estaActivo;

    public EntradaHash(IHashable elemento, boolean estaActivo) {
        this.elemento = elemento;
        this.estaActivo = estaActivo;
    }

    public EntradaHash(IHashable elemento) {
        this.elemento = elemento;
        this.estaActivo = true;
    }

    public IHashable getElemento() {
        return elemento;
    }

    public void setEstaActivo(boolean estaActivo) {
        this.estaActivo = estaActivo;
    }

    public boolean isEstaActivo() {
        return estaActivo;
    }

    @Override
    public String toString() {
        return "(" + elemento.toString() + ", activo: " + estaActivo + ")";
    }
}
