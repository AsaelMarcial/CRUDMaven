package com.example.ejemplo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.w3c.dom.Text;


public class HelloController {
    @FXML
    TextField txtFieldBuscar;
    @FXML
    TextField txtNombre;
    @FXML
    TextField txtSegundoNombre;
    @FXML
    TextField txtApellidoPaterno;
    @FXML
    TextField txtApellidoMaterno;


    public void btnBuscar(ActionEvent actionEvent) {

    }

    public void btnModificar(ActionEvent actionEvent) {
    }

    public void btnEliminar(ActionEvent actionEvent) {
    }

    public void btnAgregar(ActionEvent actionEvent) {
        DAOEstudiantes DAOestudiante = new DAOEstudiantes();
        EstudianteModel estudiante = new EstudianteModel();
        estudiante.setPrimer_nom(txtNombre.getText());
        estudiante.setPrimer_ape(txtApellidoPaterno.getText());
        estudiante.setSeg_ape(txtApellidoMaterno.getText());
        estudiante.setSeg_nom(txtSegundoNombre.getText());
        estudiante.setActivo(true);
        DAOestudiante.createRecord(estudiante);
    }
}