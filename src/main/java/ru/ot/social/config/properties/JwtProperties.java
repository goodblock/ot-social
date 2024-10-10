package ru.ot.social.config.properties;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.validation.annotation.Validated;

//todo immu?
@Validated
@ConfigurationProperties(prefix = "jwt")
@ConfigurationPropertiesScan
@Getter
@Setter
public class JwtProperties {
    @NotBlank
    private String secret;
    @Min(1000)
    private int expirationMs;
}
