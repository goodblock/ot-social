package ru.ot.social.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import org.springframework.validation.annotation.Validated;

@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen",
        date = "2024-09-05T00:15:48.243770487+03:00[Europe/Moscow]")
public class InlineResponse500   {
  @JsonProperty("message")
  private String message = null;

  @JsonProperty("request_id")
  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String requestId = null;

  @JsonProperty("code")
  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer code = null;


  public InlineResponse500 message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Описание ошибки
   * @return message
   **/
  @Schema(required = true, description = "Описание ошибки")
  @NotNull
  public String getMessage() {  
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InlineResponse500 requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Идентификатор запроса. Предназначен для более быстрого поиска проблем.
   * @return requestId
   **/
  @Schema(description = "Идентификатор запроса. Предназначен для более быстрого поиска проблем.")
  public String getRequestId() {  
    return requestId;
  }

  public void setRequestId(String requestId) { 
    this.requestId = requestId;
  }

  public InlineResponse500 code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Код ошибки. Предназначен для классификации проблем и более быстрого решения проблем.
   * @return code
   **/
  @Schema(description = "Код ошибки. Предназначен для классификации проблем и более быстрого решения проблем.")
  public Integer getCode() {  
    return code;
  }



  public void setCode(Integer code) { 
    this.code = code;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse500 inlineResponse500 = (InlineResponse500) o;
    return Objects.equals(this.message, inlineResponse500.message) &&
        Objects.equals(this.requestId, inlineResponse500.requestId) &&
        Objects.equals(this.code, inlineResponse500.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, requestId, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse500 {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
