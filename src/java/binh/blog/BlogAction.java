/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binh.blog;

import binh.dao.BlogDAO;
import binh.dto.BlogDTO;
import com.opensymphony.xwork2.ActionContext;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Mochi
 */
public class BlogAction {
    private List<BlogDTO> list;
    private int count;
    private final String SUCCESS = "success";
    
    public BlogAction() {
    }
    
    public String execute() throws Exception {
        BlogDAO dao = new BlogDAO();
        dao.getBlog();
        dao.getCount();
        count = dao.returnCount();
        count++;
        dao.updateCount(count);
        list = dao.getList();
        Map session = ActionContext.getContext().getSession();
        session.put("COUNT", count);
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

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }
    
}
