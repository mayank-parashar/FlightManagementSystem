package service;

import models.FareType;

import java.util.ArrayList;

public class FareTypeManager {
    ArrayList<FareType> fareTypes;

    public FareTypeManager() {
        this.fareTypes = new ArrayList<>();
    }

    public FareType add(String fareTypeStr, int price) {
        FareType fareType = new FareType(price, fareTypeStr);
        this.fareTypes.add(fareType);
        return fareType;
    }
}
