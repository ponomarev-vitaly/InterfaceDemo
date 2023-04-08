public interface Telephone {
    // Methods we gonna create in this interface:
    // powerOn
    // dial a number
    // answer phone call
    // call another phone
    // is ringing OR not
    void powerOn();
    void dial(String phoneNumber);
    void answer();
    boolean callPhone(String phoneNumber);
    boolean isRinging();
}
