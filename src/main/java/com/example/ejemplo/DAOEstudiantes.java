package com.example.ejemplo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class DAOEstudiantes {
    private Connection connection;
    private PreparedStatement preQuery;
    private boolean worked = false;
    private EstudianteModel estudiante;
    private List<EstudianteModel> estudiantes;


}
