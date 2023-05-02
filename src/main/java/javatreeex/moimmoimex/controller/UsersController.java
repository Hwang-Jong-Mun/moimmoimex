package javatreeex.moimmoimex.controller;

import javatreeex.moimmoimex.domain.UserDo;
import javatreeex.moimmoimex.domain.UserProfileDto;
import javatreeex.moimmoimex.mapper.UserMapper;
import javatreeex.moimmoimex.mapper.UserProfileMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class UsersController {

    private final UserMapper userMapper;
    private final UserProfileMapper userProfileMapper;

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
                        Model model, RedirectAttributes redirectAttributes,
                        HttpServletRequest request) {

        UserDo authenticatedUser = userMapper.getUserByCredentials(userId, userPassword);

        if (authenticatedUser == null) {
            model.addAttribute("errorMessage", "Invalid credentials");
            return "loginForm";
        } else {
            // Add the authenticated user to the session
            HttpSession session = request.getSession();
            session.setAttribute("authenticatedUser", authenticatedUser);

            // Redirect to the profile page
            redirectAttributes.addAttribute("userId", authenticatedUser.getUserId());
            return "redirect:/profile";
        }
    }
}
