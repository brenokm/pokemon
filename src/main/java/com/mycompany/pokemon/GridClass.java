/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokemon;

import java.util.ArrayList;

/**
 *
 * @author suporte01
 */
public class GridClass {
    
    
   private ArrayList<CadastroClass> cadastro =new ArrayList<>();
 
   public boolean salvar(CadastroClass ca){
       if(ca!=null){
           CadastroClass.add(ca);
           return true;
       }
       else{
           return false;
       }
   }
   public ArrayList<CadastroClass> retornar(){
       return cadastro;
   }
}
