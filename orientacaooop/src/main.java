import br.senac.rj.banco.modelo.Conta;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta1 = new Conta();
		conta1.setNumero(21);
		conta1.deposita(200);
		System.out.println(conta1.getSaldo());
		
	}

}
