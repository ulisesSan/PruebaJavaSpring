package com.ejemplo.Prueba.Modelos;

public class users {
    private String id;
    private String nombre;
    private String Ap;
    private String Am;
    private String status_U;
    private String direction;
    private String passwd;
    private String admissionDate;
    private String position;


    //Set and get ID usuario
    public void setID(String ID){
        this.id = ID;
    }

    public String getID(){
        return id;
    }

    //set and get nombre
    public void setNombre(String Nombre){
        this.nombre = Nombre;
    }

    public String getNombte(){
        return nombre;
    }

    //set and get AP
    public void setAP(String AP){
        this.Ap =  AP;
    }

    public String getAP(){
        return Ap;
    }

    //set and get Am
    public void setAm(String AM){
        this.Am = AM;
    }

    public String getAm(){
        return Am;
    }

    //get and set status_u
    public void setStatus(String Status){
        this.status_U = Status;
    }

    public String getStatus(){
        return status_U;
    }

    //Set and get Direction

    public void setDirection(String Direction){
        this.direction = Direction;
    }

    public String getDirection(){
        return direction;
    }

    //set and get passwd
    public void setPasswd(String Passwd){
        this.passwd = Passwd;
    }

    public String getPasswd(){
        return passwd;
    }

    //get and set admissionDate
    public void setAdmission(String admission){
        this.admissionDate = admission;
    }

    public String getAdmission(){
        return admissionDate;
    }

    //set and get possition
    public void setPossition(String Possition){
        this.position = Possition;
    }

    public String getPossition(){
        return position;
    }
}
