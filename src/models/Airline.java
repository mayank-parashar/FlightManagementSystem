package models;

import lombok.Data;

@Data
public class Airline extends BaseTable {
    private String number;
    public Airline(String number) {
        this.number = number;
    }

    public String getNumber() {
        return this.number;
    }
}
