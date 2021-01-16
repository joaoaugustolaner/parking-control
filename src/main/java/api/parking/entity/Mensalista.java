package api.parking.entity;

import api.parking.enums.Tier;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Mensalista extends Client{

    private Tier tier;

}
