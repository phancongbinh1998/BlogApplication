/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binh.overview;

import binh.dao.BlogDAO;
import binh.dto.BlogDTO;
import java.util.List;

/**
 *
 * @author Mochi
 */
public class OverviewAction {
    private List<BlogDTO> list;
    private final String SUCCESS = "success";
    public OverviewAction() {
    }
    
    public String execute() throws Exception {
        BlogDAO dao = new BlogDAO();
        dao.getBlog();
        setList(dao.getList());
        return SUCCESS;
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
