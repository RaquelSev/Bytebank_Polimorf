public class TesteGerente {
    
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Nico");
        g1.setCpf("343434");
        g1.setSalario(5000.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        g1.setSenha(99);
        boolean autenticou = g1.autentica(99);

        System.out.println(autenticou);

        System.out.println(g1.getBonificacao());
    }
}
