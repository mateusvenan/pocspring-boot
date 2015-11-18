package br.com.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.poc.dao.IProductDetails;
import br.com.poc.impdao.ProductDetail;

/**
 * Descrição da classe
 *
 * @author <a href="mailto:jbraz@ciandt.com">Jean Braz da Costa</a>
 */

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

    @SuppressWarnings("unchecked")
    @RequestMapping(method = RequestMethod.POST)
    public Object create(@RequestBody ProductDetail detail) {
        return repository.save(detail);
    }
}
