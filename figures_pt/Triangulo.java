import java.awt.*;

/**
 * A triangle that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

public class Triangulo extends Formas
{
    private int altura;
    private int base;

    /**
     * Create a new triangle at default position with default color.
     */
    public Triangulo()
    {
        altura = 60;
        base = 70;
        posiçãoX = 210;
        posiçãoY = 140;
        cor = "green";
        estáVisível = false;
    }

    /**
     * Draw the triangle with current specifications on screen.
     */
    private void desenhar()
    {
        if(estáVisível) {
            Canvas canvas = Canvas.getCanvas();
            int[] xpoints = { posiçãoX, posiçãoX + (base/2), posiçãoX - (base/2) };
            int[] ypoints = { posiçãoY, posiçãoY + altura, posiçãoY + altura };
            canvas.draw(this, cor, new Polygon(xpoints, ypoints, 3));
            canvas.wait(10);
        }
    }
    
    /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     */
    public void mudarTamanho(int novaAltura, int novaBase)
    {
        apagar();
        altura = novaAltura;
        base = novaBase;
        desenhar();
    }
}