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
public interface SqlDML {
    public void insert(String insert);
    public void update(String update);
    public void delete(String delete);
    public String select(String select);
}
