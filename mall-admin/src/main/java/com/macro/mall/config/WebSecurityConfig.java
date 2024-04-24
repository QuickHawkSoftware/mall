package com.macro.mall.config;

import com.macro.mall.bo.AdminUserDetails;
import com.macro.mall.mapper.UmsAdminDynamicSqlSupport;
import com.macro.mall.mapper.UmsAdminMapper;
import com.macro.mall.model.UmsAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import java.util.Optional;

import static org.mybatis.dynamic.sql.SqlBuilder.*;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

  @Autowired
  private UmsAdminMapper umsAdminMapper;

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http
        .authorizeHttpRequests((requests) -> requests
            .requestMatchers("/**")
            .permitAll()
            .anyRequest()
            .authenticated())
        .formLogin((form) -> form
            .loginPage("/login")
            .failureUrl("/login?error=true")
            .permitAll())
        .logout((logout) -> logout
            .logoutSuccessUrl("/")
            .permitAll())
        .csrf((csrf) -> csrf
            .disable());

    return http.build();
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Bean
  public UserDetailsService userDetailsService() {
    return new UserDetailsService() {
      @Override
      public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UmsAdmin> umsAdmin = umsAdminMapper
            .selectOne(c -> c.where(UmsAdminDynamicSqlSupport.username, isEqualTo(username)));
        if (!umsAdmin.isPresent()) {
          throw new UsernameNotFoundException("用户名或密码错误");
        }
        return new AdminUserDetails(umsAdmin.get());
      }
    };

  }
}
