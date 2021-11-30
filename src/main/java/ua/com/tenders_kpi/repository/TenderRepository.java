package ua.com.tenders_kpi.repository;

import org.springframework.data.repository.CrudRepository;
import ua.com.tenders_kpi.entity.Tender;
import ua.com.tenders_kpi.entity.User;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TenderRepository extends CrudRepository<Tender, Long> {

        List<Tender> getAllByCreator_Id(long id);


}