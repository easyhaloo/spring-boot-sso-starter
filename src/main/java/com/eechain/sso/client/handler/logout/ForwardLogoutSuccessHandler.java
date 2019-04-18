package com.eechain.sso.client.handler.logout;

import com.eechain.sso.client.utils.UrlUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Create by haloo on 2019-04-09
 */
@Slf4j
public class ForwardLogoutSuccessHandler implements LogoutSuccessHandler {

  private final String targetUrl;

  public ForwardLogoutSuccessHandler(String targetUrl) {
    Assert.isTrue(UrlUtils.isValidRedirectUrl(targetUrl), "" +
        "targetUrl : { " + targetUrl + "} is invalid target url ");
    this.targetUrl = targetUrl;
  }


  @Override
  public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response,
                              Object authentication) throws Exception {
    log.debug("forward target Url is  {} ", targetUrl);
    request.getRequestDispatcher(targetUrl).forward(request, response);
  }
}
