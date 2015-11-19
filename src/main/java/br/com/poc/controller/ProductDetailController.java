package br.com.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.poc.dao.IProductDetails;
import br.com.poc.entity.Product;

/**
 * Descrição da classe
 *
 * @author <a href="mailto:jbraz@ciandt.com">Jean Braz da Costa</a>
 */
@RestController
@RequestMapping("/products")
public class ProductDetailController {
    private final IProductDetails repository;

    @Autowired
    public ProductDetailController(IProductDetails repository) {
        this.repository = repository;
    }

    @SuppressWarnings("rawtypes")
    @RequestMapping(method = RequestMethod.GET)
    public Iterable findAll() {
        return repository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Object create(@RequestBody Product detail) {
        return repository.save(detail);
    }
}
