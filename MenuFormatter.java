import java.io.IOException;

public class MenuFormatter {
    private int numEspacamentoUni = 14;
    private String caracteres = "-="; // Mantenha 2 Caracteres
    
    public MenuFormatter() {
        // Usando somente para conseguir Instanciar a Classe nas outras Classes.
    }
	

	public void linha() {
		String msg = "";
		
		for (int i = 0; i < (2*this.numEspacamentoUni + 1); i++) {
			msg += this.caracteres;
		}
		
		System.out.println(msg);
	}
	
	
	public void titulo(String texto) {
		linha();
		this.centralizar(texto);
		linha();
	}
    
    
    public void centralizar(String texto) {
        String strEspacamento = "";
        int tamanhoEspacamento = this.numEspacamentoUni * 2 - (texto.length() / 2); // Dobra do Tamanho do Espacamento
        
        for (int i = 0; i < tamanhoEspacamento; i++) {
            strEspacamento += " ";

        }
        System.out.println(strEspacamento + " " +  texto);
    }
    
    
    public void limparTerminal() throws IOException, InterruptedException {
        //Limpa a tela no windows, no linux e no MacOS
        if (System.getProperty("os.name").contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            Runtime.getRuntime();
        }
    }


    public void mensagemTerminal(boolean isError, String msg) {
		linha();
    	
		if (isError) {
    		this.centralizar("[ERRO] - " + msg);
    		
    	} else {
    		this.centralizar("[INFO] - " + msg);
    		
    	}    		
    	linha();
    }


	public void delay(int tempo) {
		try {
	        Thread.sleep(tempo * 1000);  // transforma o tempo informado em milissegundos
	    } catch (InterruptedException e) {
	        // Trata a exceção caso a thread seja interrompida durante o sleep
	        e.printStackTrace();
	    }
	}
    
    // Número do Espaçamento Unitário
    public int getNumEspacamentoUni() {
        return numEspacamentoUni;
    }
    public void setNumEspacamentoUni(int numEspacamentoUni) {
        this.numEspacamentoUni = numEspacamentoUni;
    }

    // Caracteres
    public String getCaracteres() {
        return caracteres;
    }
    public void setCaracteres(String caracteres) {
        this.caracteres = caracteres;
    }
}