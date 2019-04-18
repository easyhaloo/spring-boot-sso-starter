package com.eechain.sso.client.handler.logout;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotNull;

/**
 * 返回退出状态
 * Create by haloo on 2019-04-09
 */
@Slf4j
public class HttpStatusReturingLogoutSuccessHandler implements LogoutSuccessHandler {

  private final HttpStatus httpStatus;

  public HttpStatusReturingLogoutSuccessHandler(@NotNull HttpStatus httpStatus) {
    this.httpStatus = httpStatus;
  }


  public HttpStatusReturingLogoutSuccessHandler() {
    httpStatus = HttpStatus.OK;
  }


  @Override
  public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response,
                              Object authentication) throws Exception {
    log.debug("logout is success . the response status code : {}", httpStatus.value());
    response.setStatus(httpStatus.value());
    response.getWriter().flush();
  }
}
