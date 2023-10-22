public class Contador {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Você deve fornecer exatamente dois números inteiros como argumentos.");
            return;
        }

        try {
            int numero1 = Integer.parseInt(args[0]);
            int numero2 = Integer.parseInt(args[1]);

            if (numero1 > numero2) {
                throw new ParametrosInvalidosException();
            }

            for (int i = numero1; i <= numero2; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (NumberFormatException e) {
            System.out.println("Certifique-se de que os parâmetros fornecidos sejam números inteiros.");
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
}
