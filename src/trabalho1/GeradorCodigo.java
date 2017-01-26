/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.sound.midi.SysexMessage;
import trabalho1.parser.LindinhoBaseVisitor;
import trabalho1.parser.LindinhoParser;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Classe principal do Gerador de Código.
 *
 * Recebe como input um arquivo com um programa em linguagem LA, sem erros
 * (tanto sintáticos quanto semânticos). Como output, gera o mesmo programa em
 * linguagem C, "traduzindo" de forma a preservar o máximo de características da
 * linguagem LA.
 */
public class GeradorCodigo extends LindinhoBaseVisitor<Void> {
    
    PrintWriter writer;

    String saida = "";
    
    int division;

    public GeradorCodigo(PrintWriter out, int division) {
        writer = out;
        this.division = division;
        System.out.print("oi\n");
    }  
    
    public void closeCerto() {
        writer.println(saida);
    }

    @Override
    public Void visitNota_figura(LindinhoParser.Nota_figuraContext ctx) {
        
        int init = 0, end = 0;
        if(ctx.repeticao != null)
            end = Integer.parseInt(ctx.NUMERO().toString());
        
        do{
            System.out.print("<note>\n");
            
            
            if(ctx.acidente_opcional() != null && ctx.acidente_opcional().getText().isEmpty() == false)
                visitAcidente_opcional(ctx.acidente_opcional());
            System.out.print("</note>\n");
        
        } while(++init < end);
            
        return null;
    }

    @Override
    public Void visitAcidente_opcional(LindinhoParser.Acidente_opcionalContext ctx) {
        if(ctx.sustenido_bmol_opcional() != null && ctx.sustenido_bmol_opcional().getText().isEmpty() == false){           
            if(ctx.sustenido_bmol_opcional().getText().equals("#"))
                System.out.print("<accidental>sharp</accidental>\n");
            else if(ctx.sustenido_bmol_opcional().getText().equals("b"))
                System.out.print("<accidental>flat</accidental>\n"); 
        }
        else
            System.out.print("<accidental>natural</accidental>\n");   
        return null;
    }

    

    @Override
    public Void visitTermo_nota(LindinhoParser.Termo_notaContext ctx) {
        if(!ctx.nota_oitava().isEmpty()){
            return null;
        }
        else{
        
            System.out.print("<rest/>\n");
        }
        
        return null;
    }
    
    


}


