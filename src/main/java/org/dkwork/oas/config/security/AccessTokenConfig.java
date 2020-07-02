package org.dkwork.oas.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

/**
 * @author jin
 * @date 2020/7/2
 * @Mail Jinyl@mail.taiji.com.cn
 * @BelongProjecet oas
 * @BelongPackage org.dkwork.oas.config.security
 * @Describe: TokenStore 的实例
 */
@Configuration
public class AccessTokenConfig {
    /*生成的 Token 要往哪里存储*/
    @Bean
    TokenStore tokenStore() {
        return new InMemoryTokenStore();
    }
}
