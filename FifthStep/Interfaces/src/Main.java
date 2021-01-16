public class Main {
    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(12345);

        ITelephone fathilPhone;
        fathilPhone = new MobilePhone(123123);

        timsPhone.callPhone(12345);
        timsPhone.answer();
        fathilPhone.callPhone(123123);
        fathilPhone.answer();
    }
}
