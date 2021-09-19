package com.Alumno.Alumno.services;

import java.lang.StackWalker.Option;
import java.util.ArrayList;

import com.Alumno.Alumno.models.AlumnoModel;
import com.Alumno.Alumno.repositories.AlumnoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Optionals;
import org.springframework.stereotype.Service;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Service
public class AlumnoService {
    @Autowired
    AlumnoRepository alumnoRepository;

    public ArrayList<AlumnoModel> obtenerAlumnoModels(){
        return (ArrayList<AlumnoModel>) alumnoRepository.findAll();

    }
    
    public AlumnoModel guardaraAlumno(AlumnoModel alumno) {
        return alumnoRepository.save(alumno);
    } 
     //Busqueda por sexo osea RPORTE SEXO
    public Optional<AlumnoModel> obtenerPorSexo(char sexo){
          return alumnoRepository.findbySexo(sexo);

    }
}
