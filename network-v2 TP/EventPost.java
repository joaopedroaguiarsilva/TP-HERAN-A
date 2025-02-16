
/**
 * Escreva uma descrição da classe EventPost aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class EventPost extends Post
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String eventType;
    private String eventText;

    /**
     * Construtor para objetos da classe EventPost
     */
    public EventPost(String author, String eventType, String eventText)
    {
        super(author);
        this.eventType = eventType;
        this.eventText = eventText;
    }

    public String getEventType()
    {
        return eventType;
    }
    
    public void printShortSummaryEvent()
    {
        System.out.println("Event post from " + super.getUserName());
    }
    
    @Override
    public void display()
    {
        super.display();
        
        System.out.println("Take a look!");
        System.out.println(eventText);
        
        System.out.println(" ");
        System.out.println(" ");
    }
}
