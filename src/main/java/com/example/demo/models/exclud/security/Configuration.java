package com.example.demo.security;//package com.example.demo.security;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@org.springframework.context.annotation.Configuration
//public class Configuration  {
////    @Autowired
////    @Lazy
////    private CustomProvider customProvider;
//
////
////    @Autowired
////    private CustomFilter customFilter;
////
//
//
////    @Override
////    @Bean
////    public AuthenticationManager authenticationManagerBean() throws Exception {
////        return super.authenticationManagerBean();
////    }
////
//
////    @Bean
////    CorsConfigurationSource corsConfigurationSource() {
////        CorsConfiguration configuration = new CorsConfiguration();
////        configuration.setAllowedOrigins( Arrays.asList("http://localhost:4200"));
////        configuration.setAllowedMethods(Arrays.asList("GET","POST"));
////        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
////        source.registerCorsConfiguration("/**", configuration);
////        return source;
////    }
//
////    @Override
////    protected void configure(AuthenticationManagerBuilder auth) {
////        auth.authenticationProvider( customProvider );
////    }
////
///*
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//      http.addFilterAt( customFilter, BasicAuthenticationFilter.class );
//        http.formLogin().and()
//
//                .authorizeRequests()
//                .antMatchers("/index.html", "/", "/home","/login").permitAll()
//        .anyRequest().authenticated();
//        http.cors(c->{
//            CorsConfigurationSource cs= request -> {
//             CorsConfiguration cc=new CorsConfiguration();
//             cc.setAllowedOrigins( List.of("*") );
//             cc.setAllowedMethods( List.of("GET","POST") );
//
//             return cc;
//
//            };
//           c.configurationSource( cs );
//        });
//
//
//                http.csrf()
//                .csrfTokenRepository( CookieCsrfTokenRepository.withHttpOnlyFalse());
//        ;
//
//
//    }
//*/
///*
//
//    @Override
//    protected void configure(HttpSecurity http) {
//        http.addFilterBefore( customFilter, BasicAuthenticationFilter.class );
//
//    }
//*/
//
//
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//
//    }
//
//}
