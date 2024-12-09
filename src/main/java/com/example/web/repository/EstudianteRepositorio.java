package com.example.web.repository;

import com.example.web.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Extiende JpaRepository para proporcionar métodos CRUD listos para usar:
//findAll, save, findById, deleteById.
@Repository
public interface EstudianteRepositorio extends JpaRepository<Estudiante, Long> {

}
