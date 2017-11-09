package baryczka.billofsale.service;

import baryczka.billofsale.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) {
        User user = new User((long) 1, "lukasz", "$2a$11$XdwpukK6.Od3wUNU6Tj5s.K/NGrTfbqofGJsVNsEJJf1.53Hext7K");//userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new UserPrincipal(user);
    }
}
