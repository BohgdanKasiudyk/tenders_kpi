package ua.com.tenders_kpi.repository;


import ua.com.tenders_kpi.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

    User findUserByLogin(String login);



}
