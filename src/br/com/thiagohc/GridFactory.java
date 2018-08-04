/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thiagohc;

import br.com.adrianob.layout.Tela;
import br.com.adrianob.layout.TelaFactory;

/**
 *
 * @author thiag
 */
public class GridFactory implements TelaFactory {

    @Override
    public String getNome() {
       return ("Tela Grid"); 
    }

    @Override
    public Tela create() {
        return new GridPrincipal();
    }
    
}
