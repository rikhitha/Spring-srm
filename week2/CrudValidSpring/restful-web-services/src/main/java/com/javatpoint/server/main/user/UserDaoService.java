package com.javatpoint.server.main.user;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.springframework.stereotype.Component;
@Component
public class UserDaoService 
{
public static int usersCount=5;

private static List<User> users=new ArrayList<>();
 
static
{

users.add(new User(1, "John", new Date()));
users.add(new User(2, "Robert", new Date()));
users.add(new User(3, "Adam", new Date()));
users.add(new User(4, "Andrew", new Date()));
users.add(new User(5, "Jack", new Date()));
}

public List<User> findAll()
{
return users;
}

public User save(User user)
{
if(user.getId()==null)
{
user.setId(++usersCount);
}
users.add(user);
return user;
}

public User findOne(int id)
{
for(User user:users)
{
if(user.getId()==id)
return user;
}
return null;
}

public User deleteById(int id)
{
Iterator<User> iterator = users.iterator();
while(iterator.hasNext())
{
User user=iterator.next();
if(user.getId()==id)
{
iterator.remove();
return user; 
}
}
return null;
}
}