/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binh.dto;

import java.sql.Date;

/**
 *
 * @author Mochi
 */
public class BlogDTO {

    String title ;
    String imgDesc;
    String detail ;
    Date date ;

    public BlogDTO(String title, String imgDesc, String detail, Date date) {
        this.title = title;
        this.imgDesc = imgDesc;
        this.detail = detail;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgDesc() {
        return imgDesc;
    }

    public void setImgDesc(String imgDesc) {
        this.imgDesc = imgDesc;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
