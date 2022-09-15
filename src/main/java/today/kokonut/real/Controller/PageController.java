package today.kokonut.real.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {


    @GetMapping("/")
    public String MainController() {
        return "index/index";
    }

    @GetMapping("/board")
    public String goeditorcontroller() {
        return "board/ckeditor";
    }
}
