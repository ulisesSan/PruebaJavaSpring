package com.ejemplo.Prueba.controllers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/collatz")
public class collatz {
    @GetMapping
    public static ResponseEntity<HashMap<String,List<String>>> conjetura(String number){
        HashMap<String, List<String>> collatzGuess = new HashMap<>();
        List<String> collatzNombers = new ArrayList<>();
        int getNumber;
        try{
            if(number == null || number == ""){
            collatzNombers.add("Se obtiene Cadena Vacia");
        }else{
            getNumber = Integer.parseInt(number);
            while(getNumber != 1){
                if(getNumber % 2 == 0){
                    getNumber = getNumber / 2 ;
                }else{
                    getNumber = getNumber * 3;
                    getNumber++;
                }
                collatzNombers.add(String.valueOf(getNumber));
            }
            collatzGuess.put("Numeros de Collatz", collatzNombers);
        }
        
        }catch(Exception ex){
            collatzNombers.add("Error: " + ex.toString());
        }
        return ResponseEntity
            .status(HttpStatus.OK)
            .header("content-type","Application/json")
            .body(collatzGuess);
    }
}
