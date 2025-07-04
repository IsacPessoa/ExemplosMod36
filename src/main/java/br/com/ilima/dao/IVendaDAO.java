package br.com.ilima.dao;

import br.com.ilima.dao.generic.IGenericDAO;
import br.com.ilima.domain.Venda;
import br.com.ilima.exceptions.DAOException;
import br.com.ilima.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}