
/**
 * Escreva uma descrição da classe Formas aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public abstract class Formas
{
    protected int posiçãoX;
    protected int posiçãoY;
    protected String cor;
    protected boolean estáVisível;
    
    /**
     * Construtor para objetos da classe Formas
     */
    public Formas(int posiçãoX, int posiçãoY, String cor, boolean estáVisível)
    {
        this.posiçãoX = posiçãoX;
        this.posiçãoY = posiçãoY;
        this.cor = cor;
        this.estáVisível = estáVisível;
    }

    /**
     * Make this triangle visible. If it was already visible, do nothing.
     */
    public void tornarVisível()
    {
        estáVisível = true;
        desenhar();
    }
    
    /**
     * Make this triangle invisible. If it was already invisible, do nothing.
     */
    public void tornarInvisível()
    {
        apagar();
        estáVisível = false;
    }
    
    /**
     * Move o quadrado alguns pixels para a direita.
     */
    public void moverDireita()
    {
        moverHorizontal(20);
    }

    /**
     * Move o quadrado alguns pixels para a esquerda.
     */
    public void moverEsquerda()
    {
        moverHorizontal(-20);
    }

    /**
     * Move o quadrado alguns pixels para cima.
     */
    public void moverCima()
    {
        moverVertical(-20);
    }

    /**
     * Move o quadrado alguns pixels para baixo.
     */
    public void moverBaixo()
    {
        moverVertical(20);
    }

    /**
     * Move o quadrado horizontalmente pela 'distância' em pixels.
     */
    public void moverHorizontal(int distância)
    {
        apagar();
        posiçãoX += distância;
        desenhar();
    }

    /**
     * Move o quadrado verticalmente pela 'distância' em pixels.
     */
    public void moverVertical(int distância)
    {
        apagar();
        posiçãoY += distância;
        desenhar();
    }

    /**
     * Move lentamente o quadrado horizontalmente pela 'distância' em pixels.
     */
    public void moverHorizontalLentamente(int distância)
    {
        int delta;

        if(distância < 0) 
        {
            delta = -1;
            distância = -distância;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distância; i++)
        {
            posiçãoX += delta;
            desenhar();
        }
    }

    /**
    * Move lentamente o quadrado verticalmente pela 'distância' em pixels.
     */
    public void moverVerticalLentamente(int distância)
    {
        int delta;

        if(distância < 0) 
        {
            delta = -1;
            distância = -distância;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distância; i++)
        {
            posiçãoY += delta;
            desenhar();
        }
    }

    /**
     * Muda a cor. Cores válidas são "vermelho", "amarelo", "azul", "verde",
     * "magenta" e "preto".
     */
    public void mudarCor(String novaCor)
    {
        cor = novaCor;
        desenhar();
    }
    
    public abstract void desenhar();
    
      /**
     * Apaga o quadrado da tela.
     */
    protected void apagar()
    {
        if(estáVisível) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}