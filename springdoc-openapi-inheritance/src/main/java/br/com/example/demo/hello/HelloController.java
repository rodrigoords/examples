package br.com.example.demo.hello;

import br.com.example.demo.base.controller.BaseRestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController extends BaseRestController<Hello> {
}
