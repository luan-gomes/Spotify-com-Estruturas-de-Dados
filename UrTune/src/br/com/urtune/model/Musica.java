package br.com.urtune.model;
public class Musica <T extends Comparable<T>> {
    private String nome;
    private String local;
    private Musica proximo;

    public Musica(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Musica getProximo() {
        return proximo;
    }

    public void setProximo(Musica proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public String toString(){
        return this.nome.toString()+" "+this.local.toString();
    }

}
