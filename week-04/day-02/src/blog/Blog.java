package blog;

import java.util.ArrayList;
import java.util.List;

public class Blog {

    List<BlogPost> blogPosts = new ArrayList<>();

    public void addBlog(BlogPost blogPost) {
        blogPosts.add(blogPost);
    }


    public void update(int number, BlogPost blogPost) {
        blogPosts.set(number, blogPost);
    }


    public void delete(int i) {
        blogPosts.remove(i);

    }

}

