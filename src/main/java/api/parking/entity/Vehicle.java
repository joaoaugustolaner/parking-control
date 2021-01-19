package api.parking.entity;

import api.parking.enums.Model;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Vehicle {

    private Client owner;
    private Model model;
    private String plate;

}
