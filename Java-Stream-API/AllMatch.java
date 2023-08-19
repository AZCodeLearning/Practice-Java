import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String args[]){

        List<employee> employeeList = new ArrayList<>();

        employeeList.add(new employee("John", "Addams", "USA",101013L));
        employeeList.add(new employee("Jack", "Doe","Canada", 101067L));
        employeeList.add(new employee("Paul", "Kent", "Canada", 101007L));
        employeeList.add(new employee("Mary", "Warren", "France",101043L));
        employeeList.add(new employee("Vickie", "Newton","France", 101097L));
        employeeList.add(new employee("Debra", "Miles", "Germany", 101045L));


        System.out.println("print out country matching Canada");
        boolean result = employeeList.stream().map(p->p.getCountryOfResidence())
              .allMatch(e -> e.equals("Canada"));

        System.out.println(result);

        System.out.println("print out country matching India");
        result = employeeList.stream().map(p->p.getCountryOfResidence())
                .allMatch(p -> p.toLowerCase().equals("India"));

        System.out.println(result);
        

    }
}

class employee{
    private String firstName;
    private String lastName;
    private String countryOfResidence;
    private Long employeeId;

    // default constructor
    public employee(String name, String lastName, String countryOfResidence, Long employeeId){
        this.firstName=name;
        this.lastName=lastName;
        this.countryOfResidence=countryOfResidence;
        this.employeeId= employeeId;

    }
    public String getCountryOfResidence(){
        return countryOfResidence;
    }

}
