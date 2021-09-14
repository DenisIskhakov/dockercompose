package com.example.dockercompose.exception;

public class PersonNotFoundException extends Exception{

   public PersonNotFoundException(Long id) {
       super("Person is not found id = " + id);
   }

}