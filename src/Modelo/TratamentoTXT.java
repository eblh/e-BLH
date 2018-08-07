package Modelo;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

//MÉTODO REGRA PARA INSERIR OS DADOS NO TEXTFIELD
public class TratamentoTXT extends PlainDocument{
    private int qtdeMax;
    private String tipo = "";
    public TratamentoTXT(int maxLen, String Tipo){
        super();
        if(maxLen<=0)
            throw new IllegalArgumentException("Especifique a Quantidade!");
        qtdeMax = maxLen;
        tipo = Tipo;
    }
    
    @Override
    public void insertString(int offset, String str, AttributeSet attr)
    throws BadLocationException{
        if(str==null||getLength()==qtdeMax)
            return;
        int totalQuantia=(getLength()+str.length());
        if (totalQuantia<=qtdeMax){
            super.insertString(offset, str.replaceAll(tipo,""), attr);
            return;
        }
        String nova = str.substring(0, getLength()-qtdeMax);
        super.insertString(offset, nova, attr);
    }
    /*
    int tam = 0;
    String regex = "";
    
    public TratamentoTXT(int a, String r){
        this.tam = a;
        this.regex = r;
    }
    
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        int tamanho = (this.getLength() + str.length());   //getLength() é o tamanho do TXT
        if(tamanho <= tam){
            super.insertString(offs, str.replaceAll(regex,""), a);
            //super.insertString(offs, str.replaceAll("[aA-zZ]",""), a); NESTE CASO APENAS NÚMEROS PODERAM SER INSERIDOS
            //super.insertString(offs, str+" Diego", a); CONCATENADO
        }else{
            super.insertString(offs, str.replaceAll("[aA0-zZ9]",""), a);
        }
        
    }*/
}
