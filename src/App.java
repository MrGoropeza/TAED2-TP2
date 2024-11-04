public class App {
    public static void main(String[] args) throws Exception {
        var tablaExploracionCuadratica = new TablaExploracionCuadratica();

        var revista = new RecursoBiblioteca(10, "Revista", RecursoBiblioteca.Tipo.REVISTA);

        // Implementación de la función hash H(x) = x mod 10
        System.out.println("Hash de la revista: " + revista.hash(2));

        var libro = new RecursoBiblioteca(20, "Libro", RecursoBiblioteca.Tipo.OTRO);
        var audio = new RecursoBiblioteca(30, "Audio", RecursoBiblioteca.Tipo.AUDIO);
        var video = new RecursoBiblioteca(40, "Video", RecursoBiblioteca.Tipo.VIDEO);
        var imagen = new RecursoBiblioteca(50, "Imagen", RecursoBiblioteca.Tipo.IMAGEN);

        tablaExploracionCuadratica.insertar(revista);
        tablaExploracionCuadratica.insertar(libro);
        tablaExploracionCuadratica.insertar(audio);
        tablaExploracionCuadratica.insertar(video);
        tablaExploracionCuadratica.insertar(imagen);
    }
}
