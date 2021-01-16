package api.parking.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Client {

    private String name;
    private String cpf;
    private String cnh;
    private int age;
    private Vehicle[] vehicles;

}
