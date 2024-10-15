package Modelos;

import java.time.LocalDateTime;

public class Modelo_Venta {
    
    private int id;
    private String Tipo;
    private LocalDateTime Hora;
    private int Cuenta;
    private double montoKiosco;
    private double montoComida;
    private double montoPanaderia;
    private double montoDulce;
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

    public LocalDateTime getHora() {
        return Hora;
    }

    public void setHora(LocalDateTime Hora) {
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

    public double getMontoDulce() {
        return montoDulce;
    }

    public void setMontoDulce(double montoPostre) {
        this.montoDulce = montoPostre;
    }

    public int getCuenta() {
        return Cuenta;
    }

    public void setCuenta(int Cuenta) {
        this.Cuenta = Cuenta;
    }
    
    
    
}
