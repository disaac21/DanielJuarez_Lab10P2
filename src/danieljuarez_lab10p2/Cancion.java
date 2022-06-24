package danieljuarez_lab10p2;

public class Cancion {
    
    public String Nombre;
    public String Categoria;
    public String Letra;

    public Cancion() {
    }

    public Cancion(String Nombre, String Categoria, String Letra) {
        this.Nombre = Nombre;
        this.Categoria = Categoria;
        this.Letra = Letra;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getLetra() {
        return Letra;
    }

    public void setLetra(String Letra) {
        this.Letra = Letra;
    }

    @Override
    public String toString() {
        return "Nombre: " + Nombre + "\nCategoria: " + Categoria + "\nLetra: " + Letra + "\n";
    }
    
}
