/**
 *
 */
package br.com.ilima.services;

import br.com.ilima.dao.IProdutoDAO;
import br.com.ilima.domain.Produto;
import br.com.ilima.services.generic.GenericService;

/**
 * @author rodrigo.pires
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}