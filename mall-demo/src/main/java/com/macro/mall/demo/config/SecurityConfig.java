package com.macro.mall.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * SpringSecurity的配置
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Autowired
    private UmsAdminMapper umsAdminMapper;

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()//配置权限
////                .antMatchers("/").access("hasRole('TEST')")//该路径需要TEST角色
////                .antMatchers("/brand/list").authenticated()//该路径需要登录认证
////                .antMatchers("/brand/list").hasAuthority("TEST")//该路径需要TEST权限
//                .antMatchers("/**").permitAll()
//                .and()//启用基于http的认证
//                .httpBasic()
//                .realmName("/")
//                .and()//配置登录页面
//                .formLogin()
//                .loginPage("/login")
//                .failureUrl("/login?error=true")
//                .and()//配置退出路径
//                .logout()
//                .logoutSuccessUrl("/")
////                .and()//记住密码功能
////                .rememberMe()
////                .tokenValiditySeconds(60*60*24)
////                .key("rememberMeKey")
//                .and()//关闭跨域伪造
//                .csrf()
//                .disable();
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService()).passwordEncoder(new Md5PasswordEncoder());
//    }
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//        //获取登录用户信息
//        return new UserDetailsService() {
//            @Override
//            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//                UmsAdminExample example = new UmsAdminExample();
//                example.createCriteria().andUsernameEqualTo(username);
//                List<UmsAdmin> umsAdminList = umsAdminMapper.selectByExample(example);
//                if (umsAdminList != null && umsAdminList.size() > 0) {
//                    return new AdminUserDetails(umsAdminList.get(0));
//                }
//                throw new UsernameNotFoundException("用户名或密码错误");
//            }
//        };
//    }
}
