package blogpost;

public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    // option for constructor

    public BlogPost(String authorName, String title, String text, String publicationDate) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "BlogPost{" +
                "authorName='" + authorName + '\n' +
                ", title='" + title + '\n' +
                ", text='" + text + '\n' +
                ", publicationDate='" + publicationDate + '\n' +
                '}';
    }
}
