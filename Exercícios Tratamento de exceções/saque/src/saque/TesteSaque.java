package saque;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author letic
 */
public class TesteSaque extends IllegalArgumentException {
        @Override
        public String getMessage() {
            return "SAQUE INVÁLIDO";
        }
    }