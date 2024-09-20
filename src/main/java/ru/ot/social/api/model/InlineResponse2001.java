package ru.ot.social.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import jakarta.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * InlineResponse2001
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-05T00:15:48.243770487+03:00[Europe/Moscow]")


public class InlineResponse2001   {
  @JsonProperty("user_id")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String userId = null;


  public InlineResponse2001 userId(String userId) { 

    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   **/
  
  @Schema(example = "e4d2e6b0-cde2-42c5-aac3-0b8316f21e58", description = "")
  
  public String getUserId() {  
    return userId;
  }



  public void setUserId(String userId) { 
    this.userId = userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.userId, inlineResponse2001.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
