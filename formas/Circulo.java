
/**
 * Escreva uma descrição da classe Circulo aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Circulo extends Forma
{
    private double raio;

    /**
     * Construtor para objetos da classe Circulo
     */
    public Circulo(double raio)
    {
        this.raio = raio;
    }

    @Override
    public double getArea()
    {
        double area;
        area= 3.14 * (Math.pow(raio,2));
        return area;
    }
    
    @Override
    public double getPerimetro()
    {
        return 2*3.14 * raio;
    }
}
