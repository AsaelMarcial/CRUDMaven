package com.example.ejemplo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOEstudiantes {
    private Connection connection;
    private PreparedStatement preQuery;
    private boolean worked = false;
    private EstudianteModel estudiante;
    private List<EstudianteModel> estudiantes;

    private final String[] consultas = {
            "INSERT INTO estudiante (primer_nom, primer_ape, seg_nom, seg_ape, activo) VALUES (?,?,?,?,?)",
            "SELECT * FROM estudiante WHERE idestudiante = ?;",
            "UPDATE estudiante SET primer_nom = ?, primer_ape=?, seg_nom=?, seg_ape=? WHERE (idestudiante=?):",
            "SELECT * FROM estudiante;"
    };

    public DAOEstudiantes(){
        connection = Connect2Db.getInstance().getConnection();
        estudiante = new EstudianteModel();
        estudiantes = new ArrayList<>();
    }

    public boolean createRecord(EstudianteModel model){
        System.out.println(model.getPrimer_nom() + " " +model.getPrimer_ape() );
        try{
            preQuery = connection.prepareStatement(consultas[0]);
            preQuery.setString(1, model.getPrimer_nom());
            preQuery.setString(2, model.getPrimer_ape());
            preQuery.setString(3, model.getSeg_nom());
            preQuery.setString(4, model.getSeg_ape());
            preQuery.setBoolean(5, model.isActivo());

            System.out.println(preQuery);
            if(preQuery.executeUpdate() > 0 ){
                worked = true;
            }
        }catch (SQLException ex){
            Logger.getLogger(DAOEstudiantes.class.getName()).log(Level.SEVERE,null,ex);
        }
        return worked;
    }
}
