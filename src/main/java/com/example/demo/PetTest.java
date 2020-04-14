package com.example.demo;

//main class
public class PetTest {
    public static void main (){
        PetStoreModel petModel = new PetStoreModel("01","Latte",2,"Masculine","Scottish Fold");
        System.out.println(petModel.toString());

        //getter -> get result | setter -> set value.
        PetStoreModel petModel2 = new PetStoreModel();
        petModel2.setId("01");
        petModel2.setPetName("Latte");
        petModel2.setAge(2);
        petModel2.setPetGender("Masculine");
        petModel2.setPetSpecies("Scottish Fold");

        System.out.println(petModel2.getId());
        System.out.println(petModel2.getPetName());
        System.out.println(petModel2.getPetGender());
        System.out.println(petModel2.getPetSpecies());

    }
}
