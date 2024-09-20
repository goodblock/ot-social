package ru.ot.social.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.time.LocalDate;
import java.util.Objects;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

/**
 * User
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-05T00:15:48.243770487+03:00[Europe/Moscow]")
public class User {
  @JsonProperty("id")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String id = null;

  @JsonProperty("first_name")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String firstName = null;

  @JsonProperty("second_name")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String secondName = null;

  @JsonProperty("birthdate")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private LocalDate birthdate = null;

  @JsonProperty("biography")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String biography = null;

  @JsonProperty("city")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String city = null;


  public User id(String id) { 

    this.id = id;
    return this;
  }

  /**
   * Идентификатор пользователя
   * @return id
   **/
  
  @Schema(description = "Идентификатор пользователя")
  
  public String getId() {  
    return id;
  }



  public void setId(String id) { 
    this.id = id;
  }

  public User firstName(String firstName) { 

    this.firstName = firstName;
    return this;
  }

  /**
   * Имя
   * @return firstName
   **/
  
  @Schema(example = "Имя", description = "Имя")
  
  public String getFirstName() {  
    return firstName;
  }



  public void setFirstName(String firstName) { 
    this.firstName = firstName;
  }

  public User secondName(String secondName) { 

    this.secondName = secondName;
    return this;
  }

  /**
   * Фамилия
   * @return secondName
   **/
  
  @Schema(example = "Фамилия", description = "Фамилия")
  
  public String getSecondName() {  
    return secondName;
  }



  public void setSecondName(String secondName) { 
    this.secondName = secondName;
  }

  public User birthdate(LocalDate birthdate) { 

    this.birthdate = birthdate;
    return this;
  }

  /**
   * Дата рождения
   * @return birthdate
   **/
  
  @Schema(example = "Wed Feb 01 03:00:00 MSK 2017", description = "Дата рождения")
  
@Valid
  public LocalDate getBirthdate() {  
    return birthdate;
  }



  public void setBirthdate(LocalDate birthdate) { 
    this.birthdate = birthdate;
  }

  public User biography(String biography) { 

    this.biography = biography;
    return this;
  }

  /**
   * Интересы
   * @return biography
   **/
  
  @Schema(example = "Хобби, интересы и т.п.", description = "Интересы")
  
  public String getBiography() {  
    return biography;
  }



  public void setBiography(String biography) { 
    this.biography = biography;
  }

  public User city(String city) { 

    this.city = city;
    return this;
  }

  /**
   * Город
   * @return city
   **/
  
  @Schema(example = "Москва", description = "Город")
  
  public String getCity() {  
    return city;
  }



  public void setCity(String city) { 
    this.city = city;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.secondName, user.secondName) &&
        Objects.equals(this.birthdate, user.birthdate) &&
        Objects.equals(this.biography, user.biography) &&
        Objects.equals(this.city, user.city);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, secondName, birthdate, biography, city);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    secondName: ").append(toIndentedString(secondName)).append("\n");
    sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
    sb.append("    biography: ").append(toIndentedString(biography)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
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
