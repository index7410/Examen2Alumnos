package com.Alumno.Alumno.repositories;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

import com.Alumno.Alumno.models.AlumnoModel;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface AlumnoRepository extends CrudRepository<AlumnoModel, Long> {
    public abstract Optional<AlumnoModel> findbySexo(char sexo);
}
