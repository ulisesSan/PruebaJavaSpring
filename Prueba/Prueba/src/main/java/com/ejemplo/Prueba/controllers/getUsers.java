package com.ejemplo.Prueba.controllers;
import com.conector.conector;
import com.ejemplo.Prueba.Modelos.users;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pruebaConexion")
public class getUsers {
    
    @GetMapping
    public ResponseEntity<HashMap<String, List<users>>> prueba(){
        users user = new users();
        HashMap<String, List<users>> users = new HashMap<>();
        Logger logger = Logger.getLogger(getUsers.class.getName());
        try(Statement Sql = conector.getConnection().createStatement()){
            List<users> usuarios = new ArrayList<>();
            String Query = "SELECT * FROM usuarios";
            ResultSet res = Sql.executeQuery(Query);

            while(res.next()){
                user.setID(res.getString(1));
                user.setNombre(res.getString(2));
                user.setAP(res.getString(3));
                user.setAm(res.getString(4));
                user.setStatus(res.getString(5));
                user.setDirection(res.getString(6));
                user.setPasswd(res.getString(7));
                user.setAdmission(res.getString(8));
                user.setPossition(res.getString(9));
                usuarios.add(user);
            }
            users.put("Users", usuarios);
            return ResponseEntity
            .status(HttpStatus.OK)
            .header("Content-type", "application/json")
            .body(users);
        }catch(SQLException sqlE){
            logger.warning(sqlE.toString());
            return null;
        }
    }
}