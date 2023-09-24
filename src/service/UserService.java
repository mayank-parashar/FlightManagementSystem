package service;

import java.util.ArrayList;
import models.User;

public class UserService {
    ArrayList<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    public User addUser(String userId, String name, float fund) {
        User user = new User(userId, name, fund);
        this.users.add(user);
        return user;
    }

    public User getUser(String UserId) {
        for(User user: this.users) {
            if(user.userId.equals(UserId)) {
                return user;
            }
        }
        return null;
    }
}
