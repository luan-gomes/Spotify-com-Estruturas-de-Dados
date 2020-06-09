package br.com.urtune.control;

import br.com.urtune.model.Musica;

public class Pilha {
    private Musica [] album;
    private int topo;
    
    public Pilha(int size){
        topo=-1;
        album = new Musica [size]; 
    }
    
    public boolean push (String name, String local){
        if (!isFull()){
            topo++;
            Musica music = new Musica(name, local);
            album[topo]=music;
            return true; 
        } return false;
    }
    
    public boolean isFull(){
        return topo == album.length-1;
    }
    
    public boolean isEmpty(){
        return topo==-1;
    }
    
    public Musica pop(){
        if (!isEmpty()){
            Musica aux = album[topo];
            topo--;
            return aux;
            //return pilha[topo--];
        } return null;
    }
    
    /*@Override
    public String toString(){
        String s = "O álbum "+getNome()+" do cantor "+"tem as seguintes músicas:";
        Musica<T> auxiliar = albumtopo;
        
        while (auxiliar!=null){
            s+=auxiliar.getNome().toString()+"\n";
            auxiliar = auxiliar.getProximo();
        }
        return s;
    }*/
}
