import com.nuc.domain.User;
import org.junit.Test;
import redis.clients.jedis.Jedis;

public class Test1 {

    /**
     * jedis的简单使用
     */
    @Test
    public void testSimple() {
        Jedis jedis = new Jedis("172.16.84.66",6379);
        jedis.auth("123456");
        String nameValue = jedis.get("name");
        System.out.println(nameValue);

        jedis.set("age","20");


    }


    @Test
    public void testSimple2() {
        Jedis jedis = new Jedis("172.16.84.66",6379);
        jedis.auth("123456");

        User user1 = new User("kobi",40,"nan");
        User user2 = new User("james",30,"nan");
        User user3 = new User("libingbing",20,"nv");

        jedis.hset("user1","name","lisi");
        String lname =  jedis.hget("user1","name");
        System.out.println(lname);

    }
}
