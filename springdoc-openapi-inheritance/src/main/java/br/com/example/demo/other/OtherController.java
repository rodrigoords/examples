package br.com.example.demo.other;

import br.com.example.demo.base.controller.BaseRestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("others")
public class OtherController extends BaseRestController<Other> {
}
