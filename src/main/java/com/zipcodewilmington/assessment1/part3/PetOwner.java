package com.zipcodewilmington.assessment1.part3;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    private String name;
    private Pet[] pets;

    public void setName(String name) {
        this.name = name;
    }
    public void setPets(Pet[] pets) {
        this.pets = pets;
    }

    public PetOwner(String name, Pet... pets) {
    this.name = name;
    this.pets = pets;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
    Pet[] addedPet = new Pet[getNumberOfPets()+1];
    addedPet[addedPet.length-1] = pet;
    pets = addedPet;
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
    int lengthOfPets = getPets().length;
        Pet[] removedPet = new Pet[lengthOfPets];
    Pet[] oldPetArray = new Pet[getPets().length];
    oldPetArray = getPets();
    int removedPetIndex = -1;
    for (int i = 0; i < oldPetArray.length; i++){
        if(!oldPetArray[i].equals(pet)){
            removedPet[removedPetIndex] = oldPetArray[i];
            removedPetIndex++;
        } else;
    }
    pets = removedPet;
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {

        if(name.contains((CharSequence) pet)){
           return true;
       } else{
        return false;
       }
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {

        return null;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        return null;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        return null;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return pets;
    }
}
