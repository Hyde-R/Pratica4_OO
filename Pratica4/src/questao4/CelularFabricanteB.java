package questao4;

public class CelularFabricanteB extends CelularPreco implements Celular{

	private boolean tv;
	
	public CelularFabricanteB(double preco, boolean tv) {
		super(preco);
		this.tv = tv;
	}
	
	public boolean isTv() {
		return tv;
	}

	public void setTv(boolean tv) {
		this.tv = tv;
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
	
	public String temTv() {
		if(tv == true)
			return "SIM";
		else
			return "NÃO";
	}
	
	String atributosFabB() {
		return "O celular do fabricante A possui todos os recursos básicos" +
				"\nPossui rádio: " + temTv() + 
				"\nValor: " + String.format("%.2f", getPreco());
	}
}
