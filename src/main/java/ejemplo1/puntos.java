/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.Color;

/**
 *
 * @author altre
 */
public class puntos {

    public static int radio = 5;

    /**
     * @return the px
     */
    public int getPx() {
        return px;
    }

    /**
     * @param px the px to set
     */
    public void setPx(int px) {
        this.px = px;
    }

    /**
     * @return the py
     */
    public int getPy() {
        return py;
    }

    /**
     * @param py the py to set
     */
    public void setPy(int py) {
        this.py = py;
    }
    private int px;
    private int py;

    public puntos(int px, int py) {
        this.px = px;
        this.py = py;
    }
    private Color colp = Color.BLACK;

    public void cambiarcolor(Color colp) {
        this.colp = colp;
    }

    public void dibujar(ShapeRenderer rend) {
        if (rend != null)
        {
            rend.setColor(colp);
            rend.circle(getPx() * canvas.escala, getPy() * canvas.escala, radio);
        }
    }

    public puntos() {
    }

    @Override
    public String toString() {
        return "(" + getPx() + " , " + getPy() + ")";
    }

}
