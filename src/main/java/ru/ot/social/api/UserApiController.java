package ru.ot.social.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.ot.social.api.model.InlineResponse2001;
import ru.ot.social.api.model.User;
import ru.ot.social.api.model.UserRegisterBody;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.io.IOException;
import java.util.List;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-05T00:15:48.243770487+03:00[Europe/Moscow]")
@RestController
public class UserApiController implements UserApi {

    private static final Logger log = LoggerFactory.getLogger(UserApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    public UserApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<User> userGetIdGet(@Parameter(in = ParameterIn.PATH, description = "Идентификатор пользователя", required=true, schema=@Schema()) @PathVariable("id") String id
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<User>(objectMapper.readValue("{\n  \"birthdate\" : \"2017-02-01T00:00:00.000+00:00\",\n  \"city\" : \"Москва\",\n  \"second_name\" : \"Фамилия\",\n  \"id\" : \"id\",\n  \"biography\" : \"Хобби, интересы и т.п.\",\n  \"first_name\" : \"Имя\"\n}", User.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse2001> userRegisterPost(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody UserRegisterBody body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2001>(objectMapper.readValue("{\n  \"user_id\" : \"e4d2e6b0-cde2-42c5-aac3-0b8316f21e58\"\n}", InlineResponse2001.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2001>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2001>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<User>> userSearchGet(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Условие поиска по имени" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "first_name", required = true) String firstName
,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Условие поиска по фамилии" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "last_name", required = true) String lastName
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<User>>(objectMapper.readValue("[ {\n  \"birthdate\" : \"2017-02-01T00:00:00.000+00:00\",\n  \"city\" : \"Москва\",\n  \"second_name\" : \"Фамилия\",\n  \"id\" : \"id\",\n  \"biography\" : \"Хобби, интересы и т.п.\",\n  \"first_name\" : \"Имя\"\n}, {\n  \"birthdate\" : \"2017-02-01T00:00:00.000+00:00\",\n  \"city\" : \"Москва\",\n  \"second_name\" : \"Фамилия\",\n  \"id\" : \"id\",\n  \"biography\" : \"Хобби, интересы и т.п.\",\n  \"first_name\" : \"Имя\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<User>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
