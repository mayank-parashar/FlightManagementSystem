package models;

import lombok.Data;

@Data
public class User extends BaseTable {
     final String name;
    private float fund;

    public final String userId;


    public User(String userId, String name, float fund) {
        this.userId = userId;
        this.name = name;
        this.fund = fund;
    }

    public float getFund() {
        return this.fund;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof User) {
            return ((User) obj).userId.equals(this.userId);
        }
        return false;
    }
}
