package com.prueba.back.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.prueba.back.Model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{
	
	
			

}
