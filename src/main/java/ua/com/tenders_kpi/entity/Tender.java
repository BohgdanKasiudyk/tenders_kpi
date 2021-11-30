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
public class Tender {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    @Column(name = "tender_id")
    private Long id;

    @Column
    private String description;


    @ManyToOne
    @JsonIgnore
    private User creator;

    @Column
    private float maxPrice;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tender")
    private Set<Proposition> propositionSet;



}
