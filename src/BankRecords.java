import java.util.ArrayList;

public class BankRecords {
    private BankRecords[] records = new BankRecords[600];   //holds 600 BankRecords objects
    private ArrayList<String> lst = new ArrayList<>();
    private String id;
    private int age;
    private String sex;
    private String region;
    private double income;
    private String married;
    private int children;
    private String car;
    private String save_act;
    private String current_act;
    private String mortgage;
    private String prep;


    public String get_id() {return id;}
    public int get_age() {return age;}
    public String get_sex() {return sex;}
    public String get_region() {return region;}
    public double get_income() {return income;}
    public String get_married() {return married;}
    public int get_children() {return children;}
    public String get_Car() {return car;}
    public String save_act() {return save_act;}
    public String getCurrent_act() {return current_act;}
    public String get_mortgage() {return mortgage;}
    public String get_prep() {return prep;}

    public void set_id(String new_id) {id = new_id;}
    public void set_age(int new_age) {age = new_age;}
    public void set_sex(String new_sex) {sex = new_sex;}
    public void set_region(String new_region) {region = new_region;}
    public void set_income(double new_income) {income = new_income;}
    public void set_married(String new_married) {married = new_married;}
    public void set_children(int new_children) {children = new_children;}
    public void set_car(String new_car) {car = new_car;}
    public void set_save_act(String new_save_act) {save_act = new_save_act;}
    public void set_current_act(String new_current_act) {current_act = new_current_act;}
    public void set_mortgage(String new_mortgage) {mortgage = new_mortgage;}
    public void set_prep(String new_prep) {prep = new_prep;}

}
