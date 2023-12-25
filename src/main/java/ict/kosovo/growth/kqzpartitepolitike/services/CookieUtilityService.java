package ict.kosovo.growth.kqzpartitepolitike.services;
import jakarta.servlet.http.Cookie;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.Optional;

@Service
public class CookieUtilityService {
    public Boolean getLoggedIn(Cookie[] cookies) {
        if(cookies==null) return false;

        Optional<Cookie> cookie = Arrays.stream(cookies).filter(c -> c.getName().equals("logged_in")).findFirst();
        if (!cookie.isPresent()) return false;
        return true;
    }
}
