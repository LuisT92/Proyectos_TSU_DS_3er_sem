package LogIn;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import org.mindrot.jbcrypt.BCrypt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistroControlador {
    @FXML
    private Button registroBoton;
    @FXML
    private Button salir;
    @FXML
    private TextField nuevoUsuario;
    @FXML
    private PasswordField contra;

    Connection conn = ConectaDb.coneccion();
    String psscode;



    public String hash(String pass){
        return BCrypt.hashpw(pass,BCrypt.gensalt());
    }

    public void registrarOnAction(){
        Connection conn = ConectaDb.coneccion();
        try {
            String nombre = nuevoUsuario.getText();
            String psd = contra.getText();
            psscode=hash(psd);
            String insert = "insert into usuario (nombre, contrasenia) values(?,?)";
            PreparedStatement pst = conn.prepareStatement(insert);
            pst.setString(1,nombre);
            pst.setString(2,psscode);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void salirRegistroOnAction(){
        Stage stage = (Stage) salir.getScene().getWindow();
        stage.close();
    }
}
