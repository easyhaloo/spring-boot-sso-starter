package com.eechain.sso.client.handler;


import com.eechain.sso.client.authentication.Authentication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Create by haloo on 2019-04-09
 */
@FunctionalInterface
public interface LogoutHandler {
  /**
   * 单点退出时调用
   *
   * @param request
   * @param response
   * @param authentication
   */
  void onLogout(HttpServletRequest request, HttpServletResponse response,
                Authentication authentication);
}
