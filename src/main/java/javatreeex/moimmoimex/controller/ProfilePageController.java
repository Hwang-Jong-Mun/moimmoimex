package JavaTree.moimmoim.controller;

import JavaTree.moimmoim.domain.ProfilePageDto;
import JavaTree.moimmoim.service.ProfilePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfilePageController {
    private final ProfilePageService profilePageService;

    @Autowired
    public ProfilePageController(ProfilePageService profilePageService) {
        this.profilePageService = profilePageService;
    }

    @GetMapping("/users/{userIdNum}")
    public String showProfilePage(@PathVariable("userIdNum") Long userIdNum, Model model) {
        ProfilePageDto profilePageDto = profilePageService.getUserProfile(userIdNum);
        model.addAttribute("profilePageDto", profilePageDto);
        return "profilePage";
    }

    @Controller
    @RequestMapping("/profile")
    public class ProfileController {

        private final ProfilePageService profilePageService;

        @Autowired
        public ProfileController(ProfilePageService profilePageService) {
            this.profilePageService = profilePageService;
        }

        @GetMapping("/create")
        public String showCreateProfileForm(Model model) {
            model.addAttribute("profileForm", new ProfileForm());
            return "create_profile_form";
        }
    }
}