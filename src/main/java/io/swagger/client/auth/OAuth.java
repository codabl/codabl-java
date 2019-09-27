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


package io.swagger.client.auth;

import io.swagger.client.Pair;

import java.util.Map;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-26T20:35:05.506Z")
public class OAuth implements Authentication {
  private String accessToken;

  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
    if (accessToken != null) {
      headerParams.put("Authorization", "Bearer " + accessToken);
    }
  }
}
