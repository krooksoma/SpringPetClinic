package petdata.domain;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name ="veterinarians")
public class Veterinarian extends Person{


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialties", joinColumns = @JoinColumn(name = "veterinarian_id"),
    inverseJoinColumns = @JoinColumn(name= "specialty_id"))
    private Set<Specialty> specialties = new HashSet<>();

}
