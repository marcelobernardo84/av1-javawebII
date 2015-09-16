/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.INPUT;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import dao.ConnectionFactory;
import entity.Fornecedor;
import dao.FornecedorJpaController;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author marcelo
 */
public class FornecedorAction extends ActionSupport {
    
    private String nome;
    
    public FornecedorAction() {
    }
    
    @Action(value = "cadastroFornecedor", 
            results = {@Result(name = SUCCESS, location = "/WEB-INF/sucesso.jsp"),
                       @Result(name = INPUT, location = "/index.jsp"),
                       @Result(name = ERROR, location = "/WEB-INF/erro.jsp")})
    public String execute() throws Exception {
        //throw new UnsupportedOperationException("Not supported yet.");
        Fornecedor f = new Fornecedor();
        f.setNome(nome);
        try {
            EntityManagerFactory emf = ConnectionFactory.getSesssion();
            EntityManager connect = emf.createEntityManager();
            //dao.FornecedorJpaController dFornecedor = new FornecedorJpaController(emf);        
            //dFornecedor.create(f);
            connect.getTransaction().begin();
            connect.persist(f);
            connect.getTransaction().commit();
            return SUCCESS;
        }
        catch(Exception ex) {
            return ERROR;        
        }
        
    }
    
}
