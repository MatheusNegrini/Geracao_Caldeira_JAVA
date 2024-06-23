package br.com.matheusnegrini.screenmatch.modelos;

public class Titulo {
    private String nome;
    private String genero;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    private int duracaoEmMinutos;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibirFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Data de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    public double somaMedia(){

        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
