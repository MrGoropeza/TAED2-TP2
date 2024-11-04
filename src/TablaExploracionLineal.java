public class TablaExploracionLineal extends ExploracionTablaHash {

    public TablaExploracionLineal() {
        super();
    }

    public TablaExploracionLineal(int tamanio) {
        super(tamanio);
    }

    @Override
    protected void confirmaBuscar(int posicionActual, String string) {
        System.out.println(string + ": " + posicionActual);
    }

    @Override
    protected int buscarPos(IHashable valor) {
        int posicionActual = valor.hash(vector.length);

        // Se usa sondeo lineal: se incrementa en 1 cada vez que ocurre una colisión.
        while (vector[posicionActual] != null && !vector[posicionActual].getElemento().equals(valor)) {
            posicionActual = (posicionActual + 1) % vector.length;
        }

        System.out.println(
                "El elemento: " + valor.toString() + " se encuentra/puede colocarse en la posición: " + posicionActual);
        return posicionActual;
    }
}