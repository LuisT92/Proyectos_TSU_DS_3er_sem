package LogIn;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import org.mindrot.jbcrypt.BCrypt;

import javax.swing.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Controller_LogIn {

    @FXML
    private Button salir;
    @FXML
    private TextField usuarioText;
    @FXML
    private PasswordField passwordText;
    @FXML
    private Label mensaje;



    public void ingresaOnAction(){
        if(usuarioText.getText().isEmpty() == false && passwordText.getText().isEmpty() == false){
            mensaje.setText("");
        }
        else{
            mensaje.setText("Ingresa un usuario y contraseña");
        }
        Connection conn = ConectaDb.coneccion();
        String nombre = usuarioText.getText();
        String contrasenia = passwordText.getText();
        boolean ver=false;
        String sql = "SELECT (contrasenia) FROM nuevo WHERE nombre = '" + nombre + "'";
        try{
            Statement exc = conn.createStatement();
            ResultSet rs = exc.executeQuery(sql);
            while(rs.next()){
                ver = hashver(contrasenia, sql);
            }
            if(ver == true){
                JOptionPane.showMessageDialog(null,"Bienvenido");
            }
            else{
                JOptionPane.showMessageDialog(null,"usuario o contraseña incorrectos");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public void salirOnAction(ActionEvent e) {
        Stage stage = (Stage) salir.getScene().getWindow();
        stage.close();
    }

    public void nuevoUsuarioOnAction() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("NuevoUsuario.fxml"));
        Stage registro = new Stage();
        registro.setTitle("Registro Nuevo Usuario");
        registro.setScene(new Scene(root, 455, 521));
        registro.show();
    }

    public boolean hashver(String pass, String hash){
        return BCrypt.checkpw(pass, hash);
    }
}
