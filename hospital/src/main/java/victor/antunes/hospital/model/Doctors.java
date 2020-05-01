package victor.antunes.hospital.model;

import lombok.*;

/**
@Author Victor
@since 01/05/2020
 @Version ''Trabalho de Java com Lombok e Rest''
 */


@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Doctors {
    @Getter @Setter
    private String Team1;
    private String Schedules1;
    @Getter @Setter
    private String Team2;
    private String Schedules2;
    @Getter @Setter
    private String Team3;
    private String Schedules3;

}
