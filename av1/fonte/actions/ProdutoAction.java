
package actions;


import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author marcelo
 */
public class ProdutoAction extends ActionSupport{
    
    private String campo1;
    private String campo2;
    private String campo3;
    private String campo4;
    private String campo5;
    
    @Action(value = "cadastroProduto", 
            results = {@Result(name = SUCCESS, location = "/WEB-INF/sucesso.jsp"),
                       @Result(name = INPUT, location = "/index.jsp"),
                       @Result(name = ERROR, location = "/WEB-INF/erro.jsp")})
    public String executeProduto() throws Exception {
        return SUCCESS;
    }
    
        public String registraProduto() throws Exception {
        
        return SUCCESS;
    }

    public String getCampo1() {
        return campo1;
    }

    public void setCampo1(String campo1) {
        this.campo1 = campo1;
    }

    public String getCampo2() {
        return campo2;
    }

    public void setCampo2(String campo2) {
        this.campo2 = campo2;
    }

    public String getCampo3() {
        return campo3;
    }

    public void setCampo3(String campo3) {
        this.campo3 = campo3;
    }

    public String getCampo4() {
        return campo4;
    }

    public void setCampo4(String campo4) {
        this.campo4 = campo4;
    }

    public String getCampo5() {
        return campo5;
    }

    public void setCampo5(String campo5) {
        this.campo5 = campo5;
    }
    
}
