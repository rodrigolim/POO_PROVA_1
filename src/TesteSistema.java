public class TesteSistema {

    public static void main(String[] args) {

        // 1 e 2 - Criação dos departamentos
        Departamento departamentoCompras = new Departamento("Compras");
        Departamento departamentoVendas = new Departamento("Vendas");

        // 3 e 4 - Criação dos cargos
        Cargo cargoComprador = new Cargo("Comprador");
        Cargo cargoVendedor = new Cargo("Vendedor");

        // 5 - Criação dos funcionários (2 via construtor parametrizado, 1 via construtor default)
        Funcionario funcionario1 = new Funcionario("Ana Silva", "111.111.111-11", departamentoCompras, cargoComprador, 1500.00);
        Funcionario funcionario2 = new Funcionario("Bruno Souza", "222.222.222-22", departamentoVendas, cargoVendedor, 1800.00);
        Funcionario funcionario3 = new Funcionario();

        // 6 - Imprimir cada funcionário
        System.out.println("=== Funcionários recém-criados ===");
        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println(funcionario3);

        // 7 - Alterar dados do funcionário criado com construtor default
        funcionario3.alterarDados("Carla Mendes", "333.333.333-33", departamentoCompras, cargoVendedor, 1300.00);
        System.out.println("\n=== Funcionário 3 após alterarDados() ===");
        System.out.println(funcionario3);

        // 8 - Aplicar reajuste de 15% no salário do primeiro funcionário
        funcionario1.aplicarReajuste(15.0);
        System.out.println("\n=== Funcionário 1 após aplicarReajuste(15.0) ===");
        System.out.println(funcionario1);

        // 9 - Demitir o terceiro funcionário
        funcionario3.demitir();

        // 10 - Imprimir todos os funcionários
        System.out.println("\n=== Todos os funcionários ===");
        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println(funcionario3);
    }
}
