package Modelos;

public class Modelo_Venta {
    
    private int id;
    private String Tipo;
    private String Hora;
    private double montoKiosco;
    private double montoComida;
    private double montoPanaderia;
    private double montoTotal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public double getMontoKiosco() {
        return montoKiosco;
    }

    public void setMontoKiosco(double montoKiosco) {
        this.montoKiosco = montoKiosco;
    }

    public double getMontoComida() {
        return montoComida;
    }

    public void setMontoComida(double montoComida) {
        this.montoComida = montoComida;
    }

    public double getMontoPanaderia() {
        return montoPanaderia;
    }

    public void setMontoPanaderia(double montoPanaderia) {
        this.montoPanaderia = montoPanaderia;
    }
    
    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double monto) {
        this.montoTotal = monto;
    }
    
}
