package br.com.urtune.model;

import br.com.urtune.control.Pilha;

public class Album <T extends Comparable<T>> {
    private String nome;
    private Artista artista;
    public Pilha musicas;
    private Album proximo;
    private Album anterior;
    
    public Album(String name, Artista artist){
        this.nome=name;
        this.artista=artist;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Album getProximo() {
        return proximo;
    }

    public void setProximo(Album proximo) {
        this.proximo = proximo;
    }

    public Album getAnterior() {
        return anterior;
    }

    public void setAnterior(Album anterior) {
        this.anterior = anterior;
    }

    public Pilha getMusicas() {
        return musicas;
    }

    public void setMusicas(Pilha musica) {
        this.musicas = musica;
    }
    
    public String toString(){
        String s = new String();
        s=this.nome;
        return s;
    }
    
    public static void main(String[] args) {
        /*Album album1 = new Album("JOANNE",10);
        album1.push("Joanne", "Onde o mal não me alcança");
        System.out.println(album1.getNome());
        System.out.println(album1.pop());*/
    }
}
