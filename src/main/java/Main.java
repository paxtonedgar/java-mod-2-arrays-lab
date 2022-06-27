import java.util.*; 
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    ArrayList<String> people = new ArrayList<String>();
    
    for(int i=0; i<10; i++){
        System.out.println("Enter a name"); 
        String name = sc.nextLine();
        name = name.toString(); 
        people.add(name);   
    }
    System.out.println(); 
    people.forEach(System.out::println);

    
    }
}
