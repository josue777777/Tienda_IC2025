package com.tienda.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.domain.Factura;

public interface FacturaDao extends JpaRepository<Factura, Long> {

}
