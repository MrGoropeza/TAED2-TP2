import java.util.LinkedList;
import java.util.List;

public class TablaHashAbierta implements ITablaHash {

    private static final int TAMANIO_DEFAULT = 10;
    protected List<EntradaHash>[] vector;
    private int tamanioActual;

    public TablaHashAbierta() {
        crearVector(TAMANIO_DEFAULT);
        vaciar();
        this.tamanioActual = 0;
    }

    public TablaHashAbierta(int tamanio) {
        crearVector(tamanio);
        vaciar();
        this.tamanioActual = 0;
    }

    public void insertar(IHashable valor) {
        int posicionActual = valor.hash(vector.length);
        List<EntradaHash> lista = vector[posicionActual];

        // Revisar si ya existe el valor en la lista para no duplicarlo
        for (EntradaHash entrada : lista) {
            if (entrada.getElemento().equals(valor)) {
                entrada.setEstaActivo(true); // Reactivar si estaba inactivo
                return;
            }
        }

        // Si no está en la lista, se añade una nueva entrada
        lista.add(new EntradaHash(valor, true));
        tamanioActual++;
    }

    public final void eliminar(IHashable valor) {
        int posicionActual = valor.hash(vector.length);
        List<EntradaHash> lista = vector[posicionActual];

        confirmaBuscar(posicionActual, "eliminar de TablaHashAbierta");

        for (EntradaHash entrada : lista) {
            if (entrada.getElemento().equals(valor)) {
                entrada.setEstaActivo(false);
                return;
            }
        }
    }

    public final IHashable buscar(IHashable valor) {
        int posicionActual = valor.hash(vector.length);
        List<EntradaHash> lista = vector[posicionActual];

        for (EntradaHash entrada : lista) {
            if (entrada.getElemento().equals(valor) && entrada.isEstaActivo()) {
                confirmaBuscar(posicionActual, "buscar en TablaHashAbierta");
                return entrada.getElemento();
            }
        }
        return null; // Valor no encontrado
    }

    public final void vaciar() {
        for (int i = 0; i < vector.length; i++) {
            vector[i].clear();
        }
        tamanioActual = 0;
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

    protected void confirmaBuscar(int posicionActual, String string) {
        System.out.println(string + ": " + posicionActual);
    }

    @SuppressWarnings("unchecked")
    private void crearVector(int tamanio) {
        this.vector = new LinkedList[tamanio];
        for (int i = 0; i < tamanio; i++) {
            vector[i] = new LinkedList<>();
        }
    }
}