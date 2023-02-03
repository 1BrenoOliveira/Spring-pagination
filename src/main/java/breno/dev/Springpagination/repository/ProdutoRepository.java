package breno.dev.Springpagination.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import breno.dev.Springpagination.model.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{
	Page<Produto> findAll(Pageable pagination);
}
