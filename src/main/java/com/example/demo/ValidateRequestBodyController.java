package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ValidateRequestBodyController {

    @RequestMapping(method = RequestMethod.POST, value = "/validateBody")
    ResponseEntity<?> validateBody(@Valid @RequestBody Employee emp){
        return ResponseEntity.ok("valid");
      }

}
