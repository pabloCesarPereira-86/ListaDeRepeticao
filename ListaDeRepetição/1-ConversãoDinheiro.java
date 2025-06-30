/**
 * Conversão de moedas.
 * 
 * @author (Pablo César Pereiraa) 
 * @version (1.0)
 */
public class Dinheiro {
private int quantia; // em centavos
private String moeda; // p. ex. "BRL" (reais), "USD" (dólar), // "ARG" (peso argentino)

public Dinheiro(String moedaDoDinheiro, int quantiaDeDinheiro)
{	
moeda = moedaDoDinheiro;
quantia = quantiaDeDinheiro;
}

public int getQuantia()
{   
return quantia;
}

public String getMoeda()
{
return moeda;
}

public void selecionarTipoDeMoeda(String tipo){
 if (tipo.equalsIgnoreCase("BRL")||tipo.equalsIgnoreCase("ARG") || tipo.equalsIgnoreCase("USD")) {
    this.moeda = tipo;
    System.out.println("Tipo de moeda selecionada" + tipo);   
 } else {
    System.out.println("Tipo de Moeda inválido. Selecione 'BRL' ou 'ARG' OU 'USD' ");
    throw new IllegalArgumentException("ERRO !!");
 }
}

public static boolean isPositivo(double quantia) {
 if (quantia > 0) {
    System.out.println("O Saldo é positivo");
    return true; // Positivo
 } else if (quantia < 0) {
    System.out.println("O Saldo é negativo");
    return false; // Negativo
 } else {
    System.out.println("O Saldo é zero ");
    return false; // Neutro (zero)
 }
}

public boolean positivo()
{
 return true;
}

public boolean negativo()
{
 return false;
}

public boolean zero()
{
 return false;
}

public String toString()
{ 
      
return String.format("%.02f %s\n", quantia / 100f, moeda);
}

}