import cliente.Cliente;
public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Namikaze");
        cliente.setSobrenome("Minato");
        cliente.setSaldo(180.00);
        System.out.println(cliente.toString());

        cliente.depositar(150.00);
        System.out.println(cliente.toString());

    }
}
