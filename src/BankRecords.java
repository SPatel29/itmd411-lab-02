import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class BankRecords extends Client{
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

    //below are the abstract methods from Abstract Client class
    //all abstract methods must be overrided.
    @Override
    public void read_data(){
        try{
            File file = new File("../bank-Detail(1).csv");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String[] temp_arr;
            while ((line = br.readLine()) != null){
                temp_arr = line.split(","); //temp_arr is an array of strings

                lst.add(temp_arr[0]);   // id
                lst.add(temp_arr[1]);   // age
                lst.add(temp_arr[2]);   // sex
                lst.add(temp_arr[3]);   // region
                lst.add(temp_arr[4]);   // income
                lst.add(temp_arr[5]);   // married
                lst.add(temp_arr[6]);   // children
                lst.add(temp_arr[7]);   // car
                lst.add(temp_arr[8]);   // save_act
                lst.add(temp_arr[9]);  // current_act
                lst.add(temp_arr[10]);  // mortgage
                lst.add(temp_arr[11]);  // set_prep

            }
        }catch (Exception e){
            System.out.println("File unsuccesfully read");
        }
    }

    @Override
    public void process_data() {
        int count = 0;
        BankRecords temp_obj = new BankRecords();
        for (int i =0; i < lst.size(); i+=12){      //adding by 12 each increment b/c that is offset till next id
            temp_obj.set_id(lst.get(i));
            temp_obj.set_age(Integer.parseInt(lst.get(i + 1))); //need to make into int because age is int
            temp_obj.set_sex(lst.get(i + 2));
            temp_obj.set_region(lst.get(i + 3));
            temp_obj.set_income(Integer.parseInt(lst.get(i + 4)));
            temp_obj.set_married(lst.get(i + 5));
            temp_obj.set_children(Integer.parseInt(lst.get(i + 6)));
            temp_obj.set_car(lst.get(i + 7));
            temp_obj.set_save_act(lst.get(i + 8));
            temp_obj.set_current_act(lst.get(i + 9));
            temp_obj.set_mortgage(lst.get(i + 10));
            temp_obj.set_prep(lst.get(i + 11));
            records[count] = temp_obj;  //adding the temporary object into the records array which holds BankRecords object
            count += 1;
        }
    }

    @Override
    public void print_data() {

    }


}
