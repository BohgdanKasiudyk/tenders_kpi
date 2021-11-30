package ua.com.tenders_kpi.domain;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class PropositionDto {

    float amount;

    String reason;

}
