package org.generation.LojaDeGames.repository;

import java.util.List;

import org.generation.LojaDeGames.model.Categoria;

public interface CategoriaRepository extends JPARepository<Categoria, Long> {

	public List<Categoria> findAllByDescricaoContainingIgnoreCase (String descricao);
	
}
