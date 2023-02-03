package breno.dev.Springpagination.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import breno.dev.Springpagination.model.Produto;
import breno.dev.Springpagination.repository.ProdutoRepository;

@Controller
public class ProdutoController {

	@Autowired
	ProdutoRepository repositorio;
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public  ModelAndView home(Pageable paginacao) {
		Page<Produto> listaProdutos = repositorio.findAll(paginacao);
		ModelAndView mv = new ModelAndView("/principal");
		mv.addObject("produtos", listaProdutos);
		mv.addObject("mensagemTamanho", listaProdutos.getTotalElements());
		mv.addObject("paginas",listaProdutos.getTotalPages());
		return mv ;
	}
	@RequestMapping(value="/",method = RequestMethod.POST)
	public  String salvar(Produto produto) {
		repositorio.save(produto);
		return "redirect: ";
	}
}
