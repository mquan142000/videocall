package vn.codegym.videocall;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.codegym.videocall.user.User;
import vn.codegym.videocall.user.UserService;

@SpringBootApplication
public class VideocallApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideocallApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
            UserService service
    ) {
        return args -> {
            service.register(User.builder()
                    .username("Ali")
                    .email("ali@gmail.com")
                    .password("aaa")
                    .build());

            service.register(User.builder()
                    .username("John")
                    .email("john@gmail.com")
                    .password("aaa")
                    .build());

            service.register(User.builder()
                    .username("Anny")
                    .email("anny@gmail.com")
                    .password("aaa")
                    .build());
        };
    }
}
