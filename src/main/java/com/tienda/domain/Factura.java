package com.tienda.domain;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Factura")
public class Factura implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private long idFactura;
    private long idUsuario;
    private Date fecha; 
    private double total; 
    private int estado; 

    
    




    public Factura() {
    }


    public Factura(long idUsuario) {
        this.idUsuario = idUsuario;
        this.fecha = Calendar.getInstance().getTime();
        this.estado = 1; 
    }



    


}
