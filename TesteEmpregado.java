public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Maria", "Rua B", "8765-4321", 10, 5000.0, 10.0);

        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Código do Setor: " + empregado.getCodigoSetor());
        System.out.println("Salário Base: " + empregado.getSalarioBase());
        System.out.println("Imposto: " + empregado.getImposto() + "%");
        System.out.println("Salário Líquido: " + empregado.calcularSalario());

        empregado.setImposto(15.0);
        System.out.println("Salário Líquido após aumento do imposto: " + empregado.calcularSalario());
    }
}