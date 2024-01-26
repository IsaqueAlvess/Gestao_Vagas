package br.com.isaque.gestao_vagas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class PrimeiroTeste {
    
    @Test
    public void deve_Ser_Possivel_Calcular_Dois_Numeros(){
        var result = calculate(2, 3);
        assertEquals(result, 5);

    }

    @Test
    public void validar_valor_incorreto(){
        var result = calculate(2, 3);
        assertNotEquals(result, 4);
        ass
    }


    public static int calculate(int n1, int n2){
        return n1+n2;
    }
    

}
