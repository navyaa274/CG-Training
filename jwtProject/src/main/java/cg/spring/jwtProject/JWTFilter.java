package cg.spring.jwtProject;

import io.jsonwebtoken.ExpiredJwtException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JWTFilter extends OncePerRequestFilter {
    @Autowired
    JWTBuilder jwtBuilder;

    @Autowired
    UserService userService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        System.out.println("WELCOME TO JWT FILTER CLASS");
        String username=null;
        String details = request.getHeader("Authorization");
        System.out.println("printed jwt "+ details);

        String path = request.getRequestURI();

        if (details == null) {
            filterChain.doFilter(request, response);
            return;
        }
        String token= details.substring(7);
        System.out.println("token"+ token);
        try {

            username = jwtBuilder.extractUserName(token);
        }
        catch(ExpiredJwtException expiredJwtException){
            System.out.println("Expired JWT");
            filterChain.doFilter(request,response);
            return;
        }
        //  System.out.println(SecurityContextHolder.getContext().getAuthentication().toString());
        System.out.println("TOKEN VALID");
        if(username !=null && SecurityContextHolder.getContext().getAuthentication()==null){

            UserDetails userDetails= userService.loadUserByUsername(username);
            System.out.println(userDetails.getAuthorities().toString());

            if (jwtBuilder.validateToken(token,userDetails)) {

                UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(
                        userDetails,
                        null,
                        userDetails.getAuthorities()
                );
                authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(authToken);
            }

        }

        filterChain.doFilter(request,response);

    }
}
