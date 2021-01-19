package api.parking.entity;

import api.parking.enums.Tier;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mensalist extends Client{

    private Tier tier;
    private double ammountPaid;

}
