package figuras.triangulo;

import java.awt.*;

import editor.*;

public class HerramientaTriangulo implements Herramienta {
    public HerramientaTriangulo(Editor editor) {
        this.editor = editor;
    }

    public void pinchar(int x, int y) {
        // Habría que hacerlo mejor (no se considera el cambio de herramienta) NO HACERLO
        vertice[vertices++] = new Point(x, y);
        if (vertices == 3) {
            editor.getDibujo().AddFigura(new Triangulo(vertice[0], vertice[1], vertice[2]));
            vertices = 0;
            editor.finHerramienta();
        }
    }

    @Override
    public String toString() {
        return "Herramienta que crea Triángulos";
    }

    public void mover(int x, int y) {
    }

    public void soltar(int x, int y) {
    }

    private int vertices = 0;
    private Point[] vertice = new Point[3];
    private Editor editor;
}
