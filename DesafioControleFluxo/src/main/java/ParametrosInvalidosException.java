public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException(int primeiro, int segundo) throws ParametrosInvalidosException {

        if (primeiro > segundo) {
            throw new ParametrosInvalidosException();
        }
    }

    public ParametrosInvalidosException() {
        System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    }
}