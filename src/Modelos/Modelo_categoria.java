package Modelos;

public class Modelo_categoria {
     
    private String descripcion;
    private int Id;
    
    public Modelo_categoria(){
        this.descripcion = "";
        this.Id = 0;
    }

    public Modelo_categoria(String descripcion) {
        this.descripcion = descripcion;
        this.Id = Id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   
}
