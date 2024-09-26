import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int deuCerto = 0;
        Cliente cliente = new PessoaFisica("João", "Rua A", new Date(), "123.456.789-00", 30, 'M');
        Conta conta = new ContaCorrente(123, cliente, 1000, 500);

        try {
            conta.depositar(-10000000);
            deuCerto++;
        } catch (ValorNegativoException e) {
            System.out.println(e.getMessage());
        }

        try {
            conta.sacar(-10);
            deuCerto++;
        } catch (ValorNegativoException | SemLimiteException e) {
            System.out.println(e.getMessage());
        }

        try {
            conta.sacar(100);
            deuCerto++;
        } catch (ValorNegativoException | SemLimiteException e) {
            System.out.println(e.getMessage());
        }

        try {
            conta.setLimite(-70);
            deuCerto++;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(deuCerto);
    }
}
