/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binh.aboume;

import binh.dao.BlogDAO;
import binh.dto.AboutMeDTO;
import java.util.List;

/**
 *
 * @author Mochi
 */
public class AboutMeAction {
    private List<AboutMeDTO> listAM;
    
    private final String SUCCESS = "success";
    public AboutMeAction() {
    }
    
    public String execute() throws Exception {
        BlogDAO dao = new BlogDAO();
        dao.getAM();
        listAM = dao.getListAM();
        return SUCCESS;
    }

    /**
     * @return the listAM
     */
    public List<AboutMeDTO> getListAM() {
        return listAM;
    }

    /**
     * @param listAM the listAM to set
     */
    public void setListAM(List<AboutMeDTO> listAM) {
        this.listAM = listAM;
    }
    
}
