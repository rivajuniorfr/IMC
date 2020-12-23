package Imc;

public class Paciente {
	
	// ---- Atributos ----
	
	String nomePaciente;
	int idade;
	String sexo;
	double peso;
	double altura;
	double imc;
	
	// ---- M�todos ----
	
	public Paciente(String n, int i, String s) {
		
		this.nomePaciente = n;
		this.idade = i ;
		this.sexo = s ;
				
	}
	
	void cliente() {
		
		System.out.println("Paciente: " + this.nomePaciente);
		System.out.println("idade: " + this.idade);
		System.out.println("sexo: " +  this.sexo);
		
	}
	
	void imc() {
		
		this.imc = this.peso / (this.altura * this.altura);
		
		System.out.println("�ndice de Massa Corporal(IMC): " + this.imc);	
	}
	
	
	void alerta() {
	
	if ( this.imc >= 25.0 && this.imc <= 29.9 ) {
		
		System.out.println("Paciente est� com Excesso de Peso");
	}
	
        if ( this.imc >= 30.0 && this.imc <= 34.9 ) {
		
		    System.out.println("Paciente est� com Obesidade Classe I");
	    }
        
            if ( this.imc >= 35.0 && this.imc <= 39.9 ) {
    		
    		    System.out.println("ALERTA - Paciente est� com Obesidade Classe II");
    	    }
        
                if ( this.imc >= 40 ) {
        		
    		       System.out.println("URGENTE - Paciente est� com Obesidade Classe III");
    	    }
            
	}
	
}
