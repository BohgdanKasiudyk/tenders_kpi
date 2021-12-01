package ua.com.tenders_kpi.mapper;



import ua.com.tenders_kpi.entity.Tender;
import ua.com.tenders_kpi.domain.TenderDto;

import org.springframework.stereotype.Component;


import java.util.HashSet;

@Component
public class TenderMapper {

    public Tender tenderDtoToEntity(TenderDto tenderDto) {
       if(tenderDto == null)
           return null;
       return Tender.builder()
               .description(tenderDto.getDescription())
               .maxPrice(tenderDto.getMaxPrice())
               .propositionSet(new HashSet<>())
               .build();
    }
}
