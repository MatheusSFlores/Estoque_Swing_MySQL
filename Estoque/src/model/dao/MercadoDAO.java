/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.connectionUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Mercado;

/**
 *
 * @author MatheusF
 */
public class MercadoDAO {
    
    public void create(Mercado mercado) {

        Connection con = connectionUser.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO mercado (nome , cidade, login, senha)VALUES (?, ?, ?, ?)");
            stmt.setString(1, mercado.getNome());
            stmt.setString(2, mercado.getCidade());
            stmt.setString(3, mercado.getLogin());
            stmt.setString(4, mercado.getSenha());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Dados Salvos!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar!" + ex);
        } finally {
            connectionUser.closeConnection(con, stmt);
        }

    }
    
    public boolean checkLogin(String login, String pass) {

        Connection con = connectionUser.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;

        try {
            stmt = con.prepareStatement("SELECT * FROM mercado WHERE login = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, pass);

            rs = stmt.executeQuery();

            if (rs.next()) {

                check = true;

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Logar!" + ex);
        }
        return (check);
    }
    
    public int idGet(String login) {

        Connection con = connectionUser.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int id=0;



        try {
            stmt = con.prepareStatement("SELECT * FROM mercado WHERE login = ? ");
            stmt.setString(1, login);
            rs = stmt.executeQuery();
            Mercado mercado = new Mercado();
            if (rs.next()) {
               id = rs.getInt("id");
              
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Usuario!" + ex);
        } finally {
            connectionUser.closeConnection(con, stmt, rs);
        }
          return id;
    }
    
}
