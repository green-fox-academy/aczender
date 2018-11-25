package blog;

public class Main {
    public static void main(String[] args) {


        BlogPost post1 = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04.");

        BlogPost post2 = new BlogPost("Tim Urban", "Wait but why", "2010.10.10.", "A popular long-form, stick-figure-illustrated blog about almost everything.");

        Blog newBlog = new Blog();

        newBlog.addBlog(post1);
        newBlog.addBlog(post2);

        System.out.println(newBlog.blogPosts.get(0).text);
        System.out.println(newBlog.blogPosts.get(1).authorName);

    }

}
