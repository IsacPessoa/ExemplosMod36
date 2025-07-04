package br.com.ilima.dao.jpa;

import br.com.ilima.dao.generic.jpa.IGenericJpaDAO;
import br.com.ilima.domain.jpa.VendaJpa;
import br.com.ilima.exceptions.DAOException;
import br.com.ilima.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaJpaDAO extends IGenericJpaDAO<VendaJpa, Long>{

    public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

    public VendaJpa consultarComCollection(Long id);
}