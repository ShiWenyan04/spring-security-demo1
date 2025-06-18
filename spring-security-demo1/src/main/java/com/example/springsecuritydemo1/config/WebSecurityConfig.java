package main.java.com.example.springsecuritydemo1.config;


public class WebSecurityConfig extends WebSecurityConfigureAdapter {
    @override
    protected void configure(HttpSecurity http) throwa Exception{
        http.csrf().disable();
        http.formLogin().loginPage("/login").permitAll();
        http.formLogin().successHandler(new LoginSuccessHandler());
        http.logout().permitAll();
        http.authorizeRequests().antMatchers("/js/**","/css/**","/images/**").permitAll().antMatchers("/add/**").permitAll().anyRequest().fullyAuthenticated();
    }
}
