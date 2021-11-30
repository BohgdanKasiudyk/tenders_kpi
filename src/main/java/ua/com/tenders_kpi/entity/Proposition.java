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
public class Proposition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    @Column(name = "tender_id")
    private Long id;


    @ManyToOne
    @JsonIgnore
    private User creator;

    @ManyToOne
    @JsonIgnore
    private User tender;

    @Column
    private float amount;

    @Column
    private String reason;


}
