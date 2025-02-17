
/**
 * Escreva uma descrição da classe Retangulo aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Retangulo extends Forma
{
    protected double base;
    protected double altura;

    /**
     * Construtor para objetos da classe Retangulo
     */
    public Retangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public double getBase()
    {
        return base;
    }
    
    
    public double getAltura()
    {
        return altura;
    }
    
    @Override
    public double getArea()
    {
        return altura * base;
    }
    
    @Override
    public double getPerimetro()
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
