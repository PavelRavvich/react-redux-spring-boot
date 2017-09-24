package ru.pravvich.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Author : Pavel Ravvich.
 * Created : 24.09.17.
 * <p>
 * BaseController
 */
@Controller
public class BaseController {
    @GetMapping("")
    public String getIndex() {
        return "index";
    }

}
