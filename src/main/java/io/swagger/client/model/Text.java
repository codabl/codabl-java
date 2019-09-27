/*
 * Brainrex API Explorer
 * This is the Brainrex API. You can find Market Data and Sentiment Analysis endpoints.More about Brainrex at [http://brainrex.com](http://brainrex.com) or on [slack.brainrex.com, #brainrex](http://slack.brainrex.com).      For this sample, you only need to login to the Brainrex for Developers site. IMPORTANT NOTICE: FACE-ID API still in development, generate and download methods haven't been implemented at backend
 *
 * OpenAPI spec version: 0.1.0
 * Contact: support@brainrex.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Text
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-26T20:35:05.506Z")
public class Text {
  @SerializedName("text")
  private String text = null;

  public Text text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Photo to be analyzed
   * @return text
  **/
  @ApiModelProperty(value = "Photo to be analyzed")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Text text = (Text) o;
    return Objects.equals(this.text, text.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Text {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

