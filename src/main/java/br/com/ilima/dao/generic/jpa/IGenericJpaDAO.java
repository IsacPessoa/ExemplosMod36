package br.com.ilima.dao.generic.jpa;

import java.io.Serializable;
import java.util.Collection;

import br.com.ilima.dao.Persistente;
import br.com.ilima.exceptions.DAOException;
import br.com.ilima.exceptions.MaisDeUmRegistroException;
import br.com.ilima.exceptions.TableException;
import br.com.ilima.exceptions.TipoChaveNaoEncontradaException;

public interface IGenericJpaDAO <T extends Persistente, E extends Serializable> {


    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public void excluir(T entity) throws DAOException;

    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public T consultar(E id) throws MaisDeUmRegistroException, TableException, DAOException;

    public Collection<T> buscarTodos() throws DAOException;
}