package cg.spring.jwtProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    Repo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Customer c = repo.findByUsername(username);
        if(c == null) throw new UsernameNotFoundException("User not found with username: " + username);

        else {
            String user = c.getUsername();
            String password = c.getPassword();
            List<GrantedAuthority> x = new ArrayList<>();
            x.add(new SimpleGrantedAuthority("ROLE_USER"));

            return new User(user, password, x);
        }
    }


}

