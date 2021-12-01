package ua.com.tenders_kpi.mapper;

import ua.com.tenders_kpi.entity.User;
import ua.com.tenders_kpi.domain.UserDto;

import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class UserMapper {

    public User userDtoToEntity(UserDto userDto) {
        if(userDto == null)
            return null;
        return User.builder()
                .login(userDto.getLogin())
                .password(userDto.getPassword())
                .propositionSet(new HashSet<>())
                .tenderSet(new HashSet<>())
                .build();

    }

}
