package com.Alumno.Alumno.controllers;

import java.util.ArrayList;

import com.Alumno.Alumno.models.AlumnoModel;
import com.Alumno.Alumno.services.AlumnoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {
    @Autowired
    AlumnoService alumnoService;

    @GetMapping()
    public ArrayList<AlumnoModel> obtenerAlumno(){
        return alumnoService.obtenerAlumnoModels();

    }

    @PostMapping()
    public AlumnoModel guardaralumno(@RequestBody AlumnoModel alumno){
             return this.alumnoService.guardaraAlumno(alumno);
    

    }

    
}
