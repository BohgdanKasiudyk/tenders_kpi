package ua.com.tenders_kpi.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.tenders_kpi.mapper.PropositionMapper;
import ua.com.tenders_kpi.mapper.TenderMapper;
import ua.com.tenders_kpi.mapper.UserMapper;
import ua.com.tenders_kpi.repository.PropositionRepository;
import ua.com.tenders_kpi.repository.TenderRepository;
import ua.com.tenders_kpi.repository.UserRepository;


@Service
public class UserService {
    PropositionRepository propositionRepository;
    TenderRepository tenderRepository;
    UserRepository userRepository;
    PropositionMapper propositionMapper;
    TenderMapper tenderMapper;
    UserMapper userMapper;

    @Autowired
    public UserService(PropositionRepository propositionRepository,
                       TenderRepository tenderRepository, UserRepository userRepository,
                       PropositionMapper propositionMapper, TenderMapper tenderMapper, UserMapper userMapper) {
        this.propositionRepository = propositionRepository;
        this.tenderRepository = tenderRepository;
        this.userRepository = userRepository;
        this.propositionMapper = propositionMapper;
        this.tenderMapper = tenderMapper;
        this.userMapper = userMapper;
    }





}
