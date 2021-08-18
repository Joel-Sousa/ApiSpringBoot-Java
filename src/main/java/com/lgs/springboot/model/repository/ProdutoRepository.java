package com.lgs.springboot.model.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.lgs.springboot.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>{

	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
}
