package ua.com.tenders_kpi.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TenderWrapper {

    TenderDto tenderDto;

    PropositionDto propositionDto;

    UserDto userDto;
}
