/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface2;

/**
 *
 * @author letic
 */
public interface BancoDados extends SqlDCL, SqlDML, SqlDDL {
    public void abrirConexao();
    public void fecharConexao();
}
