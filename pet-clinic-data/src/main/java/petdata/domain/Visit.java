package petdata.domain;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;


@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="visits")
public class Visit extends BaseEntity {

    @Column(name ="date")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate date;

    @NotNull
    @Column(name="description")
    private String description;

    //
    @ManyToOne
    @JoinColumn(name="pet_id")
    private Pet pet;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }


}
