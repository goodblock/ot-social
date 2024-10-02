package ru.ot.social.user;

import lombok.RequiredArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import ru.ot.social.db.UserDb;
import ru.ot.social.db.UserRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void register(UserDb userDb) {
        userRepository.save(userDb);
    }

    public Optional<UserDb> getUserById(String id ) {
        try {
            return Optional.of(userRepository.findById( id ));
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }
}
