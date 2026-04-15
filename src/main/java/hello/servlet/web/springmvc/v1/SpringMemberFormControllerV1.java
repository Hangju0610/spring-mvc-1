package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@Component //컴포넌트 스캔을 통해 스프링 빈으로 등록
//@RequestMapping // 스프링 3.0 부터는 클래스 레벨에 존재해도 인식하지 않는다. 오직 @Controller가 있어야 스프링 컨트롤러로 인식한다.
public class SpringMemberFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process() {
        return new ModelAndView("new-form");
    }
}
