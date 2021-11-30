package ua.com.tenders_kpi.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    @Column(name = "user_id")
    private Long id;

    @Column
    private String login;

    @Column
    private String password;


    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "creator")
    private Set<Tender> tenderSet;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "creator")
    private Set<Proposition> propositionSet;


}
