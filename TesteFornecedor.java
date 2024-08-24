public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("João", "Rua A", "1234-5678", 1000.0, 500.0);

        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Valor Crédito: R$ " + fornecedor.getValorCredito());
        System.out.println("Valor Dívida: R$ " + fornecedor.getValorDivida());
        System.out.println("Saldo: R$ " + fornecedor.obterSaldo());

        fornecedor.setValorDivida(700.0);
        System.out.println("Saldo após atualização da dívida: R$ " + fornecedor.obterSaldo());
    }
}