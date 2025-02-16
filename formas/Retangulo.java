
/**
 * Escreva uma descrição da classe Retangulo aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Retangulo
{
    protected int base;
    protected int altura;

    /**
     * Construtor para objetos da classe Retangulo
     */
    public Retangulo(int base, int altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public int getBase()
    {
        return base;
    }
    
    public int getAltura()
    {
        return altura;
    }
    
    public int getArea()
    {
        return altura * base;
    }
    
    public int getPerimetro()
    {
        return (base*2) + (altura*2);
    }
    
    public double getDiagonal()
    {
        double diagonal;
        diagonal = Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));
        return diagonal;
    }
}
