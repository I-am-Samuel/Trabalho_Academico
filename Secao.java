

public class Secao {
    /*
    * b) Classe Seção que tem os seguintes atributos:
    * • de instância: nome do filme e horário da seção
    * • de classe : preço (50,00)
    * No mínimo os métodos:
    * • venda: recebe a fila e o assento. Se esse assento estiver desocupado, deve alterar
    * para ocupado e retornar true e, se o assento estiver ocupado retorna false. 
    */

    private String nomeFilme;
    private String[] vetHorario = new String[2];
    private Double preco = 50.0;
    private Assento assentos;
    private String situacao;


    public Secao(String nomeFilme, String horario) {
        this.nomeFilme = nomeFilme;
        this.vetHorario = horario.split(":");
        this.assentos = new Assento();
        this.situacao = assentos.getContAssentosVazios() > 0? "Disponível": "Lotada";
    }

    public boolean venda(int fila, int assento) {
        boolean disponivel = assentos.getAssento(fila, assento);

        if (disponivel) {
            // altera para ocupado
            assentos.setAssento(fila, assento, false); 

            return true;

        } else {
            return false;
        }
    }


    // NomeFilme
    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }
    public String getNomeFilme() {
        return this.nomeFilme;
    }

    
    // Horario 
    public void setVetHorario(String horario) {
        this.vetHorario = horario.split(":"); // entrada= 18:00
    }
    public String[] getVetHorario() {
        return this.horario;
    }
    public String getFormatHorario() {
        return this.horario[0] + ":" + this.horario[1];
    }


    // Preco
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getPreco() {
        return this.preco;
    }


    // Situcao
    public void setSituacao() {
        this.situacao = assentos.getContAssentosVazios() > 0? "Disponível": "Lotada";
    }
    public String getSituacao() {
        return this.situacao;
    }


    // Assentos
    public Assento getAssento() {
        return this.assentos;
    }


    // toString
    public String toString() {
        return "Seção {"
            + "\n" + "  NomeFilme: " + this.nomeFilme
            + "\n" + "  Horario: " + this.vetHorario[0] + "h" + this.vetHorario[1] + "min" 
            + "\n" + "  Preco: R$" + this.preco
            + "\n" + "  Situacao: " + this.situacao 
            + "\n" + "}";
    }
}
