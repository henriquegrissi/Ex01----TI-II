package testee2;

public class Usuario {

	private String Rua;
	private int Num;
	private int Andar;
	private int Metragem;
	
	public Usuario() {
		this.Rua = "";
		this.Num = 0;
		this.Andar = 0;
		this.Metragem = 0;
	}
	
	public Usuario(String Rua, int Num, int Andar, int Metragem) {
		this.Rua = Rua;
		this.Num = Num;
		this.Andar = Andar;
		this.Metragem = Metragem;
	}

	public String getRua() {
		return Rua;
	}

	public void setRua(String Rua) {
		this.Rua = Rua;
	}

	public int getNum() {
		return Num;
	}

	public void setNum(int Num) {
		this.Num = Num;
	}

	public int getAndar() {
		return Andar;
	}

	public void setAndar(int Andar) {
		this.Andar = Andar;
	}

	public int getMetragem() {
		return Metragem;
	}

	public void setMetragem(int Metragem) {
		this.Metragem = Metragem;
	}

	@Override
	public String toString() {
		return "Apartamento [Rua =" + Rua + ", Num =" + Num + ", Andar =" + Andar + ", Metragem =" + Metragem+ "]";
	}	
}