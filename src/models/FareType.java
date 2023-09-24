package models;

import lombok.Data;

@Data
public class FareType extends BaseTable {
    int price;
    String fareType;

    public FareType(int price, String fareType) {
        this.fareType = fareType;
        this.price = price;
    }
}
