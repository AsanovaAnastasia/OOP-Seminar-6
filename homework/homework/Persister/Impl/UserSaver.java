package homework.Persister.Impl;

import homework.User;
import homework.Persister.Persister;

public class UserSaver implements Persister {

    @Override
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}
