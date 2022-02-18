package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {
	
	private String text;
	private int likes;
	private boolean isFeatured;

	
	/**
	 * Complete con su implementación
	 */
	
	public void setText(String unTexto) {
		this.text = unTexto;
	}
	
	public WallPost text(String unTexto) {
		this.text = unTexto;
		return this;
	}
	
	public String getText() {
		return this.text;
	}
	
	public WallPost toggleFeatured() {
		this.isFeatured = !(this.isFeatured);
		return this;
	}
	
	public boolean isFeatured() {
		return isFeatured;
	}
	
	public int getLikes() {
		return this.likes;
	}
	
	public WallPost like() {
		this.likes++;
		return this;
	}
	
	public WallPost dislike() {
		if(this.likes > 0 ) {
			this.likes--;			
		}
		return this;
	}
	
	
	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
	
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }    

}
