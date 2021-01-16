package api.parking.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class Space{

    private int column;

    private int row;

    private boolean isOccupied;

    private boolean preferred;

    private boolean mensalist;
}
