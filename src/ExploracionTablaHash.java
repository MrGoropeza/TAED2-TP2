public abstract class ExploracionTablaHash implements ITablaHash {

    private static final int TAMANIO_DEFAULT = 11;

    protected EntradaHash[] vector;

    private int tamanioActual;

    public ExploracionTablaHash() {
        crearVector(TAMANIO_DEFAULT);
        vaciar();
        this.tamanioActual = 0;
    }

    public ExploracionTablaHash(int tamanio) {
        crearVector(tamanio);
        vaciar();
        this.tamanioActual = 0;
    }

    public void insertar(IHashable valor) {
        int posisionActual = buscarPos(valor);
        vector[posisionActual] = new EntradaHash(valor, true);
    }

    public final void eliminar(IHashable valor) {
        int posisionActual = buscarPos(valor);
        confirmaBuscar(posisionActual, "eliminar de ExploracionTablaHash");
        vector[posisionActual].setEstaActivo(false);
    }

    public final IHashable buscar(IHashable valor) {
        int posisionActual = buscarPos(valor);
        confirmaBuscar(posisionActual, "buscar en ExploracionTablaHash");
        return vector[posisionActual].getElemento();
    }

    public final void vaciar() {
        this.tamanioActual = 0;
        for (int i = 0; i < this.vector.length; i++) {
            this.vector[i] = null;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Index\tValue\n");
        sb.append("---------------\n");

        for (int i = 0; i < vector.length; i++) {
            sb.append(i).append("\t").append(vector[i]).append("\n");
        }

        return sb.toString();
    }

    /**
     * Método abstracto para mostrar el resultado de la búsqueda.
     *
     * @param posisionActual: posición donde finaliza la búsqueda.
     * @param string:         mensaje de la búsqueda.
     */
    protected abstract void confirmaBuscar(int posicionActual, String string);

    /**
     * Método abstracto para la resolución de conflictos.
     * 
     * @param valor: elemento a buscar.
     * @return la posición donde finaliza la búsqueda.
     */
    protected abstract int buscarPos(IHashable valor);

    private final void crearVector(int tamanio) {
        this.vector = new EntradaHash[tamanio];
    }
}
