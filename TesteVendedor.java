public class TesteVendedor {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Valentina", "Rua E", "8765-5678", 10, 5000.0, 10.0, 10000.0, 15.0);

        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Código do Setor: " + vendedor.getCodigoSetor());
        System.out.println("Salário Base: " + vendedor.getSalarioBase());
        System.out.println("Imposto: " + vendedor.getImposto() + "%");
        System.out.println("Valor Vendas: " + vendedor.getValorVendas());
        System.out.println("Comissão: " + vendedor.getComissao() + "%");
        System.out.println("Salário Líquido: " + vendedor.calcularSalario());

        vendedor.setComissao(20.0);
        System.out.println("Salário Líquido após aumento da comissão: " + vendedor.calcularSalario());
    }
}