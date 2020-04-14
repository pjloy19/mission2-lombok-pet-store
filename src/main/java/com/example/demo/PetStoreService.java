package com.example.demo;

import org.apache.coyote.Response;
import org.springframework.stereotype.Service;
import java.util.*;

@Service //annotates classes at the service layer (logic)
public class PetStoreService {
    private static List<PetStoreModel> petStoreModelList = new ArrayList<>(Arrays.asList(
            new PetStoreModel("1","Gon-mek",8,"Girl","Persian Chinchilla"),
            new PetStoreModel("2","Blueberry",6,"Girl","British Shorthair"),
            new PetStoreModel("3","Latte",2,"Boy","Scottish Fold")
    ));

    //get all list
    public List<PetStoreModel> getPetStoreModelList(){
        return petStoreModelList;
    }

    //get pet when passing id
    public PetStoreModel getPet(String id){
        return petStoreModelList.stream().filter(pet -> pet.getId().equals(id)).findFirst().get();
    }

    //add pet when method = post
    public static void addPet(PetStoreModel pet){
        petStoreModelList.add(pet);
    }

    //put data
    public static void updatePet(PetStoreModel pet, String id){
        int counter = 0;
        for (PetStoreModel pet1 : petStoreModelList){
            if (pet1.getId().equals(id)){
                petStoreModelList.set(counter, pet);
            }
            counter++;
        }
    }

    //delete data
    public static void deletePet(String id){
        petStoreModelList.removeIf(pet -> pet.getId().equals(id));
    }
}
