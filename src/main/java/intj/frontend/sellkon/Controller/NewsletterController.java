package intj.frontend.sellkon.Controller;


import intj.frontend.sellkon.Service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin("*")
@Controller
public class NewsletterController {

    @Autowired
    EmailService emailService;

    @PostMapping("/newsLetter/{mailTo}")
    public String sendMail(@PathVariable String mailTo)
    {
        System.out.println(mailTo);
        String status = emailService.sendSimpleMail(mailTo);

        return status;
    }
}
