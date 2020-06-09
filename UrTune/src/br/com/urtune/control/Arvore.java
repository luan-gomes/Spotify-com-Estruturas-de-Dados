package br.com.urtune.control;

import br.com.urtune.model.Album;
import br.com.urtune.model.Artista;

public class Arvore <T extends Comparable<T>> {
    
    Artista raiz;

    
    public Arvore() {
	this.raiz = null;
    }
    
    public Artista getRaiz (){
        return this.raiz;
    }
    
    public void insert(Artista artist){
        //String name, String estilo
        //Artista n = new Artista(name, estilo);
        insert2(artist, null);
        
    }
    
    public void insert2(Artista n, Artista pai){
        
        if(pai == null)
            pai = raiz;
		
        if (raiz==null)
            raiz=n;
        else {
            if (n.getNome().compareTo(pai.getNome()) <= -1){
                if (pai.getEsquerdo()==null)
                    pai.setEsquerdo(n);
                else 
                    insert2(n,pai.getEsquerdo());
            } else if (n.getNome().compareTo(pai.getNome()) >= 1) {
                if (pai.getDireito()==null)
                    pai.setDireito(n);
                else 
                    insert2(n,pai.getDireito());
            }
        }
    }
    
    public Artista buscar(String dado, Artista no){
        if (no==null)
            return null;
        else if (no.getNome().compareTo(dado)==0)
            return no;
        else if (dado.compareTo(no.getNome())<=-1)
            return buscar(dado,no.getEsquerdo());
        else 
            return buscar(dado,no.getDireito());
    }
    
    public Artista remover(String dado, Artista no){
        if (no==null)
            return null;
        else if (no.getNome().compareTo(dado)==0)
            return no;
        else if (dado.compareTo(no.getNome())<=-1)
            return remover(dado,no.getEsquerdo());
        else if (dado.compareTo(no.getNome())>=1)
            return remover(dado,no.getDireito());
        else {
            Artista dir = no.getDireito();
            Artista esq = no.getEsquerdo();
            
            //Nó Folha
            if ((dir==null)&&(esq==null)){
                if (this.raiz==no)
                    this.raiz=null;
                else if (no==no.pai.getDireito())
                        no.pai.setDireito(null);
                else
                    no.pai.setEsquerdo(null);
            }
            //Apenas um filho
            else if (dir==null){
                if(no==this.raiz)
                    this.raiz=esq;
                else if (no==no.pai.getDireito())
                    no.pai.setDireito(esq);
                else
                    no.pai.setEsquerdo(esq);
            } else if (esq==null){
                if (no==this.raiz)
                    this.raiz=dir;
                else if (no==no.pai.getDireito())
                    no.pai.setDireito(dir);
                else
                    no.pai.setEsquerdo(dir);
            }
            
            //Dois filhos (de Francisco)
            else {
                Artista suc = this.getSucessor(no, true);
                if (suc!=dir){
                    suc.pai.setEsquerdo(suc.getDireito());
                    suc.setDireito(no.getDireito());
                }
                if (no==this.raiz){
                    this.raiz=suc;
                } else if (no==no.pai.getDireito()){
                    no.pai.setDireito(suc);
                } else
                    no.pai.setEsquerdo(suc);
                suc.setEsquerdo(no.getEsquerdo());
            }
        }
        return no;
    }
    
    public Artista getSucessor(Artista atual, Boolean primeiraVez) {
        Artista sucessor  = null;
        if(primeiraVez)
            sucessor = atual.getDireito();
        else
            sucessor = atual;
        if(sucessor.getEsquerdo()!=null) {
            return getSucessor(sucessor.getEsquerdo(), false);
        }
        return sucessor; 
	}
    
    public static void main(String[] args) {
        
        Arvore artistas = new Arvore();
        /*artistas.insert("Elton John", "POP");
        artistas.insert("O Poeta", "Pagode");
        System.out.println(artistas.buscar("Elton John", artistas.raiz));*/
        
    }
    
}
