package com.farmaciapopular.farmacia.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.farmaciapopular.farmacia.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByNomeContainingIgnoreCase (String nome);

}
