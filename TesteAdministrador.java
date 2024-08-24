public class TesteAdministrador {
    public static void main(String[] args) {
        Administrador administrador = new Administrador("José", "Rua C", "1234-1234", 10, 5000.0, 10.0, 1000.0);

        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Código do Setor: " + administrador.getCodigoSetor());
        System.out.println("Salário Base: " + administrador.getSalarioBase());
        System.out.println("Imposto: " + administrador.getImposto() + "%");
        System.out.println("Ajuda de Custo: " + administrador.getAjudaDeCusto());
        System.out.println("Salário Líquido: " + administrador.calcularSalario());

        administrador.setAjudaDeCusto(1500.0);
        System.out.println("Salário Líquido após aumento da ajuda de custo: " + administrador.calcularSalario());
    }
}