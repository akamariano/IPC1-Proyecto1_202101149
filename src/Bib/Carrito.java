/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bib;

/**
 *
 * @author Mariano Rack
 */
public class Carrito {
    private int isbn;
    private String user;
    private String autor;
    private String año;
    private String titulo;
    private String descripcion;
    private String palabras;
    private String edicion;
    private String temas;
    private int copias;
    private String area;
    private String categoria;
    private String tipo;
    private String isbnreal;
    public Carrito(String autor,String año,String titulo,String descripcion,String palabras,String edicion,String temas, int copias,String area, String categoria,int isbn,String tipo,String isbnreal,String user){
        this.autor=autor;
         this.año=año;
          this.titulo=titulo;
           this.descripcion=descripcion;
            this.palabras=palabras;
             this.edicion=edicion;
             this.temas=temas;
             this.copias=copias;
             this.area=area;
             this.categoria=categoria;
             this.isbn=isbn;
             this.tipo=tipo;
             this.isbnreal=isbnreal;
    }

    /**
     * @return the isbn
     */
    public int getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the año
     */
    public String getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(String año) {
        this.año = año;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the palabras
     */
    public String getPalabras() {
        return palabras;
    }

    /**
     * @param palabras the palabras to set
     */
    public void setPalabras(String palabras) {
        this.palabras = palabras;
    }

    /**
     * @return the edicion
     */
    public String getEdicion() {
        return edicion;
    }

    /**
     * @param edicion the edicion to set
     */
    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    /**
     * @return the temas
     */
    public String getTemas() {
        return temas;
    }

    /**
     * @param temas the temas to set
     */
    public void setTemas(String temas) {
        this.temas = temas;
    }

    /**
     * @return the copias
     */
    public int getCopias() {
        return copias;
    }

    /**
     * @param copias the copias to set
     */
    public void setCopias(int copias) {
        this.copias = copias;
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the isbnreal
     */
    public String getIsbnreal() {
        return isbnreal;
    }

    /**
     * @param isbnreal the isbnreal to set
     */
    public void setIsbnreal(String isbnreal) {
        this.isbnreal = isbnreal;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }
}
