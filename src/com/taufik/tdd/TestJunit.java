/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taufik.tdd;

/**
 *
 * @author Taufik AB
 */
public class TestJunit implements Adder,Substraction,Calculator{

    @Override
    public long adder(long... operands) {
        long result =0;
        for(long add : operands){
            result+=add;
        }
        return result;
    }

    @Override
    public long substraction(long... op) {
        long result =op[0];
        for(int i =1;i<op.length;i++){
            result-=op[i];
        }
        return result;
    }

    @Override
    public long perkalian(long... op) {
        long result = 1;
        for(long o : op){
            result *=o;
        }
        return result;
    }

    @Override
    public long pembagian(long a, long b) {
        return a/b;
    }

    @Override
    public long pangkat(long a, long b) {
        long result =1;
        for(int i=0;i<b;i++){
            result*=a;
            
        }
        return result;
    }
    
}
