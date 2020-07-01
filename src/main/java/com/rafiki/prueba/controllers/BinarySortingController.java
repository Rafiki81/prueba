package com.rafiki.prueba.controllers;


import com.rafiki.prueba.services.BinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
public class BinarySortingController {

    @Autowired
    BinaryService service;

    //Welcome EndPoint
    @GetMapping("/rafa")
    public ResponseEntity index(){
        return new ResponseEntity("Esta es la prueba para Intelygenz de Rafa Perez-Beato ", HttpStatus.OK);
    }

    //Sorting EndPoint
    @PostMapping("rafa/binary")
    public ResponseEntity binary(@RequestBody List<Integer> list){

        return new ResponseEntity(service.shortList(list),HttpStatus.OK);

    }

}
