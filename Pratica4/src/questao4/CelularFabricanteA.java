package questao4;

public class CelularFabricanteA extends CelularPreco implements Celular{
	
	private boolean radio;

	public CelularFabricanteA(double preco, boolean radio) {
		super(preco);
		this.radio = radio;
	}
	

	public boolean isRadio() {
		return radio;
	}
	

	public void setRadio(boolean radio) {
		this.radio = radio;
	}


	@Override
	public boolean ligarDesligar() {
		if(ligarDesligar())
			return true;
		else
			return false;
	}

	@Override
	public boolean camera() {
		if(camera())
			return true;
		else
			return false;
	}

	@Override
	public boolean foneOuvido() {
		if(foneOuvido())
			return true;
		else
			return false;
	}

	@Override
	public boolean controleVolume() {
		if(controleVolume())
			return true;
		else
			return false;
	}

	@Override
	public boolean mensagem() {
		if(ligarDesligar())
			return true;
		else
			return false;
	}

	@Override
	public boolean internet() {
		if(internet())
			return true;
		else
			return false;
	}

	@Override
	public boolean email() {
		if(email())
			return true;
		else
			return false;
	}

	@Override
	public boolean sistemaArquivos() {
		if(sistemaArquivos())
			return true;
		else
			return false;
	}
	
	public String temRadio() {
		if(radio == true)
			return "SIM";
		else
			return "NÃO";
	}
	
	String atributosFabA() {
		return "O celular do fabricante A possui todos os recursos básicos" +
				"\nPossui rádio: " + temRadio() + 
				"\nValor: " + String.format("%.2f", getPreco());
	}

	
}
