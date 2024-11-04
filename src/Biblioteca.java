public class Biblioteca {

    private ITablaHash tabla;
    private EstrategiaColisiones estrategia;

    public Biblioteca(EstrategiaColisiones estrategia) {
        this.estrategia = estrategia;

        switch (estrategia) {
            case CUADRATICA:
                this.tabla = new TablaExploracionCuadratica();
                break;
            case LINEAL:
                this.tabla = new TablaExploracionLineal();
                break;
            case HASH_ABIERTA:
                this.tabla = new TablaHashAbierta();
                break;
            default:
                this.tabla = new TablaExploracionCuadratica();
        }
    }

    public void addRecurso(RecursoBiblioteca recurso) {
        this.tabla.insertar(recurso);
    }

    public void addRecursos(RecursoBiblioteca... recursos) {
        for (RecursoBiblioteca recurso : recursos) {
            this.tabla.insertar(recurso);
        }
    }

    public RecursoBiblioteca findRecurso(RecursoBiblioteca recurso) {
        return (RecursoBiblioteca) this.tabla.buscar(recurso);
    }

    public void removeRecurso(RecursoBiblioteca recurso) {
        this.tabla.eliminar(recurso);
    }

    @Override
    public String toString() {
        System.out.println("Recursos de la biblioteca (utilizando estrategia de colisiones " + this.estrategia + "):");
        return this.tabla.toString();
    }

}
