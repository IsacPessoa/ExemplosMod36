package br.com.ilima.dao.jpa;

import br.com.ilima.dao.generic.jpa.GenericJpaDAO;
import br.com.ilima.domain.jpa.ClienteJpa;


public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

    public ClienteJpaDAO() {
        super(ClienteJpa.class);
    }

}