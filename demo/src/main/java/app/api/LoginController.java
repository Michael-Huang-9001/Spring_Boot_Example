package app.api;

import java.util.HashMap;

import com.fasterxml.jackson.databind.util.JSONPObject;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    // GET @ /login
    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public static HashMap<String, String> login(@RequestBody JSONPObject json) {
        HashMap<String, String> map = new HashMap<>();
        map.put("apple", "sheeple");
        map.put("google", "politics");
        map.put("amazon", "jeff bezos lmao");
        return map;
    }

    public static boolean login(String email, String password) {
        return false;
    }
}