package petdata.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name ="petTypes")
public class PetType extends BaseEntity {

    @Column(name="name")
    private String name;
}
