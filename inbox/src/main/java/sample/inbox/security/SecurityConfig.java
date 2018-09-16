package sample.inbox.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author Rob Winch
 */
@Configuration
public class SecurityConfig {
	// @formatter:off
	@Bean
	MapReactiveUserDetailsService userDetailsService() {
		UserDetails rob = User.withUsername("rob@example.com")
				.password("password")
				.roles("USER")
				.build();
		return new MapReactiveUserDetailsService(rob);
	}
	// @formatter:on
}