package Modelo;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

//MÉTODO DE REGRA PARA INSERIR OS DADOS NO JTEXTFIELD
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
}
