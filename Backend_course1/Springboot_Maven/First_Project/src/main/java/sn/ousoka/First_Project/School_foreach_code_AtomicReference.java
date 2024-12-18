class AtomicReference {
    private String value;

    public AtomicReference(String initialValue) {
        this.value = initialValue;
    }

    public String get() {
        return value;
    }

    public void set(String value) {
        this.value = value;
    }

    public void append(String additionalValue) {
        // Concatenate the current value with the additional value
        this.value = this.value + " " + additionalValue;
    }
}
