package com.tienda.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.domain.Venta;

public interface VentaDao extends JpaRepository<Venta, Long> {

}
