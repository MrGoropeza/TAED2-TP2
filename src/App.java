public class App {
    public static void main(String[] args) throws Exception {
        var revista = new RecursoBiblioteca(10, "Revista", RecursoBiblioteca.Tipo.REVISTA);

        // Implementación de la función hash H(x) = x mod 10 para un RecursoBiblioteca
        System.out.println("Hash de la revista: " + revista.hash(2));

        var tablaExploracionCuadratica = new TablaExploracionCuadratica();
        var tablaExploracionLineal = new TablaExploracionLineal();

        var libro = new RecursoBiblioteca(20, "Libro", RecursoBiblioteca.Tipo.OTRO);
        var audio = new RecursoBiblioteca(30, "Audio", RecursoBiblioteca.Tipo.AUDIO);
        var video = new RecursoBiblioteca(40, "Video", RecursoBiblioteca.Tipo.VIDEO);
        var imagen = new RecursoBiblioteca(50, "Imagen", RecursoBiblioteca.Tipo.IMAGEN);

        // Inserción de elementos en la tabla exploración cuadrática
        tablaExploracionCuadratica.insertar(revista);
        tablaExploracionCuadratica.insertar(libro);
        tablaExploracionCuadratica.insertar(audio);
        tablaExploracionCuadratica.insertar(video);
        tablaExploracionCuadratica.insertar(imagen);

        System.out.println("Tabla exploración cuadrática:");
        System.out.println(tablaExploracionCuadratica);

        // Inserción de elementos en la tabla exploración lineal
        tablaExploracionLineal.insertar(revista);
        tablaExploracionLineal.insertar(libro);
        tablaExploracionLineal.insertar(audio);
        tablaExploracionLineal.insertar(video);
        tablaExploracionLineal.insertar(imagen);

        System.out.println("Tabla exploración lineal:");
        System.out.println(tablaExploracionLineal);

        var tablaHashAbierta = new TablaHashAbierta();

        // Inserción de elementos en la tabla hash abierta
        tablaHashAbierta.insertar(revista);
        tablaHashAbierta.insertar(libro);
        tablaHashAbierta.insertar(audio);
        tablaHashAbierta.insertar(video);
        tablaHashAbierta.insertar(imagen);

        System.out.println("Tabla hash abierta:");
        System.out.println(tablaHashAbierta);

        // Implementación de Biblioteca que puede usar distintas estrategias para
        // manejar colisiones

        // Biblioteca con Hashing Abierto
        var biblioteca = new Biblioteca(EstrategiaColisiones.HASH_ABIERTA);

        // Biblioteca con Sondeo Lineal
        var bibliotecaLineal = new Biblioteca(EstrategiaColisiones.LINEAL);

        // Biblioteca con Sondeo Cuadrático
        var bibliotecaCuadrática = new Biblioteca(EstrategiaColisiones.CUADRATICA);
    }
}
