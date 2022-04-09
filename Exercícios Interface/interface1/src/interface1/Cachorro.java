/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

/**
 *
 * @author letic
 */
public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao {

    private String raca;
    private String tamanho;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    @Override
    public void Amamentar() {
    }

    @Override
    public void emitirSom() {
    }

    @Override
    public void alimentar() {
    }

    @Override
    public void levarVeterinario() {
    }

    @Override
    public void chamarVeterinario() {
    }

    @Override
    public void brincar() {
    }

    @Override
    public void levarPassear() {
    }
    
}
