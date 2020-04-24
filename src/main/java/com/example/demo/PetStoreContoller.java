package com.example.demo;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
public class PetStoreContoller {
    @Autowired //Auto wired Bean dependency thru setter
    private PetStoreService petStoreService;

    //return all
    @RequestMapping("/pet")
    public List<PetStoreModel> getPetStore(){
        return petStoreService.getPetStoreModelList();
    }

    //return when passing id
    @RequestMapping("/pet/{id}")
    public PetStoreModel getPet(@PathVariable("id") String id){
        return petStoreService.getPet(id);
    }

    //POST data
    @RequestMapping(method = RequestMethod.POST, value = "/pet")
    public void addPet(@RequestBody PetStoreModel pet){
        PetStoreService.addPet(pet);
    }

    //PUT data
    @RequestMapping(method = RequestMethod.PUT, value = "/pet/{id}")
    public void updatePet(@RequestBody PetStoreModel pet, @PathVariable("id") String id){
        PetStoreService.updatePet(pet, id);
    }

    //DEL data
    @RequestMapping(method = RequestMethod.DELETE, value = "/pet/{id}")
    public void deletePet(@PathVariable("id") String id){
        PetStoreService.deletePet(id);
    }
}


