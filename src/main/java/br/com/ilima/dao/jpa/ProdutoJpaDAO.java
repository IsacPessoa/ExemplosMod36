package br.com.ilima.dao.jpa;

import br.com.ilima.dao.generic.jpa.GenericJpaDAO;
import br.com.ilima.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

    public ProdutoJpaDAO() {
        super(ProdutoJpa.class);
    }

}