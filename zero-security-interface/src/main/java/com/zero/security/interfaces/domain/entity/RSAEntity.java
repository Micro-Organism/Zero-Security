package com.zero.security.interfaces.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RSAEntity {
 
  /**
   * 公钥
   **/
  private String publicKey;
  /**
   * 私钥
   **/
  private String privateKey;
 
}