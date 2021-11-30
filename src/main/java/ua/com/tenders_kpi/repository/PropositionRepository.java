package ua.com.tenders_kpi.repository;


import org.springframework.data.repository.CrudRepository;
import ua.com.tenders_kpi.entity.Proposition;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PropositionRepository extends CrudRepository<Proposition, Long> {

    List<Proposition> getAllByTender_Id(long id);

}