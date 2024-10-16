/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.62).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package ru.ot.social.api;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import ru.ot.social.api.model.InlineResponse2001;
import ru.ot.social.api.model.InlineResponse500;
import ru.ot.social.api.model.User;
import ru.ot.social.api.model.UserRegisterBody;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.annotation.Generated;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen",
        date = "2024-09-05T00:15:48.243770487+03:00[Europe/Moscow]")
@Validated
public interface UserApi {

    @Operation(summary = "", description = "Получение анкеты пользователя", tags = {})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Успешное получение анкеты пользователя",
                    content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = User.class))),
            @ApiResponse(responseCode = "400", description = "Невалидные данные"),
            @ApiResponse(responseCode = "404", description = "Анкета не найдена"),
            @ApiResponse(responseCode = "500", description = "Ошибка сервера",
                    content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = InlineResponse500.class))),
            @ApiResponse(responseCode = "503", description = "Ошибка сервера",
                    content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = InlineResponse500.class)))})
    @RequestMapping(value = "/user/get/{id}",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<User> userGetIdGet(
            @Parameter(in = ParameterIn.PATH, description = "Идентификатор пользователя", required = true,
                    schema = @Schema())
            @PathVariable("id") String id
    );

    @Operation(summary = "", description = "Регистрация нового пользователя", tags = {})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Успешная регистрация",
                    content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = InlineResponse2001.class))),
            @ApiResponse(responseCode = "400", description = "Невалидные данные"),
            @ApiResponse(responseCode = "500", description = "Ошибка сервера",
                    content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = InlineResponse500.class))),
            @ApiResponse(responseCode = "503", description = "Ошибка сервера",
                    content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = InlineResponse500.class)))})
    @RequestMapping(value = "/user/register",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<InlineResponse2001> userRegisterPost(
            @Parameter(in = ParameterIn.DEFAULT, description = "", schema = @Schema())
            @Valid @RequestBody UserRegisterBody body
    );


    @Operation(summary = "", description = "Поиск анкет", tags = {})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Успешные поиск пользователя",
                    content = @Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = User.class)))),
            @ApiResponse(responseCode = "400", description = "Невалидные данные"),
            @ApiResponse(responseCode = "500", description = "Ошибка сервера",
                    content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = InlineResponse500.class))),
            @ApiResponse(responseCode = "503", description = "Ошибка сервера",
                    content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = InlineResponse500.class)))})
    @RequestMapping(value = "/user/search",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<List<User>> userSearchGet(
            @NotNull @Parameter(in = ParameterIn.QUERY, description = "Условие поиска по имени", required = true,
                    schema = @Schema()) @Valid @RequestParam(value = "first_name", required = true)
            String firstName
            , @NotNull @Parameter(in = ParameterIn.QUERY, description = "Условие поиска по фамилии", required = true,
            schema = @Schema()) @Valid @RequestParam(value = "last_name", required = true)
            String lastName
    );
}

