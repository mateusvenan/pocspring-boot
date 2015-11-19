package br.com.poc.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.poc.entity.Product;

/**
 * Descrição da classe
 *
 * @author <a href="mailto:jbraz@ciandt.com">Jean Braz da Costa</a>
 */
public interface IProductDetails extends CrudRepository<Product, Long> {

}
