package application.bootstrap;

import petdata.model.PetOwner;
import petdata.model.PetType;
import petdata.model.Veterinarian;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import petdata.services.OwnerService;
import petdata.services.PetTypeService;
import petdata.services.VeterinarianService;


//by making a class a component it is converted to a bean, and it is part of the Spring Context
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VeterinarianService vetService;
    private final PetTypeService petTypeService;


    public DataLoader(OwnerService ownerService, VeterinarianService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("Labradoodle");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Siamese");
        PetType savedCatType = petTypeService.save(cat);

        PetOwner petOwner = new PetOwner();
        petOwner.setFirstName("Thomas");
        petOwner.setLastName("Moore");
        ownerService.save(petOwner);

        PetOwner petOwner1 = new PetOwner();


        petOwner1.setFirstName("Jim");
        petOwner1.setLastName("Beam");

        ownerService.save(petOwner1);

        System.out.println("----------Loaded Owners-----------");

        Veterinarian veterinarian = new Veterinarian();


        veterinarian.setFirstName("Jennifer");
        veterinarian.setLastName("Scary");

        vetService.save(veterinarian);

        Veterinarian veterinarian1 = new Veterinarian();


        veterinarian1.setFirstName("Jonas");
        veterinarian1.setLastName("Smith");

        vetService.save(veterinarian1);

        System.out.println("-----------Loaded Veterinarians------------");



    }
}
