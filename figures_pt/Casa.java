public class Casa extends GrupoDeFormas {
    private Quadrado parede;
    private Quadrado janela;
    private Triangulo teto;

    public Casa() {
        parede = new Quadrado();
        parede.mudarCor("vermelho");
        parede.mudarTamanho(100);
        parede.moverVertical(50);
        
        janela = new Quadrado();
        janela.mudarCor("azul");
        janela.mudarTamanho(30);
        janela.moverVertical(70);
        janela.moverHorizontal(20);
        
        teto = new Triangulo();
        teto.mudarCor("verde");
        teto.mudarTamanho(60, 120);
        teto.moverVertical(30);
        
        adicionarForma(parede);
        adicionarForma(janela);
        adicionarForma(teto);
    }

    public void tornarVisível() {
        parede.tornarVisível();
        janela.tornarVisível();
        teto.tornarVisível();
    }

    public void tornarInvisível() {
        parede.tornarInvisível();
        janela.tornarInvisível();
        teto.tornarInvisível();
    }
}
