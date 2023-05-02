package javatreeex.moimmoimex.controller;

import javatreeex.moimmoimex.domain.UserDo;
import javatreeex.moimmoimex.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class UsersController {

    private final UserMapper userMapper;

/*

    @GetMapping("")
    public String home(){
        return "userService/login";
    }

    @GetMapping("signup")
    public String signupPage1(){
        return"userService/signupPage1";
    }
*/

    @GetMapping("login")
    public String showLoginForm(Model model) {
        return "loginForm";
    }
/*
    @PostMapping("login")
    public String processLoginForm(@ModelAttribute("user") UserDo user, Model model) {
        UserDo authenticatedUser = userMapper.getUserByCredentials(user.getUserId(), user.getUserPassword());
        if (authenticatedUser == null) {
            model.addAttribute("errorMessage", "Invalid credentials");
            return "loginForm";
        } else {
            model.addAttribute("user", authenticatedUser);
            return "userPage";
        }
    }
    */

    @PostMapping("login")
    public String login(@RequestParam("userId") String userId,
                        @RequestParam("userPassword") String userPassword,
                        Model model) {

        UserDo authenticatedUser = userMapper.getUserByCredentials(userId, userPassword);

        if (authenticatedUser == null) {
            model.addAttribute("errorMessage", "Invalid credentials");
            return "loginForm";
        } else {
            model.addAttribute("user", authenticatedUser);
            return "userPage";
        }
    }
}
