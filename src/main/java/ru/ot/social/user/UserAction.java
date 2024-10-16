package ru.ot.social.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ot.social.api.model.User;
import ru.ot.social.api.model.UserRegisterBody;
import ru.ot.social.db.UserDb;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserAction {

    private final UserDbService userDbService;
    private final UserConverter userConverter;

    public String register(UserRegisterBody userRegisterBody) {
        UserDb userDb = userConverter.toUserDb(userRegisterBody);
        userDbService.register(userDb);

        return userDb.getId();
    }

    public Optional<User> getById(String userId) {
        Optional<UserDb> userDb = userDbService.getById(userId);

        return userDb.map(e -> userConverter.toUser(e));
    }

    public List<User> searchByPrefixNames(String firstNamePref, String secondNamePref) {
        List<UserDb> userDbs = userDbService.searchByPrefixNames(firstNamePref, secondNamePref);

        return userDbs.stream()
                .map(e -> userConverter.toUser(e))
                .collect(Collectors.toUnmodifiableList());
    }
}
