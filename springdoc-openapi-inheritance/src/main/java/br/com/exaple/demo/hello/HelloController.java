package br.com.exaple.demo.hello;

import br.com.exaple.demo.base.controller.BaseRestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController extends BaseRestController<Hello> {
}
