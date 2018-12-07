/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binh.detail;

import binh.dao.BlogDAO;
import binh.dto.BlogDTO;
import java.util.List;

/**
 *
 * @author Mochi
 */
public class DetalAction {
    private String title;
    private List<BlogDTO> list;
    private final String SUCCESS = "success";
    public DetalAction() {
    }
    
    public String execute() throws Exception {
        BlogDAO dao = new BlogDAO();
        dao.getDetail(getTitle());
        list = dao.getListDetail();
        return SUCCESS;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the list
     */
    public List<BlogDTO> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(List<BlogDTO> list) {
        this.list = list;
    }
    
}
