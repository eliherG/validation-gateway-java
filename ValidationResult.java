public record ValidationResult(
        String provider,
        boolean valid,
        int statusCode
) {
}