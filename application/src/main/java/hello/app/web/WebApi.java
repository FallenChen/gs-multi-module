package hello.app.web;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/yapi")
public class WebApi {

    @RequestMapping("/api")
    public User getUser(User user){
        User user1 = new User();
        user1.setAge(2);
        user1.setName("garry");
        return user1;
    }
}
