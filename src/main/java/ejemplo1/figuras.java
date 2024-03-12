/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import javax.swing.DefaultListModel;



/**
 *
 * @author altre
 */
public class figuras {
    private String nombre;
    public int escale=20;
    
    private DefaultListModel<puntos> listaPuntos;
   
    public figuras(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void dibujar(ShapeRenderer rend)
    {
        for (int i = 0; i < getListaPuntos().size(); i++) {
            getListaPuntos().get(i).dibujar(rend);   
            if(i<getListaPuntos().size()-1){
                rend.rectLine(getListaPuntos().get(i).getPx()*canvas.escala,
                    getListaPuntos().get(i).getPy()*canvas.escala,
                    getListaPuntos().get(i+1).getPx()*canvas.escala,
                    getListaPuntos().get(i+1).getPy()*canvas.escala, 4);
            }
            else{
                rend.rectLine(getListaPuntos().get(i).getPx()*canvas.escala,
                    getListaPuntos().get(i).getPy()*canvas.escala,
                    getListaPuntos().get(0).getPx()*canvas.escala,
                    getListaPuntos().get(0).getPy()*canvas.escala, 4);
            }
            
        }   
                
    }

    
    /**
     * @return the listaPuntos
     */
    public DefaultListModel<puntos> getListaPuntos() {
        
        if(listaPuntos == null)
        {
            listaPuntos = new DefaultListModel<>();
        }
        
        return listaPuntos;
    }

    /**
     * @param listaPuntos the listaPuntos to set
     */
    public void setListaPuntos(DefaultListModel<puntos> listaPuntos) {
        this.listaPuntos = listaPuntos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
