import java.util.ArrayList;

/**
 * This class stores information about a post in a social network news feed. 
 * The main part of the post consists of a (possibly multi-line)
 * text message. Other data, such as author and time, are also stored.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 0.2
 */
public class MessagePost extends CommentedPost
{
    private String message;  // an arbitrarily long, multi-line message

    /**
     * Constructor for objects of class MessagePost.
     * 
     * @param author    The username of the author of this post.
     * @param text      The text of this post.
     */
    public MessagePost(String author, String text)
    {
        super(author);
        message = text;
    }

    /**
     * Return the text of this post.
     * 
     * @return The post's message text.
     */
    public String getText()
    {
        return message;
    }
    
    public void printShortSummary()
    {
        System.out.println("Message post from " + super.getUserName());
    }
    
    @Override
    public void display()
    {
        super.display();
        
        System.out.println(message);
        
        if(likes > 0) {
            System.out.println("  -  " + likes + " people like this.");
        }
        else {
            System.out.println();
        }
        
        if(comments.isEmpty()) {
            System.out.println("   No comments.");
        }
        else {
            System.out.println("   " + comments.size() + " comment(s). Click here to view.");
        }
        
        System.out.println(" ");
        System.out.println(" ");
    }
}
