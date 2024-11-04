public interface ITablaHash {
    /**
     * Inserta un elemento en la tabla de hash
     * 
     * @param valor: elemento a insertar en la tabla.
     */
    void insertar(IHashable valor);

    /**
     * Elimina un elemento de la tabla de hash
     *
     * @param valor: elemento a borrar.
     */
    void eliminar(IHashable valor);

    /**
     * Busca un elemento en la tabla de hash
     * 
     * @param valor: elemento a buscar.
     * @return el elemento buscado o null si no existe.
     */
    IHashable buscar(IHashable valor);

    /**
     * Hace la tabla de hash lógicamente vacía.
     */
    void vaciar();
}
