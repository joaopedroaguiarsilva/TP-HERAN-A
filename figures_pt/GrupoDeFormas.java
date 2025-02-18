import java.util.ArrayList;
import java.util.List;

public class GrupoDeFormas extends Formas {
    private List<Formas> formas;

    public GrupoDeFormas() {
        super(0, 0, "preto", true);
        this.formas = new ArrayList<>();
    }

    public void adicionarForma(Formas forma) {
        formas.add(forma);
    }

    public void removerForma(Formas forma) {
        formas.remove(forma);
    }

    @Override
    public void desenhar() {
        for (Formas forma : formas) {
            forma.desenhar();
        }
    }

    @Override
    protected void apagar() {
        for (Formas forma : formas) {
            forma.apagar();
        }
    }

    @Override
    public void moverHorizontal(int distancia) {
        for (Formas forma : formas) {
            forma.moverHorizontal(distancia);
        }
    }

    @Override
    public void moverVertical(int distancia) {
        for (Formas forma : formas) {
            forma.moverVertical(distancia);
        }
    }
}
