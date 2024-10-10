package ru.ot.social.user;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ru.ot.social.api.model.User;
import ru.ot.social.api.model.UserRegisterBody;
import ru.ot.social.db.UserDb;

// todo mapstruct
@Component
@RequiredArgsConstructor
class UserConverter {
    private final PasswordEncoder passwordEncoder;

    UserDb toUserDb(UserRegisterBody userRegisterBody) {
        return new UserDb()
                .setFirstName(userRegisterBody.getFirstName())
                .setSecondName(userRegisterBody.getSecondName())
                .setBirthdate(userRegisterBody.getBirthdate())
                .setBiography(userRegisterBody.getBiography())
                .setCity(userRegisterBody.getCity())
                .setPassword(passwordEncoder.encode(userRegisterBody.getPassword()));
    }

    User toUser(UserDb userDb) {
        User user = new User();
        user.setId(userDb.getId());
        user.setFirstName(userDb.getFirstName());
        user.setSecondName(userDb.getSecondName());
        user.setBirthdate(userDb.getBirthdate());
        user.setCity(userDb.getCity());
        user.setBiography(userDb.getBiography());

        return user;
    }
}
