package models;
import java.time.LocalDateTime;

public class BaseTable {
    static int idCounter = 0;
    int id;
    LocalDateTime created;
    LocalDateTime updated;

    public BaseTable() {
        this.created = LocalDateTime.now();
        this.updated = LocalDateTime.now();
        this.id = idCounter++;
    }
}
