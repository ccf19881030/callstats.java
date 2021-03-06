package io.callstats.sdk.messages;

import com.google.gson.annotations.SerializedName;

public class AuthenticateResponse {
  /** The access token */
  @SerializedName("access_token")
  private String token;

  /** The token type */
  @SerializedName("token_type")
  private String tokenType;

  /** When token expires */
  @SerializedName("expires_in")
  private long expires;

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public long getExpires() {
    return expires;
  }

  public void setExpires(long expires) {
    this.expires = expires;
  }
}
