package br.com.poc.impdao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.poc.dao.IProductDetails;
import br.com.poc.entity.Product;

/**
 * Descrição da classe
 *
 * @author <a href="mailto:jbraz@ciandt.com">Jean Braz da Costa</a>
 */
public class ProductDetail implements IProductDetails {

    @PersistenceContext
    protected EntityManager entityManager;

    /*
     * (non-Javadoc)
     *
     * @see org.springframework.data.repository.CrudRepository#save(java.lang.Object)
     */
    @Override
    public <S extends Product> S save(S entity) {
        entityManager.persist(entity);
        return entity;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.springframework.data.repository.CrudRepository#save(java.lang.Iterable)
     */
    @Override
    public <S extends Product> Iterable<S> save(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.springframework.data.repository.CrudRepository#findOne(java.io.Serializable)
     */
    @Override
    public Product findOne(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.springframework.data.repository.CrudRepository#exists(java.io.Serializable)
     */
    @Override
    public boolean exists(Long id) {
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.springframework.data.repository.CrudRepository#findAll()
     */
    @Override
    public Iterable<Product> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.springframework.data.repository.CrudRepository#findAll(java.lang.Iterable)
     */
    @Override
    public Iterable<Product> findAll(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.springframework.data.repository.CrudRepository#count()
     */
    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.springframework.data.repository.CrudRepository#delete(java.io.Serializable)
     */
    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see org.springframework.data.repository.CrudRepository#delete(java.lang.Object)
     */
    @Override
    public void delete(Product entity) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see org.springframework.data.repository.CrudRepository#delete(java.lang.Iterable)
     */
    @Override
    public void delete(Iterable<? extends Product> entities) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see org.springframework.data.repository.CrudRepository#deleteAll()
     */
    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub

    }

}
