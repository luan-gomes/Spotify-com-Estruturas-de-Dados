package br.com.urtune.control;

import br.com.urtune.model.Album;
//import br.com.urtune.model.Artista;

public class ListaCircular {
    //public Artista artista;
    public Album primeiro;
    public Album noAtual;
    public int qtdNo = 0;
    public int indiceNoAtual = 0;

    public ListaCircular() {
            this.primeiro = null;
    }

    public void inserir(Album novo){
        qtdNo++;

        if(this.primeiro== null){
            this.primeiro =novo;
            noAtual = this.primeiro;
            this.primeiro.setProximo(novo);
            this.primeiro.setAnterior(novo);
        }else{
            Album temp = this.primeiro;
            //apenas 1 nó
            if(temp.getProximo() == temp) {
                temp.setProximo(novo);
                temp.setAnterior(novo);
                novo.setAnterior(temp);
                novo.setProximo(temp);

            //o nó inserido é menor que o primeiro nó
            }else if(novo.getNome().compareTo(this.primeiro.getNome() ) <= -1) {
                novo.setProximo(this.primeiro);
                novo.setAnterior(this.primeiro.getAnterior());
                this.primeiro.getAnterior().setProximo(novo);
                this.primeiro.setAnterior(novo);

                this.primeiro = novo;
                noAtual = this.primeiro.getAnterior();
            }else{
            //enquanto o novo nó for maior que o temp (até encontrar alguém maior
            //que ele
                while((novo.getNome().compareTo(temp.getNome() ) >= 1)) { 
                    temp = temp.getProximo();
                    //fechou um ciclo
                    if(temp == this.primeiro)
                            break;
                }
                novo.setProximo(temp);
                temp.getAnterior().setProximo(novo);
                novo.setAnterior(temp.getAnterior());
                temp.setAnterior(novo);

            }			
        }
    }

    public void remover(String name){
        Album n= buscarOtim(name);
        if(n != null){
            qtdNo--;
            if(n == this.primeiro){
                this.primeiro.getAnterior().setProximo(this.primeiro.getProximo());
                this.primeiro.getProximo().setAnterior(this.primeiro.getAnterior());
                this.primeiro = this.primeiro.getProximo();
            }else{
                n.getAnterior().setProximo(n.getProximo());
                n.getProximo().setAnterior(n.getAnterior());
            }
        }
    }


    public Album buscar(String name) {
        Album temp = this.primeiro;

        while(name.compareTo(temp.getNome())>= 1){ 
            temp = temp.getProximo();
            //fechou um ciclo ou passou do valor
            if((temp == this.primeiro) || (name.compareTo(temp.getNome()) <= -1))
                return null;
        }
        return temp;
    }


    public Album buscarOtim(Comparable valor){

        boolean prior = true;
        boolean next = true;
        //valor buscado é menor que o currenteNode?
        if(valor.compareTo(noAtual.getNome())  <= -1 ){
            //estou em 90% do final da lista
            if(indiceNoAtual < qtdNo*0.9){
                    prior = false;
            }
        }else if(valor.compareTo( noAtual.getNome())  >= 1 ){
            //estou em 10% do final da lista
            if(indiceNoAtual < qtdNo*0.1) {
                next = false;
            }
        }else{
            return noAtual;
        }
        
        Album stop = noAtual;
        if( (prior) || (!next))
            this.obterNoAnterior();
        else if( (next) || (!prior)) 
            this.obterNoProximo();
        while(valor.compareTo(noAtual.getNome() ) != 0){ 
            if( (prior) || (!next))
                this.obterNoAnterior();
            else if( (next) || (!prior)) 
                this.obterNoProximo();
            //fechou um ciclo
            if(noAtual == stop)
                return null;
        }
        return noAtual;
    }

    public Album getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Album primeiro) {
        this.primeiro = primeiro;
    }
    
    public Album obterNoProximo() {
        indiceNoAtual++;
        noAtual = noAtual.getProximo();
        return noAtual;
    }

    public Album obterNoAnterior() {
        indiceNoAtual--;
        noAtual = noAtual.getAnterior();
        return noAtual;
    }

    public void resetCurrentNode() {
        this.noAtual = this.primeiro.getAnterior();
    }

    public String toString() {
        String s = "";
        resetCurrentNode();
        Album stop = noAtual;
        do {
            obterNoProximo();
            s+= noAtual.getNome().toString() + "\n ";
        }while(noAtual !=  stop);
        return s;
        
    }
    
    public String [] itens(){
        String s[] = new String [5];
        int i=0;
        resetCurrentNode();
        Album stop = noAtual;
        do {
            obterNoProximo();
            s[i] = noAtual.getNome();
            i++;
        }while(noAtual !=  stop);
        return s;
    }
} 
