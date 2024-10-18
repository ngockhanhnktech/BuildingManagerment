//package org.example.advancedrealestate_be.config;
//
//import lombok.AccessLevel;
//import lombok.RequiredArgsConstructor;
//import lombok.experimental.FieldDefaults;
//import lombok.extern.slf4j.Slf4j;
//import org.example.advancedrealestate_be.constant.PredefinedRole;
//import org.example.advancedrealestate_be.entity.Role;
//import org.example.advancedrealestate_be.entity.User;
//import org.example.advancedrealestate_be.repository.RoleRepository;
//import org.example.advancedrealestate_be.repository.UserRepository;
//
//
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import java.util.HashSet;
//
//@Configuration
//@RequiredArgsConstructor
//@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
//@Slf4j
//public class ApplicationInitConfig {
//
//
//    PasswordEncoder passwordEncoder;
//
////    static  String ADMIN_USER_NAME = "admin@gmail.com";
//    static  String ADMIN_PASSWORD = "admin";
//    static String ADMIN_EMAIL="admin@gmail.com";
//
//    @Bean
//    @ConditionalOnProperty(
//            prefix = "spring",
//            value = "datasource.driverClassName",
//            havingValue = "com.mysql.cj.jdbc.Driver")
//    ApplicationRunner applicationRunner(UserRepository userRepository, RoleRepository roleRepository) {
//        log.info("Initializing application.....");
//        return args -> {
//            if (userRepository.findByEmail(ADMIN_EMAIL).isEmpty()) {
//                roleRepository.save(Role.builder()
//                        .name(PredefinedRole.USER_ROLE)
//                        .description("User role")
//                        .build());
//
//                Role adminRole = roleRepository.save(Role.builder()
//
//                        .name(PredefinedRole.ADMIN_ROLE)
//                        .description("Admin role")
//                        .build());
//
//                var roles = new HashSet<Role>();
//                roles.add(adminRole);
//
//                User user = User.builder()
//                        .isVerify(true)
//                        .email(ADMIN_EMAIL)
//                        .password(passwordEncoder.encode(ADMIN_PASSWORD))
//                        .roles(roles)
//                        .build();
//
//                userRepository.save(user);
//                log.warn("Admin user has been created with default password: admin, please change it");
//            }
//            log.info("Application initialization completed .....");
//        };
//    }
//}
