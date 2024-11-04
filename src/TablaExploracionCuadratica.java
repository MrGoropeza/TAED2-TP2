public class TablaExploracionCuadratica extends ExploracionTablaHash {

    @Override
    protected void confirmaBuscar(int posicionActual, String string) {
        System.out.println(string + ": " + posicionActual);
    }

    @Override
    protected int buscarPos(IHashable valor) {
        int colision = 0;
        int posicionActual = valor.hash(vector.length);
        while (vector[posicionActual] != null && !vector[posicionActual].getElemento().equals(valor)) {
            posicionActual += 2 * ++colision - 1;
            if (posicionActual >= vector.length)
                posicionActual -= vector.length;
        }
        System.out.println(
                "El elemento: " + valor.toString() + " se encuentra/puede colocarse en la posición: " + posicionActual);
        return posicionActual;
    }

}
