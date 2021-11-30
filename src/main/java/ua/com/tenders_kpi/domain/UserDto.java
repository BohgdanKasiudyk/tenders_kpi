package ua.com.tenders_kpi.domain;

import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter

public class UserDto {
    String login;


    String password;

}
