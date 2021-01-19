package api.parking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Space{

    private int column;

    private int row;

    private boolean isOccupied;

    private boolean preferred;

    private boolean mensalist;
}
