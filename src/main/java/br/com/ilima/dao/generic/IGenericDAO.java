package br.com.ilima.dao.generic;

import br.com.ilima.dao.Persistente;
import br.com.ilima.exceptions.DAOException;
import br.com.ilima.exceptions.MaisDeUmRegistroException;
import br.com.ilima.exceptions.TableException;
import br.com.ilima.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;


public interface IGenericDAO <T extends Persistente, E extends Serializable> {

    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;


    public void excluir(E valor) throws DAOException;


    public void alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;


    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException;

    public Collection<T> buscarTodos() throws DAOException;
}
