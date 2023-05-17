/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.connectionUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Estoque;

/**
 *
 * @author mathe
 */
public class EstoqueDAO {

    public void create(Estoque estoque) {

        Connection con = connectionUser.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO estoque (produto, descricao, quantidade, valor)VALUES (?, ?, ?, ?)");
            stmt.setString(1, estoque.getProduto());
            stmt.setString(2, estoque.getDescricao());
            stmt.setInt(3, estoque.getQuantidade());
            stmt.setDouble(4, estoque.getValor());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Dados Salvos!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar!" + ex);
        } finally {
            connectionUser.closeConnection(con, stmt);
        }

    }

    public void update(Estoque estoque) {

        Connection con = connectionUser.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE estoque SET produto = ? ,descricao = ? ,quantidade = ? ,valor = ? WHERE id = ?");
            stmt.setString(1, estoque.getProduto());
            stmt.setString(2, estoque.getDescricao());
            stmt.setInt(3, estoque.getQuantidade());
            stmt.setDouble(4, estoque.getValor());
            stmt.setInt(5, estoque.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Dados Alterados!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Alterar!" + ex);
        } finally {
            connectionUser.closeConnection(con, stmt);
        }

    }
    public void delete(Estoque estoque) {

        Connection con = connectionUser.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM estoque WHERE id = ?");
            stmt.setInt(1, estoque.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Dados Deletados!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Deletar!" + ex);
        } finally {
            connectionUser.closeConnection(con, stmt);
        }

    }

    public List<Estoque> read() {

        Connection con = connectionUser.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Estoque> listEstoque = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM estoque");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Estoque estoque = new Estoque();
                estoque.setId(rs.getInt("id"));
                estoque.setProduto(rs.getString("produto"));
                estoque.setDescricao(rs.getString("descricao"));
                estoque.setQuantidade(rs.getInt("quantidade"));
                estoque.setValor(rs.getDouble("valor"));
                listEstoque.add(estoque);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao Listar o Estoque!" + ex);
        } finally {
            connectionUser.closeConnection(con, stmt, rs);
        }
        return listEstoque;
    }

    public List<Estoque> getEstoque(String produto) {
        Connection con = connectionUser.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Estoque> dadosEstoque = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM estoque WHERE produto = ? ");
            stmt.setString(1, produto);
            rs = stmt.executeQuery();
            Estoque estoque = new Estoque();
            if (rs.next()) {
                estoque.setProduto(produto);
                estoque.setDescricao(rs.getString("descricao"));
                estoque.setQuantidade(rs.getInt("quantidade"));
                estoque.setValor(rs.getDouble("valor"));
                dadosEstoque.add(estoque);
                return dadosEstoque;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Estoque!" + ex);
        } finally {
            connectionUser.closeConnection(con, stmt, rs);
        }
        return dadosEstoque;
    }
    
    
}
