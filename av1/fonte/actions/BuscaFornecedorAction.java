
package actions;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.HashMap;
import java.util.Map;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author marcelo
 */
public class BuscaFornecedorAction extends ActionSupport {
    
    //private List<String> buscaFornecedor;
    private Map<String, String> buscaFornecedor; 

	private String listaBuscaFornecedor;
	
        public BuscaFornecedorAction(){
		
            /* DELETEME
            Hardcoded feito para teste
            Alterar para pegar do banco*/    
            
            buscaFornecedor = new HashMap<String, String>();
            buscaFornecedor.put("1","Fornecedor1");
            buscaFornecedor.put("2","Fornecedor2");
            buscaFornecedor.put("3","Fornecedor3");
            buscaFornecedor.put("4","Fornecedor4");
	}
        
	public Map<String, String> getBuscaFornecedor() {
            return buscaFornecedor;
	}

	public void setBuscaFornecedor(Map<String, String> buscaFornecedor) {
            this.buscaFornecedor = buscaFornecedor;
	}

	public String getListaBuscaFornecedor() {
            return listaBuscaFornecedor;
	}

	public void setListaBuscaFornecedor(String listaBuscaFornecedor) {
            this.listaBuscaFornecedor = listaBuscaFornecedor;
	}

	public String execute() {
            return SUCCESS;
	}
	
        @Action(value = "selectAction", 
            results = {@Result(name = NONE, location = "/cadastro_produto.jsp")})
	public String display() {
            return NONE;
	}
    
}
