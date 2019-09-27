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
 * Request
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-26T20:35:05.506Z")
public class Request {
  @SerializedName("blockchain")
  private String blockchain = null;

  @SerializedName("market")
  private String market = null;

  @SerializedName("data_format")
  private String dataFormat = null;

  @SerializedName("orient")
  private String orient = null;

  @SerializedName("start_date")
  private String startDate = null;

  @SerializedName("end_date")
  private String endDate = null;

  public Request blockchain(String blockchain) {
    this.blockchain = blockchain;
    return this;
  }

   /**
   * Name of the exchange
   * @return blockchain
  **/
  @ApiModelProperty(example = "bitstamp", value = "Name of the exchange")
  public String getBlockchain() {
    return blockchain;
  }

  public void setBlockchain(String blockchain) {
    this.blockchain = blockchain;
  }

  public Request market(String market) {
    this.market = market;
    return this;
  }

   /**
   * Name of the currency pair
   * @return market
  **/
  @ApiModelProperty(example = "BTC-USD", value = "Name of the currency pair")
  public String getMarket() {
    return market;
  }

  public void setMarket(String market) {
    this.market = market;
  }

  public Request dataFormat(String dataFormat) {
    this.dataFormat = dataFormat;
    return this;
  }

   /**
   * Name of the data format availables (standard)
   * @return dataFormat
  **/
  @ApiModelProperty(example = "standard", value = "Name of the data format availables (standard)")
  public String getDataFormat() {
    return dataFormat;
  }

  public void setDataFormat(String dataFormat) {
    this.dataFormat = dataFormat;
  }

  public Request orient(String orient) {
    this.orient = orient;
    return this;
  }

   /**
   * Name of the market
   * @return orient
  **/
  @ApiModelProperty(example = "records", value = "Name of the market")
  public String getOrient() {
    return orient;
  }

  public void setOrient(String orient) {
    this.orient = orient;
  }

  public Request startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Name of the market 2014-01-01
   * @return startDate
  **/
  @ApiModelProperty(value = "Name of the market 2014-01-01")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public Request endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Name of the market 2014-01-01
   * @return endDate
  **/
  @ApiModelProperty(value = "Name of the market 2014-01-01")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Request request = (Request) o;
    return Objects.equals(this.blockchain, request.blockchain) &&
        Objects.equals(this.market, request.market) &&
        Objects.equals(this.dataFormat, request.dataFormat) &&
        Objects.equals(this.orient, request.orient) &&
        Objects.equals(this.startDate, request.startDate) &&
        Objects.equals(this.endDate, request.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockchain, market, dataFormat, orient, startDate, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Request {\n");
    
    sb.append("    blockchain: ").append(toIndentedString(blockchain)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    dataFormat: ").append(toIndentedString(dataFormat)).append("\n");
    sb.append("    orient: ").append(toIndentedString(orient)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

