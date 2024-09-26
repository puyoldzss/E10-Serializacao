import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int deuCerto = 0;
        Cliente cliente = new PessoaFisica("João", "Rua A", new Date(), "123.456.789-00", 30, 'M');
        Conta conta = new ContaCorrente(123, cliente, 1000, 500);

        try {
            conta.depositar(-100);
            deuCerto++;
        } catch (ValorNegativoException e) {
            System.out.println(e.getMessage());
        }

        try {
            conta.sacar(-50);
            deuCerto++;
        } catch (ValorNegativoException | SemLimiteException e) {
            System.out.println(e.getMessage());
        }

        try {
            conta.sacar(600);
            deuCerto++;
        } catch (ValorNegativoException | SemLimiteException e) {
            System.out.println(e.getMessage());
        }

        try {
            conta.setLimite(-200);
            deuCerto++;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(deuCerto);
    }
}