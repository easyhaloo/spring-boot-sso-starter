package com.eechain.sso.client.manager;
import com.eechain.sso.client.handler.AuthManager;
import okhttp3.OkHttpClient;

/**
 * 授权客户端
 * Create by haloo on 2019-04-18
 */
public abstract class AbstractAuthManager implements AuthManager {

  protected static final String AUTH_URL = "/session/verify";
  protected static final String LOGIN_URL = "/account/login";
  protected static final String LOGOUT_URL = "/session/logout";

  private OkHttpClient client;

  public void setClient(OkHttpClient client) {
    this.client = client;
  }

  public OkHttpClient getClient() {
    return client;
  }
}
