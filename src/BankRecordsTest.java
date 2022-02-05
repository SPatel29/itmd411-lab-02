public class BankRecordsTest {
    public static void main(String[] args){
        BankRecords bank = new BankRecords();
        bank.read_data();
        bank.process_data();
        bank.print_data();
    }
}
