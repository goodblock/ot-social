package ru.ot.social.db;

import lombok.Data;
import java.time.LocalDate;

@Data
public class UserDb {
    // todo uuid
    String id;
    String firstName;
    String secondName;
    LocalDate birthdate;
    String biography;
    String city;
    String password;
}
