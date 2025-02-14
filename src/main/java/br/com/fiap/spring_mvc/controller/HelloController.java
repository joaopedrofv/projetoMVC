package br.com.fiap.spring_mvc.controller;

import br.com.fiap.spring_mvc.model.Categoria;
import br.com.fiap.spring_mvc.model.Livro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @GetMapping("/ola")
    public String hello(Model model) {
        model.addAttribute("message", "hello world!");
        return "hello"; // nome do template HTML, ex: hello.html
    }

    @GetMapping("/ola2")
    public ModelAndView hello2() {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("message", "Helloooooo");
        return mv;
    }

    @GetMapping("/livro")
    public ModelAndView livro(){
        Livro livro = new Livro();
        livro.setAutor("Shakespeare");
        livro.setTitulo("Romeu e Julieta");
        livro.setCategoria(Categoria.ROMANCE);
        ModelAndView mv = new ModelAndView("livro");
        mv.addObject("livro", livro);
        return mv;
    }
}
