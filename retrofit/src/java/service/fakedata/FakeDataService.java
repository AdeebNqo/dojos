import java.util.List;
import retrofit.http.GET;

public interface FakeDataService{
    @GET("/users")
  List<User> getUsers();
    
    @GET("/comments")
    List<Comment> getComments();
}