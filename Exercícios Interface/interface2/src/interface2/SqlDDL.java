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
public interface SqlDDL {
    public void create(String create);
    public void drop(String drop);
    public void alter(String alter);
}
