public class ContaPoupanca extends Conta {
    public ContaPoupanca(int numero, Cliente dono, double saldo, double limite) {
        super(numero, dono, saldo, limite);
    }

    @Override
    public double calcularTaxas() {
        return 0f;
    }

    @Override
    public void setLimite(double limite) {
        if (limite < 100 || limite > 1000) {
            throw new IllegalArgumentException("Limite deve estar entre 100 e 1000.");
        }
        super.limite = limite;
    }
}