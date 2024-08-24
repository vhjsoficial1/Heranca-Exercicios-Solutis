public class TesteOperario {
    public static void main(String[] args) {
        Operario operario = new Operario("Mário", "Rua D", "5678-5678", 10, 5000.0, 10.0, 1000.0, 15.0);

        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Código do Setor: " + operario.getCodigoSetor());
        System.out.println("Salário Base: " + operario.getSalarioBase());
        System.out.println("Imposto: " + operario.getImposto() + "%");
        System.out.println("Valor Produção: " + operario.getValorProducao());
        System.out.println("Comissão: " + operario.getComissao() + "%");
        System.out.println("Salário Líquido: " + operario.calcularSalario());

        operario.setComissao(20.0);
        System.out.println("Salário Líquido após aumento da comissão: " + operario.calcularSalario());
    }
}