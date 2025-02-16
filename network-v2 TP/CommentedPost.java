import java.util.ArrayList;
/**
 * Escreva uma descrição da classe CommentedPost aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class CommentedPost extends Post
{
    protected int likes;
    protected ArrayList<String> comments;

    /**
     * Construtor para objetos da classe CommentedPost
     */
    public CommentedPost(String author)
    {
        super(author);
        likes = 0;
        comments = new ArrayList<>();
    }

    /**
     * Record one more 'Like' indication from a user.
     */
    public void like()
    {
        likes++;
    }

    /**
     * Record that a user has withdrawn his/her 'Like' vote.
     */
    public void unlike()
    {
        if (likes > 0) {
            likes--;
        }
    }

    /**
     * Add a comment to this post.
     * 
     * @param text  The new comment to add.
     */
    public void addComment(String text)
    {
        comments.add(text);
    }
    
    @Override
    public void display()
    {
        super.display();
    
    }
}
