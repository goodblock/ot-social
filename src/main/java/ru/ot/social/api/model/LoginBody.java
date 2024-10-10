package ru.ot.social.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * LoginBody
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen",
        date = "2024-09-05T00:15:48.243770487+03:00[Europe/Moscow]")
public class LoginBody {
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String id = null;

    @JsonProperty("password")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
    @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
    private String password = null;


    public LoginBody id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Идентификатор пользователя
     *
     * @return id
     **/

    @Schema(description = "Идентификатор пользователя")
    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    public LoginBody password(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get password
     *
     * @return password
     **/
    @Schema(example = "Секретная строка", description = "")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoginBody loginBody = (LoginBody) o;
        return Objects.equals(this.id, loginBody.id) &&
                Objects.equals(this.password, loginBody.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoginBody {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
