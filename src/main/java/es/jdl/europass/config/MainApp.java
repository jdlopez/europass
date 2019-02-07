package es.jdl.europass.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@EnableAutoConfiguration
@ComponentScan(basePackages = "es.jdl.europass.service")
@Import(EuropassConfig.class)
@EnableOAuth2Sso
@RestController
public class MainApp extends WebSecurityConfigurerAdapter {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MainApp.class, args);
    }

    @RequestMapping("/user")
    public Principal user(Principal principal) {
        return principal;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.antMatcher("/**").authorizeRequests().antMatchers("/", "/css/**", "/js/**", "/login**", "/error**").permitAll().anyRequest()
                .authenticated().and().logout().logoutSuccessUrl("/").permitAll()
        ;
    }

    /*
facebook:
  client:
    clientId: 233668646673605
    clientSecret: 33b17e044ee6a4fa383f46ec6e28ea1d
    accessTokenUri: https://graph.facebook.com/oauth/access_token
    userAuthorizationUri: https://www.facebook.com/dialog/oauth
    tokenName: oauth_token
    authenticationScheme: query
    clientAuthenticationScheme: form
  resource:
    userInfoUri: https://graph.facebook.com/me
     */

//    @Bean
//    public AuthorizationCodeResourceDetails googleOAuth() {
//        AuthorizationCodeResourceDetails acrd = new AuthorizationCodeResourceDetails();
//        acrd.setClientId(System.getenv("OAUTH_clientId"));
//        acrd.setClientSecret(System.getenv("OAUTH_"));
//        acrd.setAccessTokenUri(System.getenv("OAUTH_"));
//        acrd.setUserAuthorizationUri(System.getenv("OAUTH_"));
//        acrd.setTokenName(System.getenv("OAUTH_"));
//        acrd.setAuthenticationScheme(System.getenv("OAUTH_"));
//        acrd.setClientAuthenticationScheme(System.getenv("OAUTH_"));
//        return acrd;
//    }
//
//    @Bean
//    public FilterRegistrationBean<OAuth2ClientContextFilter> oauth2ClientFilterRegistration(OAuth2ClientContextFilter filter) {
//        FilterRegistrationBean<OAuth2ClientContextFilter> registration = new FilterRegistrationBean<OAuth2ClientContextFilter>();
//        registration.setFilter(filter);
//        registration.setOrder(-100);
//        return registration;
//    }
}
