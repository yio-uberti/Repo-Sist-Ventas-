package Modelos;
//Mapeo de java y sql
public class Modelo_Producto {
     //Atributos
    private String Cod_barra;
    private String Nombre;
    private String Tipo;
    private int Categoria;
    private double Precio_Actual;

    //Constructor vacio
    public Modelo_Producto() {
        this.Cod_barra = "";
        this.Nombre = "";
        this.Tipo = "";
        this.Precio_Actual = 0.0;
        this.Categoria = 0;
    }

    //Constructor sobrecargado
    public Modelo_Producto(String Cod_barra, String Nombre, String Tipo, int Categoria,double Precio_Actual) {
        this.Cod_barra = Cod_barra;
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Categoria = Categoria;
        this.Precio_Actual = Precio_Actual;
    }
    
    //Set and Get

    public String getCod_barra() {
        return Cod_barra;
    }

    public void setCod_barra(String Cod_barra) {
        this.Cod_barra = Cod_barra;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio_Actual() {
        return Precio_Actual;
    }

    public void setPrecio_Actual(double Precio_Actual) {
        this.Precio_Actual = Precio_Actual;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getCategoria() {
        return Categoria;
    }

    public void setCategoria(int Categoria) {
        this.Categoria = Categoria;
    }

        

}
