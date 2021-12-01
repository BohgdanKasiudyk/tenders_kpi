package ua.com.tenders_kpi.mapper;
import org.springframework.stereotype.Component;
import ua.com.tenders_kpi.domain.PropositionDto;
import ua.com.tenders_kpi.entity.Proposition;

import java.util.HashSet;

@Component
public class PropositionMapper {

    public Proposition propositionDtoToEntity(PropositionDto propositionDto){
        if(propositionDto == null)
            return null;
        return Proposition.builder()
                .amount(propositionDto.getAmount())
                .reason(propositionDto.getReason())
                .build();
    }

}
