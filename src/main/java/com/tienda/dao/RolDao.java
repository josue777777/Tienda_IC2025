package com.tienda.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.domain.Rol;



public interface RolDao extends JpaRepository<Rol, Long> {



}