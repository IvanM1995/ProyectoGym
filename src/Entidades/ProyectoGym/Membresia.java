/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades.ProyectoGym;

import java.math.BigDecimal;
import java.sql.Date;

/**
 *
 * @author Ivan
 */
public class Membresia {
     private int id_membresia;
    private Socio id_socio;
    private String tipo;
    private int cant_pases;
    private Date fecha_inicio;
    private Date fecha_fin;
    private BigDecimal costo;
    private boolean estado;
    

    public Membresia() {
    }

    public Membresia(Socio id_socio, int cant_pases, Date fecha_inicio, Date fecha_fin, BigDecimal costo, boolean estado, String tipo) {
        this.id_socio = id_socio;
        this.cant_pases = cant_pases;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.costo = costo;
        this.estado = estado;
        this.tipo = tipo;
    }

    public Membresia(int id_membresia, Socio id_socio, int cant_pases, Date fecha_inicio, Date fecha_fin, BigDecimal costo, boolean estado, String tipo) {
        this.id_membresia = id_membresia;
        this.id_socio = id_socio;
        this.cant_pases = cant_pases;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.costo = costo;
        this.estado = estado;
         this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public int getId_membresia() {
        return id_membresia;
    }

    public void setId_membresia(int id_membresia) {
        this.id_membresia = id_membresia;
    }

    public Socio getId_socio() {
        return id_socio;
    }

    public void setId_socio(Socio id_socio) {
        this.id_socio = id_socio;
    }

    public int getCant_pases() {
        return cant_pases;
    }

    public void setCant_pases(int cant_pases) {
        this.cant_pases = cant_pases;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Membresia " +  tipo ;
    }

    
}
