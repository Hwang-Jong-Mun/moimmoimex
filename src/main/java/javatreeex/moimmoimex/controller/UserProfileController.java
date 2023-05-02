package javatreeex.moimmoimex.controller;

import javatreeex.moimmoimex.domain.UserDo;
import javatreeex.moimmoimex.domain.UserProfileDto;
import javatreeex.moimmoimex.mapper.UserProfileMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.security.Principal;

@Controller
@RequestMapping("/profile")
@RequiredArgsConstructor
public class UserProfileController {
    private final UserProfileMapper userProfileMapper;

    @GetMapping
    public String showProfilePage(Model model, HttpSession session) {
        UserDo authenticatedUser = (UserDo) session.getAttribute("authenticatedUser");
        UserProfileDto userProfileDto = userProfileMapper.getUserProfileDto(authenticatedUser.getUserIdNum());
        model.addAttribute("userProfileDto", userProfileDto);
        return "profilePage";
    }
}
