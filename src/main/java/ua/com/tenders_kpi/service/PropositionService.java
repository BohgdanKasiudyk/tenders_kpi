package ua.com.tenders_kpi.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.tenders_kpi.domain.PropositionDto;
import ua.com.tenders_kpi.entity.Proposition;
import ua.com.tenders_kpi.mapper.PropositionMapper;
import ua.com.tenders_kpi.mapper.TenderMapper;
import ua.com.tenders_kpi.mapper.UserMapper;
import ua.com.tenders_kpi.repository.PropositionRepository;
import ua.com.tenders_kpi.repository.TenderRepository;
import ua.com.tenders_kpi.repository.UserRepository;

import java.util.List;


@Service
public class PropositionService {

    PropositionRepository propositionRepository;
    PropositionMapper propositionMapper;

    @Autowired
    public PropositionService(PropositionRepository propositionRepository, PropositionMapper propositionMapper) {
        this.propositionRepository = propositionRepository;
        this.propositionMapper = propositionMapper;
    }

    public Proposition create(PropositionDto propositionDto){
        Proposition proposition = propositionMapper.propositionDtoToEntity(propositionDto);
        return propositionRepository.save(proposition);

    }

    public List<Proposition> GetAllByTenderId(long id){

        return  propositionRepository.getAllByTender_Id(id);
    }
}
