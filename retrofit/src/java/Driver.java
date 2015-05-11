import java.util.List;
import retrofit.RestAdapter;

public class Driver{
    public static void main(String[] args){
        System.err.println("Hello Retrofit!");
        
        //RANDOMUSERGENERATOR
        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint("http://jsonplaceholder.typicode.com/").build();
        FakeDataService fakeStore = restAdapter.create(FakeDataService.class);
        
        //users
        List<User> users = fakeStore.getUsers();
        System.out.println("People\t\t-->");
        for (User user : users){
            System.out.println(user.name+" works at "+user.company.name);
        }
        System.out.println();
        
        //comments
        System.out.println("Comments\t\t-->");
        List<Comment> comments = fakeStore.getComments();
         for (Comment comment : comments){
            System.out.println(comment.name);
            System.out.println("\t\t\t-"+comment.email);
        }
    }
}