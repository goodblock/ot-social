package ru.ot.social;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
@Slf4j
public class PasswordEncoderTest {
    @Autowired
    private BCryptPasswordEncoder encoder;

    @Test
    @Disabled
    void encode_AdminPassword() {
        //$2a$10$VTkv7IoszeNQePRP4DJ5FOtLNT6RKrxjCGh.W07WKga4dcN97OQey
        log.warn("admin password =>:" + encoder.encode("password"));
    }
}
