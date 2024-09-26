public class ContaUniversitaria extends Conta {
    public ContaUniversitaria(int numero, Cliente dono, double saldo, double limite) {
        super(numero, dono, saldo, limite);
    }

    @Override
    public double calcularTaxas() {
        return 0f;
    }

    @Override
    public void setLimite(double limite) {
        if (limite < 0 || limite > 500) {
            throw new IllegalArgumentException("Limite deve estar entre 0 e 500.");
        }
        super.limite = limite;
    }
}