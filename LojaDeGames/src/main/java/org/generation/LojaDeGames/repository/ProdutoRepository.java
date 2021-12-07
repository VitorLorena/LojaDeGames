package org.generation.LojaDeGames.repository;

import java.util.List;

import org.generation.LojaDeGames.model.Produto;


public interface ProdutoRepository extends JPARepository<Produto, Long> {

	public List<Produto> findAllByNomeContainingIgnoreCase (String nome);
	
}
