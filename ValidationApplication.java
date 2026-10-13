public class ValidationApplication {

    public static void main(String[] args) {

        String curp = "GODE561231HDFRRN09";

        ValidationResult result =
                validateCurp(curp);

        System.out.println(result);
    }

    public static ValidationResult validateCurp(String curp) {

        boolean valid = curp.length() == 18;

        return new ValidationResult(
                "NUBARIUM",
                valid,
                200
        );
    }

}