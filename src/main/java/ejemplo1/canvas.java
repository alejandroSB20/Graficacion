/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.Color;
import javax.swing.DefaultListModel;

/**
 *
 * @author altre
 */
public class canvas implements ApplicationListener {

    public static int escala = 30;
    Principal val;

    public DefaultListModel<figuras> ListaFiguras;

    public DefaultListModel<figuras> getListaFiguras() {

        if (ListaFiguras == null)
        {
            ListaFiguras = new DefaultListModel<>();
        }

        return ListaFiguras;
    }

    public canvas(Principal principal) {
        this.val = principal;
        ListaFiguras = new DefaultListModel<>();

    }
    SpriteBatch batch;
    BitmapFont font;
    ShapeRenderer shape;

    @Override
    public void create() {
        System.out.println("Creando");
        batch = new SpriteBatch();
        font = new BitmapFont();
        shape = new ShapeRenderer();

    }

    @Override
    public void resize(int i, int i1) {
        System.out.println("resize" + i + " " + i1);
    }

    @Override
    public void render() {

        System.out.println("render");
        Gdx.gl.glClearColor(0.82f, 0.81f, 0.81f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        shape.begin(ShapeRenderer.ShapeType.Line);
        shape.setColor(Color.DARK_GRAY);
        shape.line(1 * escala, 0, 1 * escala, Gdx.graphics.getHeight());
        shape.line(0, 1 * escala, Gdx.graphics.getWidth(), 1 * escala);
        shape.end();

        shape.begin(ShapeRenderer.ShapeType.Filled);
        batch.begin();
        font.setColor(com.badlogic.gdx.graphics.Color.BLACK);
        for (int i = 0; i < ListaFiguras.size(); i++)
        {
            ListaFiguras.get(i).dibujar(shape);
        }

        int h = Gdx.graphics.getHeight();
        int w = Gdx.graphics.getWidth();
        int i = 0, j = 0, x = 0;

        for (i = 0; i <= h; i++)
        {
            shape.rectLine(0, i * escala, w, i * escala, 1, com.badlogic.gdx.graphics.Color.BLACK, com.badlogic.gdx.graphics.Color.BLACK);
            font.draw(batch, "" + i, i * escala - 5, 15);
            font.draw(batch, "" + i, 1, i * escala+10);

        }
        for (j = 0; j <= w; j++)
        {
            shape.rectLine(j * escala, 0, j * escala, h, 1, com.badlogic.gdx.graphics.Color.BLACK, com.badlogic.gdx.graphics.Color.BLACK);

        }

        batch.end();
        shape.end();

    }

    @Override
    public void pause() {
        System.out.println("pause");
    }

    @Override
    public void resume() {
        System.out.println("resume");
    }

    @Override
    public void dispose() {
    }

}
