package com.ctrip.framework.apollo.util.http;

import java.util.Map;

/**
 * @author Jason Song(song_s@ctrip.com)
 */
public class HttpRequest {
  private String m_url;
  private int m_connectTimeout;
  private int m_readTimeout;

  private Map<String, String> headers;

  /**
   * Create the request for the url.
   * @param url the url
   */
  public HttpRequest(String url) {
    this.m_url = url;
    m_connectTimeout = -1;
    m_readTimeout = -1;
  }

  public HttpRequest(String url, Map<String, String> headers) {
    this.m_url = url;
    this.headers = headers;
    m_connectTimeout = -1;
    m_readTimeout = -1;
  }

  public String getUrl() {
    return m_url;
  }

  public int getConnectTimeout() {
    return m_connectTimeout;
  }

  public void setConnectTimeout(int connectTimeout) {
    this.m_connectTimeout = connectTimeout;
  }

  public int getReadTimeout() {
    return m_readTimeout;
  }

  public void setReadTimeout(int readTimeout) {
    this.m_readTimeout = readTimeout;
  }

  public Map<String, String> getHeaders() {
    return headers;
  }

  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }
}
