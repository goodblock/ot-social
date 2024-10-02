package ru.ot.social.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ot.social.api.model.User;
import ru.ot.social.api.model.UserRegisterBody;
import ru.ot.social.db.UserDb;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserAction {

    private final UserService userService;

    public String register( UserRegisterBody userRegisterBody ) {
        UserDb userDb = new UserConverter().toUserDb(userRegisterBody);
        userService.register(userDb);

        return userDb.getId();
    }

    public Optional<User> getById(String userId) {
        Optional<UserDb> userDb = userService.getUserById(userId);
        return userDb.map(e -> new UserConverter().toUser(e));
    }
}
