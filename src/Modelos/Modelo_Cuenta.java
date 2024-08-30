package Modelos;

public class Modelo_Cuenta {
    
    private int id;
    private String descripcion;
    
    public Modelo_Cuenta(){
        this.descripcion = "";
        this.id = 0;
    }
    
    public Modelo_Cuenta (String descripcion){
        this.descripcion = descripcion;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return this.descripcion;
    }
    
    
}
