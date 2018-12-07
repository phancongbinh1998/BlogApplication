/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binh.dao;

import binh.dto.AboutMeDTO;
import binh.dto.BlogDTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;
import sample.utils.DBConnection;

/**
 *
 * @author Mochi
 */
public class BlogDAO {
    private List<BlogDTO> list;
    public List<BlogDTO> getList(){
        return list;
    } 
    public boolean getBlog() throws NamingException, SQLException, ClassNotFoundException{
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBConnection.makeConnection();
            if (conn != null) {
                String sql = "Select title, imgDesc, detail, date from tblBlog order by date DESC";
                stm = conn.prepareStatement(sql);
                rs = stm.executeQuery();

                while (rs.next()) {
                    String title = rs.getString("title");
                    String imgDesc = rs.getString("imgDesc");
                    String detail = rs.getString("detail");
                    Date date = rs.getDate("date");
                    
                    BlogDTO dto = new BlogDTO(title, imgDesc, detail, date);
                    if(this.list == null){
                        this.list = new ArrayList<>();
                    }
                    this.list.add(dto);
                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }
    
    private int count;

    public int returnCount() {
        return count;
    }

    public boolean getCount() throws SQLException, NamingException, ClassNotFoundException {
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        try {
            conn = DBConnection.makeConnection();
            if (conn != null) {
                String sql = "Select count from tblCount";
                stm = conn.prepareStatement(sql);
                rs = stm.executeQuery();

                if (rs.next()) {
                    count = rs.getInt("count");

                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }
    
    public boolean updateCount(int count) throws SQLException, NamingException, ClassNotFoundException {
        Connection conn = null;
        PreparedStatement stm = null;

        try {
            conn = DBConnection.makeConnection();
            if (conn != null) {
                String sql = "Update tblCount set count = ?";
                stm = conn.prepareStatement(sql);
                stm.setInt(1, count);
                int row = stm.executeUpdate();
                if (row > 0) {
                    return true;
                }

            }
        } finally {

            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }
    
    private List<AboutMeDTO> listAM;
    public List<AboutMeDTO> getListAM(){
        return listAM;
    } 
    public boolean getAM() throws NamingException, SQLException, ClassNotFoundException{
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBConnection.makeConnection();
            if (conn != null) {
                String sql = "Select aboutMeDetail, sign from tblAboutMe order by date DESC";
                stm = conn.prepareStatement(sql);
                rs = stm.executeQuery();

                while (rs.next()) {
                    String aboutMeDetail = rs.getString("aboutMeDetail");
                    String sign = rs.getString("sign");
                   
                    
                    AboutMeDTO dto = new AboutMeDTO(aboutMeDetail, sign);
                    if(this.listAM == null){
                        this.listAM = new ArrayList<>();
                    }
                    if(this.listAM.size() < 1){
                        this.listAM.add(dto);
                    }
                    
                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }
    
    private List<BlogDTO> listDetail;
    public List<BlogDTO> getListDetail(){
        return listDetail;
    } 
    public boolean getDetail(String title) throws NamingException, SQLException, ClassNotFoundException{
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBConnection.makeConnection();
            if (conn != null) {
                String sql = "Select imgDesc, detail, date from tblBlog where title = ?";
                stm = conn.prepareStatement(sql);
                stm.setString(1, title);
                rs = stm.executeQuery();

                if (rs.next()) {
                    String imgDesc = rs.getString("imgDesc");
                    String detail = rs.getString("detail");
                    Date date = rs.getDate("date");
                    
                    BlogDTO dto = new BlogDTO(title, imgDesc, detail, date);
                    if(this.listDetail == null){
                        this.listDetail = new ArrayList<>();
                    }
                    this.listDetail.add(dto);
                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }
}
