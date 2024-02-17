package homework.Util;

import homework.User;
import homework.UserReporter;
import homework.UserRepository;
import homework.Persister.Persister;
import homework.Persister.Impl.UserSaver;

public class AppRunner {
    private AppRunner() {
        User user = new User("Bob");
        Persister persister = new UserSaver();
        UserRepository userRepository = new UserRepository(persister);
        UserReporter userReporter = new UserReporter();

        userReporter.report(user);
        userRepository.saveUser(user);
    }

    public static void run() {
        new AppRunner();
    }
}
