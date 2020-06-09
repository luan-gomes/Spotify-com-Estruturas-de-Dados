package br.com.urtune.model;

import br.com.urtune.control.ListaCircular;
import br.com.urtune.model.Album;

public class Artista {
    private String nome;
    private String estilo;
    public Artista pai;
    public Artista esquerdo;
    public Artista direito;
    public ListaCircular albuns;

    public Artista(String nome, String estilo) {
        this.nome = nome;
        this.estilo = estilo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public Artista getPai() {
        return pai;
    }

    public void setPai(Artista pai) {
        this.pai = pai;
    }

    public Artista getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(Artista esquerdo) {
        this.esquerdo = esquerdo;
    }

    public Artista getDireito() {
        return direito;
    }

    public void setDireito(Artista direito) {
        this.direito = direito;
    }
    
    @Override
    public String toString(){
        return this.nome.toString();
    }
    
    /*Lista de álbuns
    
    Album primeiro;
    Album atual = primeiro;
	
	
    public void inserir(String name, int size) {
        Album novo = new Album(name, size);
        Album auxiliar = primeiro;

        if(this.primeiro == null) { 
                this.primeiro = novo;
        }else{
            while((auxiliar.getProximo() != null) && (auxiliar.getNome().compareTo(novo.getNome())==-1)){
                    auxiliar = auxiliar.getProximo();
            }
            if(auxiliar == this.primeiro){
                if(this.primeiro.getNome().compareTo(novo.getNome())==-1){
                    this.primeiro.setProximo(novo);
                    novo.setAnterior(this.primeiro);
            }else {
                novo.setProximo(this.primeiro);
                this.primeiro.setAnterior(novo);
                this.primeiro = novo;
            }
            }else {
                if(auxiliar.getProximo() == null) {
                        novo.setAnterior(auxiliar);
                        auxiliar.setProximo(novo);
                }else {
                    novo.setProximo(auxiliar);
                    novo.setAnterior(auxiliar.getAnterior());
                    auxiliar.getAnterior().setProximo(novo);
                    auxiliar.setAnterior(novo);
                }
            }
        }
    }
        
       
	public Album remover(String name) {//arrumada 
            Album auxiliar = primeiro;
            Album retorno = null;
            while((auxiliar != null) && (auxiliar.getNome().compareTo(name) != 0)) {
                    auxiliar = auxiliar.getProximo();
            }
            if(auxiliar == this.primeiro) {
                retorno = this.primeiro;
                retorno.setProximo(null);
                this.primeiro = this.primeiro.getProximo();
                this.primeiro.setAnterior(null);
            }else if(auxiliar != null)
                auxiliar.getAnterior().setProximo(auxiliar.getProximo());
            auxiliar.getProximo().setAnterior(auxiliar.getAnterior());
            auxiliar.setProximo(null);
            auxiliar.setAnterior(null);
            return retorno;
	}
	
	
	public Album buscar(String name) {
            if(atual== null)
                atual = primeiro;
            while((atual != null) && (atual.getNome().compareTo(name))!= 0){
                if (atual.getNome().compareTo(name)==-1){
                    atual = atual.getProximo();
                }
                else 
                    atual=atual.getAnterior();
            }
		return atual;
	}
	
	public String toString() {
            String s = "";
            Album auxiliar = primeiro;
            while(auxiliar != null){
                s+= auxiliar.getNome().toString() + " - ";
                auxiliar = auxiliar.getProximo();
            }
            return s;
	} 
	*/
    
    public static void main(String[] args) {
        
    }
}
