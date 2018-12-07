/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binh.dto;

/**
 *
 * @author Mochi
 */
public class AboutMeDTO {

    String aboutMeDetail ;
    String sign ;

    public AboutMeDTO(String aboutMeDetail, String sign) {
        this.aboutMeDetail = aboutMeDetail;
        this.sign = sign;
    }

    public String getAboutMeDetail() {
        return aboutMeDetail;
    }

    public void setAboutMeDetail(String aboutMeDetail) {
        this.aboutMeDetail = aboutMeDetail;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
    
    
    
}
