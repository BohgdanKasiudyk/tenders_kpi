package ua.com.tenders_kpi.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.tenders_kpi.domain.TenderDto;
import ua.com.tenders_kpi.entity.Tender;
import ua.com.tenders_kpi.mapper.PropositionMapper;
import ua.com.tenders_kpi.mapper.TenderMapper;
import ua.com.tenders_kpi.mapper.UserMapper;
import ua.com.tenders_kpi.repository.PropositionRepository;
import ua.com.tenders_kpi.repository.TenderRepository;
import ua.com.tenders_kpi.repository.UserRepository;

import java.util.List;


@Service
public class TenderService {

    TenderRepository tenderRepository;
    TenderMapper tenderMapper;

    @Autowired
    public TenderService(TenderRepository tenderRepository, TenderMapper tenderMapper) {
        this.tenderRepository = tenderRepository;
        this.tenderMapper = tenderMapper;
    }


    public Tender addTender(TenderDto tenderDto){

        Tender tender = tenderMapper.tenderDtoToEntity(tenderDto);
        return tenderRepository.save(tender);
    }


    public void delete(TenderDto tenderDto){
        tenderRepository.delete(tenderMapper.tenderDtoToEntity(tenderDto));

    }

    public List<Tender> getAll(){
            return (List<Tender>) tenderRepository.findAll();
    }


    public List<Tender> getAllByCreator(Long id){
        return tenderRepository.getAllByCreator_Id(id);

    }



}
